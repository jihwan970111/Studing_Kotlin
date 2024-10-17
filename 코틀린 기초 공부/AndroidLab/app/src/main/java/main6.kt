fun main() {
    var a = Person2("박보영", 1990)
    var b = Person2("진정국", 1997)
    var c = Person2("장원영", 2004)

    var d = Person2("이루다")
    var e = Person2("장원영")
    var f = Person2("박지환")
}
class Person2(var name:String, val birthYear:Int){
    init {
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다")
    }
    constructor(name:String) : this(name, 1997){
        println("보조 생성자가 사용되었습니다.")
    }
}