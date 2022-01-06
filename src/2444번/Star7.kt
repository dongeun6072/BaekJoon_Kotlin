package `2444번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()

    for (i in 1..num * 2 - 1) {
        if (num >= i) {
            for (j in i + 1..num) {
                print(" ")
            }
            for (j in 1..i * 2 - 1) { //until을 사용해서 i * 2로 표현할 수 있다 !
                print("*")
            }
            println("")
        } else{
            for(j in num until i){
                print(" ")
            }
            for (k in i until num*2+(num*2-1)-i){
                print("*")
            }
            println("")
        }
    }
}