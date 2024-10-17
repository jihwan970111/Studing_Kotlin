// 변수의 동일성 체크하는 방법
// 동일성에는 두가지 개념이 있다. 내용의 동일성 그리고 객체의 동일성
// 내용의 동일성은 메모리 상에 서로 다른 곳에 할당된 객체라고 해도 그 내용이 같다면 동일하다고 판단하는것이며
// 객체의 동일성은 서로 다른 변수가 메모리상의 같은 객체를 가리키고 있을때만 동일하다고 판단하는 것이다.
// 내용의 동일성을 판단하는 연산자는 이미 우리가 배웠던 a==b 연산자
// 객체의 동일성을 판단하는 연산자는 a===b
// 이중 내용의 동일성은 자동으로 판단되는 것이 아닌 코틀린의 모든 클래스가 내부적으로 상속받는 'Any'라는 최상의 클랙스의
// equals() 함수가 반환하는 Boolean값으로 판단하게 된다.
// 기본 자료형에는 자료형의 특징에 따라 equals()함수가 이미 구현되어 있지만 우리가 커스텀 class()를 만들때는
// open fun equals(other:Any?):Boolean 이러한 equals를 상속받아 동일성을 확이해주는 구문을 별도로 구현해야 한다.
fun main() {
    var a = Product("콜라", 1000)
    var b = Product("콜라", 1000)
    var c = a
    var d = Product("사이다", 1000)

    println(a == b)
    println(a === b)

    println(a == c)
    println (a === c)

    println(a == d)
    println(a ===d )
}

class Product(val name: String, val price: Int){
    override fun equals(other: Any?): Boolean{
        if(other is Product)
        {
            return other.name == name && other.price == price
        } else{
            return false
        }
    }
}