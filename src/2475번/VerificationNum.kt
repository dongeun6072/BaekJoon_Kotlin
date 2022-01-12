package `2475번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val line = readLine()
    //println(line)
    val numbers = line!!.split(" ")
    var result = 0

    for(rawNumber in numbers){
        var number = rawNumber.toInt()
        result += number * number
    }

    println(result % 10)
}