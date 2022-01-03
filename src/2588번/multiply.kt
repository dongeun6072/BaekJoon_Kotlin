package `2588번`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num1 = br.readLine().toInt()
    val num2 = br.readLine().toInt()

    val answer1 = num1 * (num2 % 10)
    val answer2 = (num1 * (num2 % 100 - num2 % 10)) / 10
    val answer3 = num1 * (num2 / 100)
    val answer4 = num1 * num2

    print("$answer1\n$answer2\n$answer3\n$answer4")


//    val sc = Scanner(System.`in`)
//    val a = sc.nextInt()
//    val b = sc.nextInt()
//
//    println(a * (b % 10))
//    println(a * ((b % 100) / 10))
//    println(a * (b / 100))
//    println(a*b)


}