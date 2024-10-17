// associateBy는 객체에서 key를 따로 뽑아내서 map으로 만드는 함수
// 예를 들어 이름과 태어난 해가 들어간 person 객체가 있고 이를 list에 넣어두었다 해보자
// 이 list를 이름을 key로 하고 객체를 value로 하는 map으로 변경하려면
// associateBy에 중괄호 안에 key로 사용할 이름 속성을 넣어주면 자동으로
// map으로 변환하여 반환해준다.

// groupBy는 특정한 값을 key로 지정하여 해당 값을 가진 객체끼리 묶은 배열을
// value로 하는 map을 만들어주는 기능

// partition 함수는 아이템에 조건을 걸어 true인지 false인지에 따라 두
// collection으로 나누어준다. 두 collection은 두 객체를 담을 수 있는
// Pair라는 class 객체로 반환되므로
// 각각의 collection을 first second로 참조하여 사용하면 된다.

// 또는 Pair를 직접 받아줄 수 있도록 변수 이름을 괄호 안에 두개 선언해주면
// 각각의 변수 이름으로 받을 수 있다.
fun main(){
    data class Person(val name: String, val birtYear: Int)

    val personList = listOf(Person("유나", 1992),
                            Person("조이", 1996),
                            Person("츄", 1999),
                            Person("유나", 2003))
    // personList에서 태어난 해를 뽑아내어 key로 사용하고 map으로 만들어
    // 출력하였다.
    println(personList.associateBy { it.birtYear })
    // personList에서 특정한 값인 name을 지정하여 해당 값을 가진 객체끼리 묶은
    // 배열을 value로 하는 map을 만들어 출력하였다.
    println(personList.groupBy { it.name })
    // 1998년 초과면 true, 1998이하면 false가 나와 Pair라는 calss 객체로 반환되었다.
    // 이름을 두개 선언하여 각각의 변수 이름으로 받아내었다.
    val (over98, under98) = personList.partition { it.birtYear > 1998 }
    println(over98)
    println(under98)
}