open class Human(val name : String = "i feel good"){
//    val name = "junhyoung"
    open fun eatingCake(){
        println("This is so YUMMMYYY~")
    }
    init {
        println("-----Init Init Init Init-----")
    }
    constructor(name: String, age: Int) : this(name){
        println("my name is ${name}, ${age}years old")
    }
}

class Korean : Human(){
    override fun eatingCake() {
        super.eatingCake()
        println("냠냠ㄴ먀")
    }
}

class Child constructor(val name : String = "Anonymous"){
// default 값 Anonymous 값으로 할당
// constructor 생략 가능
    init {
        println("-----Init Init Init Init-----")
    }
}
fun main(){
//    val human = Human()
//    val human2 = Human("guest", 13)
//    human.eatingCake()
//    println ("this humans name is ${human.name}")

//    val stranger = Child()
//    println ("this humans name is ${stranger.name}")

    val korean = Korean()
    korean.eatingCake()
    println("${korean.name}")

}