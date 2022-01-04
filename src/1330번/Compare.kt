package `1330번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())

    val a = Integer.parseInt(token.nextToken())
    val b = Integer.parseInt(token.nextToken())

   print( //코틀린의  when 구문
       when{
           a > b -> ">"
           a < b -> "<"
           else -> "=="
       }
   )

}
