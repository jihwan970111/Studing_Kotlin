// 컬렉션 클래스인 Set과 Map
// Set은 List와 달리 순서가 정렬되지 않으며
// 중복이 허용되지 않는 컬렉션이다.
// 따라서 Set은 인덱스로 위치를 지정하여 객체를 참조할수는 없으며
// contains로 객체가 Set안에 존재하는지를 확인하는 식으로만 사용한다.
// Set 역시 MutableSet이 존재한다.
// List와 마찬가지로 객체의 추가, 삭제가 가증한지 여부에 따라 사용하게 된다.
// 추가는 add 삭제는 remove 함수를 사용하게 된다.
fun main(){
    val a = mutableSetOf("귤", "바나나", "키위")
    for(item in a)
    {
        print("${item} ")
    }
    println()

    a.add("자몽")
    println(a)
    
    a.remove("바나나")
    println(a)
    
    println(a.contains("귤"))
}