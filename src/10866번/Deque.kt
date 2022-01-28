package `10866번`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var num = br.readLine().toInt()
    var dq = ArrayDeque<Int>()

    while(num-->0){
        val tmp = br.readLine().split(" ")
        when(tmp[0]){
            "push_front" -> dq.addFirst(tmp[1].toInt())
            "push_back" -> dq.addLast(tmp[1].toInt())
            "pop_front" -> println(if(dq.isEmpty()) -1 else dq.removeFirst())
            "pop_back" ->  println(if(dq.isEmpty()) -1 else dq.removeLast())
            "size" ->  println(dq.size)
            "empty" -> println(if(dq.isEmpty()) 1 else 0)
            "front" -> println(if(dq.isEmpty()) -1 else dq.first())
            "back" -> println(if(dq.isEmpty()) -1 else dq.last())
        }

    }
}