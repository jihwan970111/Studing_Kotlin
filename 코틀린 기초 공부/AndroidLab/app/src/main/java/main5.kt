fun main() {
    var a = Person("박보영", 1990)
    var b = Person("진정국", 1997)
    var c = Person("장원영", 2004)
    //    println("안녕하세요 ${a.name}입니다. ${a.birthYear}생입니다")
    a.introduction()
    b.introduction()
    c.introduction()
}
//class Person (var name:String, val birthYear:Int)

class Person (var name:String, val birthYear:Int){
    fun introduction(){
        println("안녕하세요 ${name}입니다. ${birthYear}생입니다")
    }
}