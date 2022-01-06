package `2741번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    for(i in 1..num) println(i) // println의 입출력보다는 BufferedWriter을 사용해야 시간이 엄청
                                // 절약 가능하다고 한다.

}