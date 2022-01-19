package `10814번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()

    val list = arrayListOf<Pair<Int,String>>()

    repeat(num){
        val token = StringTokenizer(br.readLine())
        var a = token.nextToken().toInt()
        var b = token.nextToken().toString()
        list.add(Pair(a,b))
    }

    var sortList = list.sortedWith(compareBy({it.first}))

    for(i in 0 until num){
        println("${sortList[i].first} ${sortList[i].second}")
    }


}