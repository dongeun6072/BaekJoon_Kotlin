package `10818번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    val str = StringTokenizer(br.readLine())
    var min: Int = 1000000
    var max: Int = -1000000

    for(i in 1..num){
        var a = str.nextToken().toInt()
        if (a > max) max = a
        if (a < min) min = a
    }

    println("${min} ${max}")




}