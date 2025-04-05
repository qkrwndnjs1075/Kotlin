import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*
import kotlinx.coroutines.flow.*

fun channelToFlow(channel: ReceiveChannel<Int>) : Flow<Int> = flow {
    for (value in channel){
        emit(value)
    }
}

fun main(): Unit = runBlocking {
    val channel = Channel<Int>()

    launch {
        for ( i in 1..5){
            println("Sending $i")
            channel.send(i)
            delay(500L)
        }
        channel.close()
    }

    channelToFlow(channel).collect{ value ->
        println("Receive from Flow: $value")
    }
}
