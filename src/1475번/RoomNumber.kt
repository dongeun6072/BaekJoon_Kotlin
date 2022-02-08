package `1475번`

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var n = br.readLine()
    var arr = IntArray(10)

    for(i in n){
        arr[i-'0']++
    }

    println(arr[9])

}