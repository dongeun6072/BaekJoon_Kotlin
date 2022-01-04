package `9498번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()

    print(
        when(num){
             in 90..100 -> "A"
             in 80..89 -> "B"
             in 70..79 -> "C"
             in 60..69 -> "D"
             else -> "F"
        }
    )

    br.close()
}