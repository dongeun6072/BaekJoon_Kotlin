package `1292번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    var sum = 0

    for(i in a+1 until b){
       sum += i
    }
    println(sum)
}