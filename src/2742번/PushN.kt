package `2742번`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    for(i in readLine().toInt() downTo 1) bw.write("$i\n")

    bw.flush()
    bw.close()
    close()
}