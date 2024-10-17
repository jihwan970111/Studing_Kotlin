// 마지막으로 연산자처럼 쓸수있는 infix 함수
fun main(){
    println(6 multiply 4) // 여기서 좌측에 붙은 6이 infix함수가 적용되는 객체 자신 즉 this에 해당하고
                          // 우측에 붙은 4가 패러미터인 x에 해당한다.
    // 그냥 일반적인 클래스의 함수처럼 사용할 수도 있는데
    println(6.multiply(4))
    // 참고로 class 안에서 infix함수를 선언할 때에는 적용할 클래스가 자기 자신이므로 class이름은 쓰지 않는다.
}

infix fun Int.multiply(x: Int): Int = this * x