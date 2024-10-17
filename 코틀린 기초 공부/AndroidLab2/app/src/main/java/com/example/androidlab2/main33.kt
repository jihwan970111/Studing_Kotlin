// 제한시간 내에 실행되면 결과값을 아닌 경우 null을 반환하는 withTimeoutOrNull()함수
// 이것은 괄호 안에 밀리세컨드 단위의 타임아웃 시간을 정해두고
// 중괄호 안에 코루틴 구문들을 만든 후 그 결과값을 받는 형태로 사용한다
// 이 함수도 join()이나 await()처럼 blocking 함수라는 점도 기억하라
import kotlinx.coroutines.*
fun main(){
    runBlocking {
        var result = withTimeoutOrNull(50){
            for(i in 1..10){
                println(i)
                delay(10)
            }
            "Finish"
        }
        println(result)
    }
}