fun main() {
    // 반복문과 증감연산자
    var a = 0
    while (a < 5){
        println(a++) // 0, 1, 2, 3, 4
    }
    a = 0
    while(a<5){
        println(++a) // 1, 2, 3, 4, 5
    }
    for(i in 0..9){
        print(i) // 0 1 2 3 4 5 6 7 8 9
    }
    println()
    for(i in 0..9 step 3){
        print(i) // 0 3 6 9
    }

    println()
    for(i in 9 downTo 0){
        print(i) // 9876543210
    }
    println()
    for(i in 'a'..'e'){
        print(i) // abcde
    }
    println()
    for(i in 1..10){
        if(i == 3) break // 1 2 나오고 멈춤
        println(i)
    }
    println()
    for(i in 1..10){
        if(i == 3) continue // 3을 건너띄고 print한다.
        println(i)
    }
    println()
    loop@for(i in 1..10){
        for(j in 1..10){
            if(i==1 && j == 2) break@loop
            println("i : $i, j : $j")
        }
    }
}