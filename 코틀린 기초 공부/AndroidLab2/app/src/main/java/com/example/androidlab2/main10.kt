// 문자열을 다루는 법
fun main(){
    val test1 = "Test.Kotlin.String"
    println(test1.length) // 전체 길이보는 함수 length

    println(test1.toLowerCase()) // 소문자로 바꾼다
    println(test1.toUpperCase()) // 대문자로 바꾼다

    val test2 = test1.split(".") // split함수는 기준에 따라 배열로 나눈것
    println(test2)

    println(test2.joinToString()) // 아무것도 넣지 않으면 ,가 붙어 나온다
    println(test2.joinToString(".")) // 기준을 넣으면 그 기준에 따라 붙어 나온다

    println(test1.substring(5..10)) // substring 5+1 인 K부터 10-1인 n까지
}