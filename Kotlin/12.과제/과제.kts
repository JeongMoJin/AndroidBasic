//// 1
//fun nLoop(s: String, n: Int) : Unit//생략해도 Unit 처리 {
//    var i = 0
//    while(i < n) {
//        println(s)
//        i++
//    }
//}
//
//fun repeatText(repeatText: String, repeatNumber:Int) {
//    for (i in 0..repeatNumber - 1) println(repeatText)
//}
//nLoop("Hello", 3)
//repeatText("안녕", 2)

// 2
fun oneToSum(n : Int) : Int {
    var sum : Int = 0
    for (value in 0..n) {
        sum = sum + value
    }
    return sum
}
val sum:Int = oneToSum(10)
println(sum)

// 3
fun sevenSum() : Unit {
    var sum = 0
    var i = 7
    while (i < 100) {
        sum = sum + i
        i = i + 7
    }
    println(sum)
}
sevenSum()

// 4
fun onePlus(num:Int) : Unit {
    var funNum = num
    while (true) {
        if (funNum < 100) {
            funNum++
            println(funNum)
        } else if (funNum == 100) {
            break;
        }
    }
}
onePlus(85)

// 5
//var score = arrayOf<Int>(70,71,72,77,78,79,80,82,90,99)






