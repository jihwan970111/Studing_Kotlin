// flatMap 함수는 중괄호 안에서 아이템 마다 새로운 컬렉션을 생성하면
// 이를 합쳐서 하나의 컬렉션으로 반환해준다.

// getOrElse함수는 괄호 안에 지정한 index에 객체가 존재하는 경우 해당 객체를 반환하고
// 없는 경우 중괄호 안의 객체를 반환해준다.

// zip함수는 두컬렉션에 포함된 아이템을 1:1로 Pair class에 객체로 만들어
// List에 만들어 반환해준다. 이때 결과 list의 아이템의 개수는
// 더 작은 컬렉션을 따라가게 된다.
fun main(){
    val numbers = listOf(-3, 7, 2, -10, 1)

    println(numbers.flatMap {  listOf(it * 10, it + 10) })

    println(numbers.getOrElse(1){ 50 })
    println(numbers.getOrElse(10){ 50 })

    val names = listOf("A", "B", "C", "D")

    println(names zip numbers)
}