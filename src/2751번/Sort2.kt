package `2751번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Collections.sort

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    val N : Int = 1

    val list = mutableListOf<Int>()

    repeat(num){// 시간복잡도 o(n)
        val N  = br.readLine().toInt()
        list.add(N)
    }
    list.sort()

    for (i in 0 until num){
        println(list[i])
    }
}