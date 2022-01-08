package `1712번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val str = StringTokenizer(br.readLine())
    var a = str.nextToken().toInt()
    var b = str.nextToken().toInt()
    var c = str.nextToken().toInt()

    var sum : Int = 0
    var count : Int = 0

    while (true){
        a = 0 + b
        c += c
        count++
        if(c > a) break
    }

    println(count)
}