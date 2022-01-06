package `2443번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()

    for(i in num downTo 1){
        for(j in i until num){
            print(" ")
        }
        for(k in i*2-1 downTo 1){
            print("*")
        }
        println("")
    }
}