package `1037번`

import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val a = br.readLine().split(" ").map { it.toInt() }
    var min = Int.MAX_VALUE
    var max : Int = Int.MIN_VALUE

    for(i in 0 until n){

        if(min > a[i]){
            min = a[i]
        }

        if(max < a[i]){
            max = a[i]
        }

    }

    println(min*max)
}