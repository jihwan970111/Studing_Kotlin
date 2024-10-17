// Generic
fun main(){
    UsingGeneric(A()).doShouting()
    UsingGeneric(BB()).doShouting()
    UsingGeneric(C()).doShouting()
    doShouting(BB())
}

fun <T: A> doShouting(t: T){
    t.shout()
}


open class A {
    open fun shout(){
        println("A가 소리칩니다")
    }
}

class BB : A() {
    override fun shout(){
        println("BB가 소리칩니다")
    }
}

class C : A() {
    override fun shout(){
        println("C가 소리칩니다")
    }
}

class UsingGeneric<T: A> (val t: T){
    fun doShouting(){
        t.shout()
    }
}