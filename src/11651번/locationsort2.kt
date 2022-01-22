package `11651번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    val N = br.readLine().toInt()
    val points = Array<Pair<Int, Int>>(N){
        val (x, y) = br.readLine().split(" ")
        Pair(x.toInt(),y.toInt())
    }

    points.sortWith(compareBy<Pair<Int,Int>> {it.second}.thenBy {it.first})
    points.forEach {
        bw.write("${it.first} ${it.second}\n")
    }

    bw.flush()
    bw.close()
}