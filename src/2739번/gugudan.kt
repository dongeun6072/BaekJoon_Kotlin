package `2739번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    for(i in 1..9){
        println("$num * $i = ${num*i}")
    }
}