fun main(){
    // 익명객체와 옵저버 패턴
    EventPrinter().start()
} // main

interface  EventListener{
    fun onEvent(count: Int)
} // interface

class Counter2(var Listener: EventListener){

    fun count(){
        for(i in 1..100){
            if(i % 5 == 0) Listener.onEvent(i)
        }
    }
} // Counter2

// 옵저버 패턴
//class EventPrinter: EventListener{
//    override  fun onEvent(count: Int){
//        print("${count}-")
//    }
//    fun start(){
//        val counter = Counter2(this)
//        counter.count()
//    } // start
//} // EventPrinter

// 익명함수
class EventPrinter{
    fun start() {
        val counter = Counter2(object: EventListener {
            override fun onEvent(count: Int){
                print("${count}-")
            }
        })
        counter.count()
    } // start
} // EventPrinter