package `2920번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.nio.Buffer
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val stk = StringTokenizer(br.readLine())
    var verF: Int = 0

    while(stk.hasMoreTokens()){
        var now = stk.nextToken().toInt()
        if(verF == 0){
            verF = now
        } else {
             if(verF + 1 == now ){
                 verF = now
             }
            else if(verF - 1 == now){
                 verF = now
             }
            else{
                 verF = 2
                 break
             }
        }
    }

    if(verF == 8){
        println("ascending")
    } else if (verF == 1){
        println("descending")
    } else{
        println("mixed")
    }


}