// 비동기로 여러개의 루틴을 동시에 처리할 수 있는 방법

// 코루틴은 메인이 되는 루틴과 별도로 진행이 가능한 루틴으로
// 개발자가 루틴의 실행과 종료를 마음대로 제어할 수 있는 단위이다.
// 코루틴을 사용할 때는 kotiln extension에 코루틴 패키지를 모두 import 해야한다.
// 코루틴은 제어범위 및 실행범위를 지정할 수 있다. 이를 Scope라고 한다.
// 기본적으로 GlobalScope와 CoroutineScope지원한다.
// GlobalScope는 프로그램의 어디서나 제어, 동작이 가능한 코루틴의 범위이며
// CoroutinScope는 특정한 목적의 Dispatcher를 지정하여 제어 및 동작이 가능한 새로운 코루틴의 범위를 생성하게 된다.
// Coroutine Scope에 사용할 수 있는 dispatcher
// Dispatchers.Default는 백그라운드에서 동작하는 dispatcher고
// Dispatchers.IO는 네트워크나 디스크 등 I/O에 사용하는 dispatcher이다
// Dispathcers.Main은 메인 스레드에서 함께 동작하는 dispatcher이다.
// 이러한 Dispatcher들은 모든 플랫폼에서 지원되지는 않으니 지원되는 플랫폼에 따라서 사용해야한다.
// 코루틴은 이러한 Scope에서 제어되도록 생성될 수 있는데, 생성된 Scope에서
// lauch나 async라는 함수를 통해 새로운 코루틴을 생성할 수 있따.
// launch와 async의 차이는 코루틴에서의 반환값이 있는지의 여부이다
// launch는 반환값이 없는 Job이 객체 async는 반환값이 있는 Deffered 객체를 반환한다.
// launch 또는 async는 모두 람다 함수의 현태를 가지고 있으며
// 그렇기 때문에 async는 마지막 구문에 실행 결과가 반환됨을 기억해야한다.
import kotlinx.coroutines.*
fun main(){
    val scope = GlobalScope
    // 아무런 결과가 나오지 않는다
    // 코루틴은 제어되는 스코프 또는 프로그램 전체가 종료되면 함께 종료되기 때문에
    // 코루틴이 끝까지 실행되는 것이 보장하려면 일정한 범위에서 코루틴이 모두 실행될 때까지
    // 잠시 기다려주어야한다
    // 우리가 테스트하는 루틴의 경우 main()함수 단 하나이기 때문에
    // 프로세스가 거의 '실행 동시' 종료됨으로
    // 코루틴도 동작하지 못한것이다.
    // 이럴때는 runBlocking 블럭을 만들고 이 안에서 launch나 async를 직접 생성하면
    // 코루틴이 종료될 때 까지 메인 루튼을 잠시 대기 시켜준다.
    // 주의 할 점은 안드로이드에서는 메인 스레드에서 runBlocking을 걸어주면
    // 일정 시간 이상 응답이 없는 경우 ANR(Application Not Responding)이 발생하며
    // 앱이 강제 종료된다는 점을 유의하라
    scope.launch {
        for(i in 1..5)
        {
            println(i)
        }
    }
}