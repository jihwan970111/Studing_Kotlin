import kotlinx.coroutines.*
// 루틴의 대기를 위한 추가적인 함수들도 있는데
// delay, join, await이다
// delay는 milisecond 단위로 루틴을 잠시 대기시키는 함수
// join은 Job, await는 Deferred객체에서 호출하여
// 해당 객체의 루틴이 모두 실행 될 때 까지 기다려주는 역할을 하게된다.
// 또한 await는 Deferred 객체의 결과값을 반환해주는 함수이기도 하다.
// 세함수들은 코루틴 내부 또는 runBlocking{}과 같은 루틴의 대기가 가능한
// 구문 안에서만 동작이 가능하다.
fun main(){
    runBlocking {
        val a = launch {
            for(i in 1..5)
            {
                println(i)
                delay(10)
            }
        }

        val b = async {
            "async 종료"
        }
        println("async 대기")
        println(b.await())

//        println("launch 대기")
//        a.join()
        // 코루틴 실행 도중에 중단하는 방법은 바로 cancle()함수
        // 코루틴에 cancle을 걸어주면 다음 두 가지 조건이 발생하며
        // 코루틴을 중단시킬 수 있다.
        // 하나는 코루틴 내부에 delay()함수 또는 yield()함수가 사용된 위치까지 수행된 뒤 종료
        // 다른 하나는 코루틴 내부에서 속성값인 isActive가 false로 변하면 코드로 통해 수동으로 종료하는 방법이 있다.
        println("launch 취소")
        a.cancel()
        println("launch 종료")
    }
}