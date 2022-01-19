package `2609번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    var a = token.nextToken().toInt()
    var b = token.nextToken().toInt()
    var maxCommon : Int = 1;
    var i : Int = 1

    while (true){
        i++


        if((a % i == 0) && (b % i == 0)){
            maxCommon *= i
            a /= i
            b /= i

            i = 1
        } else if(i>9999){
            break
        }



    }

    println(maxCommon)
    println(maxCommon*a*b)
}