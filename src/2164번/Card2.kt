package `2164번`

import java.util.*

fun main() {
    val n = readLine()!!.toInt()
    val que: Queue<Int> = LinkedList()
    repeat(n){
        que.add(it+1)
    }

    while (que.size != 1){
        que.poll()
        que.add(que.poll())
    }

    println(que.poll())


}