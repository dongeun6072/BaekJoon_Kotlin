package `10816번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val comList = arrayListOf<Int>()
    val list = arrayListOf<Int>()
    val res = arrayListOf<Int>()
    var cnt : Int = 0
    val token = StringTokenizer(br.readLine())


    repeat(n){
        val a = token.nextToken().toInt()
        comList.add(a)
    }

    val m = br.readLine().toInt()
    val token1 = StringTokenizer(br.readLine())

    repeat(m){
        val b = token1.nextToken().toInt()
        list.add(b)
    }


    for(i in 0 until list.size){
        for(j in 0 until comList.size){
            if(list[i] == comList[j]){
                cnt++
            }
        }
        res.add(cnt)
        cnt = 0
    }

    res.forEach {
        print("$it ")
    }


}