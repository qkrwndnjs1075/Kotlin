package org.example

fun main(){

    val list = listOf(Data("보영",232),
                        Data("루다",304))

    for((a,b) in list ){
        println("${a}, ${b}")
    }
}

class General(val name: String, val id: Int)

data class Data(val name: String, val id: Int)