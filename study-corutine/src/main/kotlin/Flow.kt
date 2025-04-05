import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

fun simpleFlow() : Flow<Int> = flow {
    for(i in 1..5){
        delay(500L)
        emit(i)
    }
}

fun main() = runBlocking {
    simpleFlow().collect{value ->
        println("Receive $value")
    }
}