package org.example

fun main(){

    deliveryItem("짬뽕")
    deliveryItem("책", 3)


}
fun deliveryItem(name: String, count: Int = 1, destination: String = "집"){
    println("${name}, ${count}개를 ${destination}에 배달하였습니다.")
}