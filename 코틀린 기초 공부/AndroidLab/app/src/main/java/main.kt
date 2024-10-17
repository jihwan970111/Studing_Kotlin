// 2강, 3강
fun main() {
    // var로 선언하였다면 반드시
    var a: Int
    // 이와같이 값을 할당시켜줘야한다.
    a = 1;
    //또는 이처럼 선언할때 할당시켜주면 된다.
    var b: Int = 123
    println(a);
    println(b);
    // 자료형에 ?를 붙일 경우 null이 사용 가능해진다.
    var c: Int? = null

    // 32비트 10진수
    var intValue:Int = 1234
    // 64비트 10진수
    var longValue:Long = 1234L
    // 16진수
    var intvalueByHex:Int = 0x1af
    // 2진수
    var intValueByBin:Int = 0b10110110
    // 코틀린은 8진수의 표기는 지원하지 않는다

    // 실수는 기본이 더블형이다
    var doubleValue:Double = 123.5
    // 필요시 시주 표기법을 추가하면 된다. 여기서 e는 exponential의 약어
    var doubleValueWithExp:Double = 123.5e10
    // float형으로 나타낼 경우 f를 붙이거나 F를 붙이면 된다.
    var floatValue:Float = 123.5f

    // boolean 타입은 true와 false 대문자 안된다.
    var booleanValue:Boolean = true
    var booleanValue2:Boolean = false

    // String같은 경우 String이런식으로 적을 필요 없다.
    var stringValue = "hello"
    var multilineStringValue = """multiline
        string
        test"""

    // 형변환
    // 코틀린에서는 할당만 시켜서는 적용되지 않는다.
    // 반드시 Int형 변수의 toLong()함수를 호출하여 Long값으로 변환된 값을 반환받아
    // Long변수에 할당해야한다. (명시적 형변환이라 부른다).
    // 코틀린은 암시적 형변환을 지원하지 않는다.
    var d: Int = 54321
    var e:Long = a.toLong()
    println(e);

    // 배열
    // 배열같은경우 이처럼 arrayOf라는 함수를 이용해 받아와야한다. 기존의 자바의 []와는 좀 다르다.
    var intArr = arrayOf(1, 2, 3, 4, 5,)
    // 반약 비어있는 배열을 만들고싶다면 이처럼 arrayOfNulls라는 함수를 이용해야한다.
    // <>꺾쇠 안에는 배열에 할당할 자료형을 지정해주면 된다. 이를 Generic이라 부른다.
    var nullArr = arrayOfNulls<Int>(5)
    // 선언된 배열값을 바꾸는 방법
    intArr[2] = 8
    // 바뀐값 print해보기
    println(intArr[2])
    // 배열은 0부터 시작하기 때문에 5번째가 print로 나올것이다.
    println(intArr[4])
    
    // 타입추론
    // 자연스럽게 정수로 추론
    var f = 1234
    // Long타입으로 추론
    var g = 1234L
    // 실수형 Double로 추론
    var h = 12.45
    // float타입으로 추론
    var i = 12.45f
    // 16진수로 추론
    var j = 0XABCD
    // 2진수로 추론
    var k = 0b0101010
    // boolean과 character타입도 추론가능
    var l = true
    var m = 'c'
    // 대부분 추론 가능하니 꼭 타입을 다 적어줄 필요 없다.
    
    // 함수를 이용해 값을 받아 저장하고 print시켜보기
    var sum = add(1,2,3);
    println(sum)
}
// 함수
//fun add(a: Int, b: Int, c:Int) : Int {
//    return a+b+c
//}
// 위와 아래 둘 다 가능하다 (단일 표현식 함수)로 나타낼 수 있다.
fun add(a: Int, b: Int, c:Int) = a+b+c
// Int타입을 더하면 Int기 떄문에 반환 타입을 꼭 지정해줄필요 없다.

