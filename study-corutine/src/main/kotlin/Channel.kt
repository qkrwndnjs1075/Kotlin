import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

fun main(): Unit = runBlocking {
    val channel = Channel<Int>()

    launch {
        for (x in 1..5) {
            println("Sending $x")
            channel.send(x)
            delay(500L)
        }
        channel.close()
    }

    launch {
        for (y in channel) {
            println("Receive $y")
        }
    }
}

