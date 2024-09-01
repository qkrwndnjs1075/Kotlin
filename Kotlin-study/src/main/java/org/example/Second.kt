package org.example

 fun main(){

     var a = 1234
     var b = 1234L

     var c = 12.45
     var d = 12.45f

     var e = 0xABCD
     var f = 0b010101010

     var g = true
     var h = 'c'

     println(add(5,6,7))

     doWhen(1)
     doWhen("park")
     doWhen("냠냠")


 }

    fun add(a: Int,b:Int,c:Int) = a+b+c


    /*fun add(a: Int, b: Int, c:Int): Int{

        return a + b + c

    }*/

    fun doWhen (a: Any){

        when(a){

            1 -> println("정수 1입니다")
            "park" -> println("박주원입니다")
            is Long -> ("Long 타입 입니다")
            !is String ->("String 타입이 아닙니다")
            else -> println("다 아니다")


        }

    }