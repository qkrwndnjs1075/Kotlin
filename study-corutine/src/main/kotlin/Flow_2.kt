import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun simpleFlowWithOperators(): Flow<Int> = flow {
    for (i in 1..5) {
        delay(500L)
        emit(i)
    }
}

// 중간 연산자(map, filter) 사용 예제
fun main() = runBlocking {
    simpleFlowWithOperators()
        .filter { it % 2 == 0 }  // 짝수만 필터링
        .map { it * 2 }  // 짝수를 두 배로 변환
        .collect { value ->
            println("Received: $value")
        }
}