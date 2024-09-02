package org.example

fun main(){

    var a = Person("박보영", 1990)
    var b = Person("박보", 1990)
    var c = Person("박", 1990)

    var d = Person("이루다")
    var e = Person("이루")
    var f = Person("이")


}

class Person(var name :String, val birthYear:Int){
    init{
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
    }
    constructor(name: String) : this(name, 1997){
        println("보조 생성자가 사용되었습니다")
    }
}