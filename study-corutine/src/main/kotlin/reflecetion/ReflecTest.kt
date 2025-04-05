//package org.example.reflecetion
//
//import kotlin.reflect.KClass
//
//class ReflecTest(
//    private val first : Int
//) {
//
//    private val immutableSecret: Int =2
//
//    private var mutableSecret: Int =3
//
//    fun make(second: Int): Int {
//        return first + second
//    }
//    private fun secretMake(): Int{
//        return immutableSecret + mutableSecret
//    }
//}
//
//
//var reflecTest = ReflecTest(5)
//val kClass: KClass<out ReflecTest> = ReflecTest::class
//
//val kClass: KClass<ReflecTest> = ReflecTest::class
//
//val kClass: KClass<ReflecTest> = ReflecTest::class
//val primaryConstructor = kClass.primaryConstructor
//val call = primaryConstructor?.call(5)
//
//println("call?.first = ${call?.first}") // call?.first = 5
//println("call = ${call!!}")
