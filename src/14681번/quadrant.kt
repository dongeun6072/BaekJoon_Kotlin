package `14681번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val x = br.readLine().toInt()
    val y = br.readLine().toInt()
    br.close()

    print(
        when{
        x>0 -> if(y>0) 1 else 4
        else -> if(y>0) 2 else 3
        }
    )
     //when 이용하는것도 가능하다.
//    if ( x>0 && y >0) println("1")
//    else if (x<0 && y>0) println("2")
//    else if (x<0 && y<0) println("3")
//    else println("4")
}