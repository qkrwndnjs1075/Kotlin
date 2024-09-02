package org.example

fun main(){
    for(i in 1..10) {
        if (i == 3) continue
        println(i)
    }

    loop@for(i in 1..10){
        for(j in 1..10){
            if(i == 1 && j == 2) break@loop
            println("i: $i, j: $j")
        }
    }

}