// 함수의 argument를 다루는 방법과 infix 함수
// 코틀린에서도 대부분의 언어에서 지원하는 함수의 overloading이 지원되고 있다
// 이것은 같은 scope 안에서 같은 이름의 함수를 여러개 만들 수 있는 기능인데, 이름이 같더라도
// parameter의 자료형이 다르거나 parameter의 갯수가 다르다면 서로 다른 함수로 동작할 수 있다
// 다만 parameter의 이름만 다르게 묶고, 자료형과 갯수가 동일하다면 오버로딩을 할 수 없다.
fun main(){
    read(7)
    read("감사합니다")
}
fun read(x: Int){
    println("숫자 $x 입니다")
}

fun read(x: String){
    println(x)
}