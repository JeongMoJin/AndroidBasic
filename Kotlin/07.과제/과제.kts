// 1번 문제
//val A : Int = 5
//val B : Int = 7
//val c : Boolean = if( A==B ) true else false
//println(c)

// 2번문제
//val A : Int = 5
//val B : Int = A * 2
//println(B)

// 3번문제
val score : Int = 93
if (90<=score && score<=100) {
    println("A")
} else if (80<=score && score<90){
    println("B")
} else if (70<=score && score<80){
    println("C")
} else {
    println("F")
}

fun testScore(point:Int) : Int {
    val teScore : Int = point * 5
    return teScore
}
val result : Int = testScore(18)
println(result)

fun nuallableFun(nullable1 : Int?, nullable2 : Int?) : Int {
//    if (nullable1 == null) {
//        var nullable1 = 0
//    }
//    if (nullable2 == null) {
//        var nullable2 = 0
//    }
//    var result : Int = nullable1 + nullable2
//    return result
    val first : Int = if(nullable1==null) else nullable1
    val second : Int = if(nullable2=null) else nullable2
    return first + second
    // 함수 안에서 같은 이름을 가진 변수가 있으면 안된다
}

val result2 : Int = nuallableFun(5,null)
println(result2)







