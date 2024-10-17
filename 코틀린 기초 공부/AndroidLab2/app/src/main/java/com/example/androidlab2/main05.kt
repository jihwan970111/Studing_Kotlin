fun main(){
    //오브젝트(object)
    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.clear()
    println(Counter.count)
    // 컴패니언 오브젝트(Companion Object)
    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")
    a.vote()
    b.vote()

    b.vote()
    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("총계 : ${FoodPoll.total}")
}
object Counter {
    var count = 0

    fun countUp(){
        count++
    }
    fun clear(){
        count = 0
    }
}

class FoodPoll(val name:String){
    companion object{
        var total = 0
    }
    var count = 0
    fun vote(){
        total++
        count++
    }
}