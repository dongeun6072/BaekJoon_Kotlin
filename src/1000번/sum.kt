package `1000번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    println(Integer.parseInt(token.nextToken())+ Integer.parseInt(token.nextToken()))
    br.close() //StringTokenizer 이건 문자열을 토근화한다 공백의 문자열을 쪼개는 것으로 알 수 있다.
}