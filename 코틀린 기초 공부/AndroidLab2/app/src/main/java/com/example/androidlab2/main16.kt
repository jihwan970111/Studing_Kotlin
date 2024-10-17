// 패러미터를 받아야하는 함수이지만 별다른 패러미터가 없더라도 기본값으로 동작해야 한다면 어떻게 해야 할까
// 이떄는 defualt arguments를 사용한다

// named arguments는 패러미터의 순서와 관계없이 패러미터의 이름을 사용하여 직접 패러미터의 값을 할당하는 기능입니다.

fun main(){
    deliveryItem("짬뽕")
    deliveryItem("책",3)
    deliveryItem("노트북",30,"학교")

    deliveryItem("선물", destination = "친구집")
}

fun deliveryItem(name: String, count: Int = 1, destination: String = "집"){
    println("${name}, ${count}개를 ${destination}에 배달하였습니다")
}