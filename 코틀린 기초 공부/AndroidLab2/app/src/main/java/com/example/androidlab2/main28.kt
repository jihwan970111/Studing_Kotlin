// 늦은 초기화
// 코틀린에서는 변수를 선언할 때 객체를 바로 할당하지 않을때에는 컴파일이 되지 않는다.
// 경우에 따라서는 변수에 객체를 할당하는 것을 선언과 동시에 할 수 없을 때도 있다.
// 이럴떄는 var 앞에 lateinit을 사용하여 일단 변수만 선언하고 초기값의
// 할당은 나중에 할 수 있도록 하는 키워드다.

// lateinit 지정한 var변수는 초기값을 할당하기 전에는 변수를 사용할 수 없다.
// 기본자료형에는 사용할 수 없다.
// 또한 lateinit 변수의 초기화를 하였는지 여부를 확인할때는 변수 이름 앞에
// 콜론을 두개 붙이고 .isInitialized라는 값을 확인해보면 초기화가 되었는지
// 확인하여 사용할 수 있으므로 오류를 막을 수 있다.
fun main(){
    val a = LateInitSample()
    println(a.getLateInitText())
    a.text = "새로 할당한 값"
    println(a.getLateInitText())
}

class LateInitSample{
    lateinit var text: String

    fun getLateInitText(): String{
        if(::text.isInitialized){
            return text
        }
        else
        {
            return "기본값"
        }
    }
}