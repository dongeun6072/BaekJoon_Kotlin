package `1874번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val stack:Stack<Int> = Stack()
    val charArr = mutableListOf<Char>()
    val num = br.readLine().toInt()

    var next = br.readLine().toInt()
    var count = 1

    for(i in 1..num){
        stack.push(i)
        charArr.add('+')

        while (next == stack.peek()){
            stack.pop()
            charArr.add('-')

            if (count < num) {
                next = br.readLine().toInt()
                count++
            }

            if (stack.isEmpty()) break
        }
    }

    if (stack.isNotEmpty()) println("NO")
    else println(charArr.joinToString("\n"))
}