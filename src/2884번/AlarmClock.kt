package `2884번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    var H = Integer.parseInt(token.nextToken())
    var M = Integer.parseInt(token.nextToken())
    br.close()

    if(H > 0){
        if(M >= 45){
            M = M-45
        } else{
            H = H-1
            M = M+15
        }
    } else if(H == 0){
        if(M >= 45){
            M = M-45
        } else{
            H = 23
            M = M+15
        }
    }

    println("$H $M")

}