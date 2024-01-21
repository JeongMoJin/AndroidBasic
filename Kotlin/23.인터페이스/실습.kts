interface Tiger {
    fun bite()
    fun goToBox()
}

class BackDoSanTiger:Tiger {
    override fun bite() {

    }

    override fun goToBox() {
    }
}

val backDoSanTiger : BackDoSanTiger = BackDoSanTiger()
backDoSanTiger.bite()
backDoSanTiger.goToBox()

interface Person {
    // 멤버들의 구현부가 없다
    var dress : String
    fun eat() {
        println("밥을 먹는다")
    }
    fun sleep() {
        println("잠을 잔다")
    }
}

class GoodStudent : Student() {
    override fun eat() {
        super.eat()
    }

    override fun sleep() {
        super.sleep()
    }

    override var dress: String
        get() = super.dress
        set(value) {}
}

class Student : Person {
    override var dress: String
        get() = "교복"
        set(value) {}
    fun study() {
        println("공부를 한다")
    }
}

class Teacher : Person {
    override var dress: String
        get() = "정장"
        set(value) {}
}

val student : Student = Student()
student.eat()
student.sleep()












