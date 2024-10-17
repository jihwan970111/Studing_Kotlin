// null 값을 처리하는 방법? 동일한지를 확인하는 방법
fun main() {
    // ?.  null safe operate         : 먼저 객체가 null인지 확인부터 하고객체가 null이라면 뒤따라오는 구문을 실행하지 않는 연산자이다.
    // ?:  elvis operate             : 객체가 null이 아니라면 그대로 사용하지만 null이라면 연산자 우측의 객체고 대체되는 연산자이다.
    // !!. non-null assertion operate: 참조연산자를 사용할 때 null 여부를 컴파일시 확인하지 않도록 하여 런타임시 null pointer exception이 나도록 의도적으로 방치하는 연산자이다.

//    var a: String? = null

//    println(a?.toUpperCase())
//
//    println(a?:"default".toUpperCase())
//
//    println(a!!.toUpperCase())

    var a: String? = "Kotlin Exam"
    a?.run{
       println(toUpperCase())
       println(toLowerCase())
    }
}