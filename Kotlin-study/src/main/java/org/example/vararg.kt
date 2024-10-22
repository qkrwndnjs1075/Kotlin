package org.example

fun main(){
    sum(1,2,3,4) // 개수가 지정되지 않은 패러미터
}
fun sum(vararg number: Int){ // 맨 마지막에 써야함 !
    var sum = 0

    for(n in number){
        sum += n
    }
    print(sum)
}