fun main(){
    var price = 5000
    // 스코프 함수
    // apply
    var a = Book("디모의 코틀린", 10000).apply{
        name = "[초특가]" + name
        discount()
    }
//    println(a.name)
    // run
    a.run {
        println("상품명: ${name}, 가격: ${price}")
    }
    // also/let
    a.let {
        println("상품명: ${it.name}, 가격: ${it.price}")
    }
}
class Book(var name:String, var price:Int){
    fun discount(){
        price -= 2000
    }
}