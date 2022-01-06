package `10950번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()

    for(i in 1..num){ // until을 사용할 수 있다..!
        val token = StringTokenizer(br.readLine())
        val a = Integer.parseInt(token.nextToken())
        val b = Integer.parseInt(token.nextToken())
        println("${a+b}")
    }
}