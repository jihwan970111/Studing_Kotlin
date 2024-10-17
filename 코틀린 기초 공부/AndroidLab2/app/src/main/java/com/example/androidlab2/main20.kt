// Data Class 와 Enum Class
// Data Class는 데이터를 다루는 데에 최적화된 클래스로 '5가지 기능'을 내부적으로 자동으로 생성해주는데
// 첫번째는 내용의 동일성을 판단하는 equals()의 내용을 자동으로 생성해주며
// 두번째는 Class의 내용에서 고유한 hashcode()를 반환해준다
// 세번째는 포함된 속성을 보여줄 수 있도록 toString()에 내용을 자동으로 생성해주며
// 네번째는 객체를 복사하여 똑같은 내용의 새 객체를 만들 수 있는 copy() 함수 역시 자동으로 생성해준다.
// 여기서 copy()함수를 통해 새 객체를 생성할 때는 똑같은 내용의 객체를 생성할 수도 있지만 생성자와 똑같은 형태의 패러미터를 주어
// 일부 속성을 변경해 줄수도 있다.
// 다섯번째 속성을 반환하는 componentX() 계열의 함수가 자동으로 생성 되는데
//      Data("A",7)
// component1()↑ ↑component2() 같은 함수로 속성의 내용을 반환한다.
// 사실 이 함수는 사용자가 직접 호출하기 위한 함수가 아닌 배열이나 List등의 데이터 클래스에 객체가 담겨있을 때 이 내용을
// 자동으로 꺼내 쓸 수 있는 기능을 지원하기 위한 함수들이다.

fun main(){
//    val a= General("보영", 212)
//    println(a == General("보영", 212))
//    println(a.hashCode())
//    println(a)

//    val b = Data("루다", 306)

//    println(b == Data("루다", 306))
//    println(b.hashCode())
//    println(b)

//    println(b.copy())
//    println(b.copy("아린"))
//    println(b.copy(id = 618))

// 이번엔 componentX() 계열 함수의 동작을 확인해보자
    val list = listOf(Data("보영", 212),
                      Data("루다", 306),
                      Data("아린", 618))
    for ((a,b) in list)
    {
        println("${a}, ${b}")
    }
}
class General(val name: String, val id: Int)

data class Data(val name:String, val id: Int)