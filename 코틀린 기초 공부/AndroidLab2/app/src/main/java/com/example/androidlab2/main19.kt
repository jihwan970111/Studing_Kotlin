// 클래스 안에 클래스가 중첩되는 두가지 유형의 클래스를 알아보자
// 코틀린에서는 기본적으로 클래스 안에 클래스를 넣을 수 있는 중첩 클래스(Nasted Class)를 지원한다
// 하나의 클래스가 다른 클래스의 기능과 강하게 연관되어 있다는 의미를 전달하기 위해 만들어진 형식으로
// 사용할떄는 외부 클래스의 이름.중첩클래스의 이름으로 사용하게 된다.
// 이 때 중첩클래스 대신 내부 클래스라는것을 사용할수도 있다.
// 중첩 클래스에 inner라는 키워드를 붙인 내부 class는 혼자서 객체를 만들수는 없고
// 외부 클래스에 객체가 있어야만 생성과 사용이 가능한 class다
// 중첩 클래스는 형태만 내부에 존재할 뿐 실질적으로 서로 내용은 직접 공유할 수 없는 별개의 클래스다
// 내부 클래스는 외부 클래스 객체 안에서 사용되는 클래스이므로 외부 클래스 객체에 속성이나 함수를 사용할 수 있다.
fun main(){
    Outer.Nested().intoduce()

    val outer = Outer()
    val inner = outer.Inner()

    inner.intoduceInner()
    inner.introduceOuter()

    outer.text = "Changed Outer Class"
    inner.introduceOuter()
}

class Outer(){
    var text = "Outer Class"

    class Nested{
        fun intoduce(){
            println("Nested Class")
        }
    }
    inner class Inner {
        var text = "Inner Class"

        fun intoduceInner(){
            println(text)
        }
        fun introduceOuter(){
            println(this@Outer.text)
        }
    }
}