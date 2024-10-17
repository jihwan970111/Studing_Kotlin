// Map
// Map은 객체를 넣을때 그 객체를 찾아낼 수 있는
// Key를 쌍으로 넣어주는 컬렉션이다.
// key와 value 즉 객체는 내부적으로는 MutableMap.MutableEntry의 객체로
// 담겨져있으며 이런 구조때문에 객체의 위치가 아닌
// 고유한 key를 통해 객체를 참조하는 특징을 가지고있다.
// 또한 같은 key에 다른 객체를 넣으면 기존의 객체가 대체되니 주의해서 사용해야한다.
// Map 역시 추가 삭제가 가능한 MutableMap이 존재하며
// 추가는 put, 삭제는 remove로 하게된다
fun main(){
    val a = mutableMapOf("레드벨벳" to "음파음파",
                         "트와이스" to "FANCY",
                         "ITZY" to "ICY")
    for(entry in a)
    {
        println("${entry.key} : ${entry.value}")
    }
    a.put("오마이걸", "번지")
    println(a)

    a.remove("ITZY")
    println(a)

    println(a["레드벨벳"])
}