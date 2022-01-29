package `11866번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val queue : Queue<Int> = LinkedList()
    val sb = StringBuffer("<")

    for(i in 1..a){
        queue.add(i)
    }

    while (!queue.isEmpty()){

        for(i in 0 until b-1){
            queue.offer(queue.poll())
        }

        if(queue.size == 1) sb.append("${queue.poll()}>")
        else sb.append("${queue.poll()}, ")

    }

    println(sb)
}