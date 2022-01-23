package `1920번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*
import kotlin.collections.HashSet

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var token = StringTokenizer(br.readLine())
    val set = HashSet<Int>()

    repeat(n){
        set.add(token.nextToken().toInt())
    }

    val m = br.readLine().toInt()
    val sb = StringBuilder()
    token = StringTokenizer(br.readLine())
    repeat(m){
        val result = if(set.contains(token.nextToken().toInt()))  1 else 0
        sb.append("$result\n")
    }

    println(sb)

}