fun main() {
    // 상속
    var a = Animal("별리",5,"개")
    var b = Dog("별이", 5)

    a.introduction()
    b.introduction()

    b.bark()

    var c = Cat("루이", 1)
    c.introduction()
    c.meow()
}
// public으로 이해하면 쉬울듯
open class Animal(var name:String, var age:Int, var type:String)
{
    fun introduction(){
        println("저는 ${type} ${name}이고, ${age}살 입니다")
    }
}
// 상속은 이처럼 :를 붙이고 해당 class명을 붙이면 된다.
class Dog(name:String, age:Int) : Animal(name, age, "개")
{
    fun bark(){
        println("멍멍")
    }
}

class Cat(name:String, age:Int) : Animal(name, age, "고양이")
{
    fun meow() {
        println("야용")
    }
}