// 변수의 고급 기술, 상수, lateinit, lazy
// var은 한번 할당한 객체가 있더라도 다른 객체로 변경하여 할당할 수 있으며
// val은 한번 할당하면 다시 할당된 객체를 변경할 수 없다는 점

// val은 할당된 객체를 바꿀 수 없을 뿐이지 객체 내부의 속성을 변경 할 수 없는 것은 아니다

// 그런데 절대 변경이 불가능한 것도 있는데 바로 '상수'이다.
// 상수는 컴파일 시점에 결정되어 절대 바꿀 수 없는 값이다.
// 선언은 val앞에 const붙여 만들게 된다. 상수로 선언될 수 있는 값은
// 기본 자료형만 가능하며 런타임에 생성될 수 있는 일반적인 다른 클래스의 객체들은 담을 수 없다.
// 상수는 class의 속성이나 지역변수 등으로는 사용할 수 없으며
// 반드시 companion object안에 선언하여 객체의 생성과 관계 없이
// class와 관계된 고정적인 값으로만 사용하게 된다.

// 상수의 이름을 만들 때는 의례적으로 대문자와 언더바를 사용한 특유법을 사용하게 되며
// 이를 통해 변수가 아닌 상수라는 점을 알리게 된다.

// 변수의 경우 런타임시 객체를 생성하는데 시간이 더 소요되어 성능의 하락이 있기 때문이다.
// 따라서 늘 고정적으로 사용할 값은 상수를 통해 객체의 생성 없이 메모리에 값을
// 고정하여 사용함으로서 성능을 향상시킬 수 있다는 장점이 있다.
fun main(){
    val foodCourt = FoodCourt()

    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)
}

class FoodCourt{
    fun searchPrice(foodName: String) {
        val price = when(foodName)
        {
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }
        println("${foodName}의 가격은 ${price}원 입니다.")
    }

    companion object{
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
    }
}