package `2753번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val numYear = br.readLine().toInt()
    println(if (numYear % 4 == 0 && (numYear % 100 != 0 || numYear % 400 == 0)) 1 else 0)
}