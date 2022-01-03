package `10430번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    val a = Integer.parseInt(token.nextToken())
    val b = Integer.parseInt(token.nextToken())
    val c = Integer.parseInt(token.nextToken())
    println((a+b) % c)
    println(((a%c) +(b%c)) % c)
    println((a*b)%c)
    println(((a%c) * (b%c)) % c)
}