package `10871번`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.*

fun main()  {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st1 = StringTokenizer(br.readLine())
    val st2 = StringTokenizer(br.readLine())
    val n = Integer.parseInt(st1.nextToken()) // 개수
    val x = Integer.parseInt(st1.nextToken()) // 조건
    val sb = StringBuilder() /*이걸 사용할 필요는 없다..
                                이건 문자열 참조 타입으로써
                                 문자열을 이을때 사용한다?
                                 문자열을 추가한다라고 생각.
                                 append의 인자는 String Int Char Boolean
                                 등 다 존재하여 사용 할 수 있다.
                            */

    for(i in 1..n){
        val a = st2.nextToken().toInt()
        if(x > a){
            sb.append(a).append(" ")
        }
    }
    println(sb)
    bw.flush()
}