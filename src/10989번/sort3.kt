package `10989번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main()  {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    val num = br.readLine().toInt()

    val list = IntArray(num)

    for(i in 0 until num){
        list[i] = br.readLine().toInt()
    }

    br.close()
    list.sort()

    for(i in 0 until num){
        bw.write(list[i].toString())
        bw.newLine()
    }

    bw.flush()
    bw.close()
}