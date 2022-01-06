package `11021번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    for (num in 1..readLine().toInt()){
        val token = StringTokenizer(readLine())
        val a = Integer.parseInt(token.nextToken())
        val b = Integer.parseInt(token.nextToken())
        println("Case #$num: ${a+b}")
    }
}