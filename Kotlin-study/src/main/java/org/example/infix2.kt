package org.example

fun main(){

    println(6 multiply 4) // 왼쪽이 this 우측이 패터미터인 x에 해당한다.

    println(6.multiply(4))

}
infix fun Int.multiply(x:Int): Int = this * x