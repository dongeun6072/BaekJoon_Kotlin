package `4949번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val str = br.readLine()
        if(str == "." ) break

        val stack: Stack<Char> = Stack()

        try {
            str.forEach {
                if(it == '(') stack.push('(')
                else if (it == '[') stack.push('[')
                else if (it == ')'){
                    if(stack.peek() == '(') stack.pop()
                    else throw Exception()
                }
                else if (it == ']'){
                    if(stack.peek() == '[') stack.pop()
                    else throw Exception()
                }
            }
            if(stack.isEmpty()) println("yes")
            else println("no")
        }
        catch (e: Exception) { println("no")}
    }
}