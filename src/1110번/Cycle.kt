package `1110번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var num = br.readLine().toInt()
    var com : Int = num
    var count: Int = 0

    while (true)
    {
//        if(com < 10){
//             com = (com % 10) * 10 + (com % 10)
//             count++
//             if(com == num) break
//        }
//        else if(com >= 10) {
            com = ((com / 10 + com % 10) % 10) + (com % 10) * 10
            count++
            if(com == num) break

    }

    println(count)
}