// 코틀린은 함수형 언어의 특징을 가지고 있기 때문에 좀 더 편리하게 컬렉션을
// 사용할 수 있는데 컬렉션 함수를 사용하는 방법이다.
// 컬렉션 함수는 list나 set, map과 같은 컬렉션 또는 배열에
// 일반 함수 또는 람다 함수 형태를 사용하여
// for문 없이도 아이템을 순회하며 참조하거나
// 조건을 걸고, 구조의 변경까지 가능한 여러가지 함수를 지칭한다.

// forEach라는 함수가 있다
// 이를 collection 객체에 사용하게 되면 중괄호 안에서
// collection에 포함된 모든 아이템을 it이라는 변수로 순서대로 참조할 수 있다.

// filter라는 함수는
// 중괄호 안에서 it에 조건을 걸어주면 조건에 맞는 객체만 컬렉션으로 만들어서
// 반환해주는 기능을 가지고있으며

// map이라는 함수는
// 중괄호 안에서 it에 수식을 적용하여 값을 변경하면 그 값을 컬렉션으로 만들어
// 반환해준다.

// any라는 함수는 중괄호 안에서 조건이 하나라도 맞으면 true
// all라는 함수는 중괄호 안에서 모두 조건에 맞으면 true
// none라는 함수는 중괄호 안에서 하나도 조건에 맞지 않으면 true

// first라는 함수는 일반 함수로 사용하게 되는 경우 첫번째 객체를 반환하지만
// 람다함수 형태로 중괄호 안에 it에 조건을 걸어주면 조건에 맞는 첫번째 객체를 반환한다.

// last는 람다함수 형태로 중괄호 안에 it에 조건을 걸어주면 조건에 맞는 마지막 객체를 반환한다.

// first는 find라는 함수로 대체할 수 있다. last는 findLast함수로 대체할 수 있다.
// first와 last함수를 사용할 때 문제가 생길 수 도 있는데 바로 조건에 맞는 객체가 없는 경우
// NoSuchElementException이 발생할 수 있다. 이때는
// firstOrNull lastOrNull을 사용하면 객체가 없는 경우 null을 반환한다.

// count 함수는 일반함수로 사용할 경우 포함된 모든 아이템 개수를 반환한다.
// 중괄호와 함께 it에 조건을 걸어주면 조건에 맞는 아이템 개수를 반환한다.
fun main(){

    val nameList = listOf("박수영", "김지수", "김다현", "산유나", "김지우")
    nameList.forEach{ print(it + " ")}
    println()
    // 김씨로 성을 찾아낸다
    println(nameList.filter{ it.startsWith("김")})
    // List안의 값들을 배열로 다 꺼냈다.
    println(nameList.map{ "이름 : " + it})
    // 김지연으로 시작하는 이름이 존재한다면 true
    println(nameList.any{ it == "김지연"})
    // 이름이 모두 3글자면 true
    println(nameList.all{ it.length == 3})
    // 성이 이씨인 사람이 없다면 true
    println(nameList.none{ it.startsWith("이")})
    // 김으로 시작하는 사람의 첫번째 해당하는 사람을 출력한다
    println(nameList.first{ it.startsWith("김")})
    // 김으로 시작하는 사람의 마지막에 해당하는 사람을 출력한다
    println(nameList.last{ it.startsWith("김")})
    // 지라는 글자가 얼마나 포함되어있는지 개수를 새어 출력한다.
    println(nameList.count{ it.contains("지")})
}