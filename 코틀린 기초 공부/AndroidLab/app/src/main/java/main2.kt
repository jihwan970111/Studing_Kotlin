fun main() {
    // 조건문
    var a = 7
    if (a > 10){
        println("a는 10보다 크다")
    }else if(a == 10){
        println("a는 10이다")
    }else{
        println("a는 10보다 작다")
    }
    // when
    doWhen(1)
    doWhen("DiMo")
    doWhen(12L)
    doWhen(3.14159)
    doWhen("Kotlin")
}
//// Any는 어떤 자료형이든 변환이 되는 코틀린의 최상위 자료형이다.
//fun doWhen(a:Any){
//    when(a) {
//        1 -> println("정수 1입니다")
//        "DiMo" -> println("디모의 코틀린 강좌입니다")
//        is Long -> println("Long 타입 입니다")
//        !is String -> println("String 타입이 아닙니다")
//        else -> println("어떤 조건도 만족하지 않습니다")
//    }
//}

// 이렇게 표현하게 되면 when조건이 맞아 떨어질 때 이 결과를 retrun시켜 변수에 할당 시켜줄 수 있다.
fun doWhen(a:Any){
    var result = when(a) {
        1 -> "정수 1입니다"
        "DiMo" -> "디모의 코틀린 강좌입니다"
        is Long -> "Long 타입 입니다"
        !is String -> "String 타입이 아닙니다"
        else -> "어떤 조건도 만족하지 않습니다"
    }
    println(result)
}