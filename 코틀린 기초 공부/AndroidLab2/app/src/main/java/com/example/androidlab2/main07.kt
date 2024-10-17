// 클래스의 다형성
fun main(){
    var a = Drink()
    a.drink()

    var b: Drink = Cola()
    b.drink()
    // is는 조건문 안에서만 잠시 다운 캐스팅 된다.
    if(b is Cola)
    {
        b.washDishes()
    }

    var c = b as Cola
    c.washDishes()
    // 아까와 달리 참조할 수 없다는 에러가 뜨지 않는다.
    // 이유는 as사용 이후 변수 자체도 다운 캐스팅 되기 때문
    b.washDishes()
}
open class Drink{
    var name = "음료"
    open fun drink(){
        println("${name}를 마십니다")
    }
}
class Cola: Drink(){
    var type = "콜라"

    override fun drink() {
        println("${name}중에 ${type}를 마십니다")
    }
    
    fun washDishes(){
        println("${type}로 설거지를 합니다")
    }
}