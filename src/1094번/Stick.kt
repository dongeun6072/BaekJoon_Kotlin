package `1094번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var stick : Int = 64
    var num = br.readLine().toInt()
    var count : Int = 0

    while (num > 0){

        if(stick > num){
            stick /= 2
        } else {
            count++
            num -= stick
        }
    }

    println(count)
}