import kotlinx.coroutines.*
import kotlin.random.Random

suspend fun printRandom1() {
    delay(1000L)
    println(Random.nextInt(0, 500))
}

suspend fun printRandom2() {
    delay(500L)
    throw ArithmeticException()
}

val ceh = CoroutineExceptionHandler { _, exception ->
    println("Something happend: $exception")
}

suspend fun supervisedFunc() = supervisorScope {
    launch { printRandom1() }
    launch(ceh) { printRandom2() }
}

fun main() = runBlocking<Unit> {
    val scope = CoroutineScope(Dispatchers.IO)
    val job = scope.launch {
        supervisedFunc()
    }
    job.join()
}
