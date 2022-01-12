package `1157번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine()
    val map = mutableMapOf<Char, Int>()

    str.forEach {
        val char = it.toLowerCase() //zZa -> zza

        if(map.containsKey(char)){
            map[char] = map[char]!!.plus(1)
        }
        else{
            map.set(char,1)
        }
    }

    val max = map.maxByOrNull { it.value } //it 이 머고 value 가 먼데
    if(map.filter { it.value == max!!.value }.count() > 1){
        println("?")
    }
    else{
        println(max!!.key.toUpperCase())
    }

}
