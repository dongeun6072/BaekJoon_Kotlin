package `1181번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    val words = mutableListOf<String>()

    repeat(num) {
        val str = br.readLine()
        if(!words.contains(str)){
            words.add(str)
        }
    }

    val sorted = words.sortedWith(compareBy({it.length},{it}))

    sorted.forEach{
        println("$it")
    }

}


