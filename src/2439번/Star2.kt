package `2439번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()

    for (i in 1..num){
        for (j in num-i downTo 1){
            print(" ")
        }
        for (j in 1..i){
            print("*")
        }
        println("")
    }

}