// Enum class
// enumerated type 즉 '열거형'의 준말로
// enum class 내에 상태를 구분하기 위한 객체들을 이름을 붙여 여러개
// 생성해두고 그중 하나의 상태를 선택하여 나타내기 위한 class이다.
// enum 클래스 안의 객체들은 관행적으로 상수를 나타낼 때 사용하는 대문자로 기술한다.
// 또한 enum의 객체들은 고유한 속성을 가질 수 있다.
// enum의 생성자를 만들어 속성을 받도록 하면 객체를 선언 할 때
// 속성도 설정할 수 있다.
// 또한 일반 클래스처럼 함수를 추가할 수 있다.
// 이떄는 객체의 선언이 끝나는 위치에 세미콜론을 추가하고 함수를 기술하면 된다.
fun main(){
 var state = State.SING
 println(state)

 state = State.SLEEP
 println(state.isSleeping())

 state = State.EAT
 println(state.message)
}
enum class State(val message: String){
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다"),
    SLEEP("잠을 잡니다");

    fun isSleeping() = this == State.SLEEP
}
