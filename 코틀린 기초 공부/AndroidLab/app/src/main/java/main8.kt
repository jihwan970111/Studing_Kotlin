fun main() {
    var t = Tiger()

    t.eat()

    var r = Rabbit()

    r.sniff()
    r.eat()
}

open class Animal2 {
    open fun eat(){
        println("음식을 먹습니다")
    }
}

class Tiger : Animal2() {
    override fun eat(){
        println("고기를 먹습니다")
    }
}

abstract class Animal3 {
    // 추상 클래스
    abstract fun eat()
    fun sniff(){
        println("킁킁")
    }
}

class Rabbit : Animal3(){
    override fun eat(){
        println("당근을 먹습니다")
    }
}