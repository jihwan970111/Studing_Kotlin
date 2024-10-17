// 고차함수 람다함수
fun main(){
    // 고차 함수
    b(::a) // 고차 함수 형태로 넘기려면 ::가 붙어야한다
    // 람다 함수
//    val c: (String)->Unit = {str -> println("$str 람다함수")}
    val c = {str:String -> println("$str 람다함수")}
    b(c)
    
}
// 고차함수
fun a (str: String){
    println("$str 함수 a")
}
fun b (function: (String)->Unit){ // String타입을 빈 함수 타입으로 받아내기
    function("b가 호출한")
}