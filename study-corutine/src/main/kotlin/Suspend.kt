package org.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun coding() {
    println("코딩하기")
    delay(100)
}

suspend fun eat() {
    println("밥을 먹는다.")
    delay(100)
}

fun main() = runBlocking {
    println("아침에 일어난다")
    eat()
    coding()
    eat()
    coding()
    eat()
    coding()
    println("잠을 잔다.")
}