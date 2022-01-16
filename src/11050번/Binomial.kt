package `11050번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine());

    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    println(Binomial(n,k))
}


fun Binomial(n : Int, k: Int) :Int{

    return factorial(n) / (factorial(k) * factorial(n-k))
}


fun factorial(n : Int) : Int{

    if(n <= 1){
        return 1
    }

    return n * factorial(n-1)
}