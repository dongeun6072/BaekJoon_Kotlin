package `1259번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while(true){
        val str = br.readLine()

        if(str == "0") break

        println(
            if(str == str.reversed()) "yes" else "No"
        )

    }
}