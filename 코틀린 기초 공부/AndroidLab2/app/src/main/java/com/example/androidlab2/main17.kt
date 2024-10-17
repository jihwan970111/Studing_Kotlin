// 같은 자료형을 개수에 상관없이 패러미터로 받고 싶을 떄 사용하는 varialbe number of argument를 사용해보자
// vararg는 개수가 지정되지 않은 패러미터라는 특징이 있으므로 다른 패러미터와 같이 쓸떄는 맨 마지막에 위치한다는 점도 잊지 말자
fun main(){
    sum(1, 2, 3, 4)
}
fun sum(vararg numbers: Int){
    var sum = 0

    for(n in numbers)
    {
        sum += n
    }
    print(sum)
}