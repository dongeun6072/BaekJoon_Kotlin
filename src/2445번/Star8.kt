package `2445번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() {
    val n = readLine()!!.toInt()
    val sb = StringBuilder()
    for(i in 0 until n*2-1){
        for(j in 0 until n*2){
            if(i<n){
                when{
                    j <= i -> sb.append("*")
                    j >= n * 2 - i -1 -> sb.append("*")
                    else -> sb.append(" ")
                }
            }
            else{
                when{
                    j < n * 2 - i - 1 -> sb.append("*")
                    j > n*2 - (n * 2 -i) -> sb.append("*")
                    else -> sb.append(" ")
                }
            }
        }
        sb.append("\n")
    }
    println(sb.toString())
}