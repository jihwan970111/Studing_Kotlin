// List 여러개의 데이터를 원하는 순서로 넣어 관리하는 형태
// List는 생성시에 넣은 객체를 대체, 추가, 삭제 할 수 없음
// MutableList의 경우 생성시에 넣은 객체를 대체, 추가, 삭제가 가능하다.
// listOf, MutableListOf를 이용해 데이터를 넣거나 위치시킨다.
fun main() {
    var a = listOf("사과", "딸기", "배")
    println(a[1])

    for(fruit in a)
    {
        print("${fruit}:")
    }

    println()

    val b = mutableListOf(6, 3, 1)
    println(b)

    b.add(4)
    println(b)

    b.add(2,8)
    println(b)

    b.removeAt(1)
    println(b)

    b.shuffle()
    println(b)

    b.sort()
    println(b)
}