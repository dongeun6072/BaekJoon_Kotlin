package `10773번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val stack : Stack<Int> = Stack()

    var sum : Int = 0

    repeat(n){
        val a = br.readLine().toInt()
        if(a == 0){
            stack.pop()
        } else {
            stack.push(a)
        }
    }

    
    while (!stack.isEmpty()){
        sum += stack.pop()
    }

    println(sum)
}