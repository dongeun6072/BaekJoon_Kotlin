package `2292번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    var cnt : Int = 1
    var result = 1

    while(true){
        result += 6*(cnt-1)
        println(result)
        if(result < N){ //19일때
            cnt++
        }
        else
            break

    }

    println(cnt)
}