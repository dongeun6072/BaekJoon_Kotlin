package `8393번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    var total: Int = 0

    for(i in 1..num) {
        total += i
    }

    println("$total")

}