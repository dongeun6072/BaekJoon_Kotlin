package `9012번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var num = br.readLine().toInt()
    val stack: Stack<Char> = Stack()

    repeat(num){
        val str = br.readLine()
        val stack: Stack<Char> = Stack()

        try {
            str.forEach {
                if(it == '(') stack.push('(')

                else if (it == ')'){
                    if(stack.peek() == '(') stack.pop()
                    else throw Exception()
                }
            }
            if(stack.isEmpty()) println("YES")
            else println("NO")
        }
        catch (e:Exception) {
            println("NO")
        }

    }
}