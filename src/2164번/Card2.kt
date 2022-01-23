package `2164번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.nio.Buffer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var num = br.readLine().toInt()
    val list = arrayListOf<Int>()
    for(i in 1..num){
        list.add(i)
    }

    while (true){

        if (num == list.size) {
            list.removeAt(0)
        }

        if(list.size == 1){
            break
        }

        val size = list.size
        var temp = 0
        
        temp = list[0]
        list[0] = list[size-1]
        list[size-1] = temp
        num -= 1
    }

    println(list)
}