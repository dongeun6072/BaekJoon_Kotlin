package `10869번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    val a = Integer.parseInt(token.nextToken())
    val b = Integer.parseInt(token.nextToken())
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)



}