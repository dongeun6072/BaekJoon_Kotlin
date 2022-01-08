package `2562번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var max : Int = 0
    var count : Int = 0

    for(i in 1..9){
        var a = br.readLine().toInt()
        if(a > max) {
            max = a
            count = i
        }
    }

    println("$max\n$count")
}