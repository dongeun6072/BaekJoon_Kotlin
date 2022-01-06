package `2442번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()

    for(i in 1..num){
        for(j in i+1..num){
            print(" ")
        }
        for(j in 1..i*2-1){ //until을 사용해서 i * 2로 표현할 수 있다 !
            print("*")
        }
        println("")
    }
}