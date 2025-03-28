import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.currentTime
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Test


suspend fun suspendFuncA() {
    delay(300)
    println("Hello")
}

suspend fun suspendFuncB() {
    delay(200)
    println("Odooong")
}
@Test
fun main() = runTest {
    val job = launch {
        val childA = launch {
            suspendFuncA()
        }
        val childB = launch {
            suspendFuncB()
        }
    }
    advanceUntilIdle()
    currentTime shouldBe 300
    // output: Odooong Hello
}