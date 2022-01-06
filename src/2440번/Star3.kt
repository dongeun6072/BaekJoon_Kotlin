package `2440번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine().toInt()

    for(i in 1..a){
        for(j in a-i downTo 0){
            print("*")
        }
        println("")
    }
}