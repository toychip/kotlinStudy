package com.example.practiceproject

fun main(){
    ignoreNulls("ss")

}

fun helloWorld() : Unit{    // Unit == Void 생략 가능
    println("Hello World")
}

fun add(a : Int, b : Int) : Int{    // return 타입이 있을 경우 생략 불가능
    return a+b
}
// 2. val vs var
// val == 값, 변하지 않음
fun hi(){
    val a : Int = 10    // value 변할 수 없음.
    var b : Int = 9     // variable
}

// 3. String Template
fun StringTemplate() {
    val name = "jun"
    val lastName = "hyoung"
    println("hello ${name + lastName} I'm 23")
    println("3\$")  // 달러 쓰고 싶으면 \ 붙여주기
}


// 1. 함수
// 4. 조건식
fun maxBy(a: Int, b: Int) : Int{
    if(a>b){
        return a
    } else{
        return b
    }
}
fun maxBy2(a:Int, b: Int) = if (a>b) a else b

fun checkNum(score : Int){
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("I don't know")
    } // 다른 언어에서 스위치

    var b = when(score){
        1->1
        2->2
        else -> "wow!"
    }
    println("b is = " + b)

    when(score){
        in 90..100 -> println("u r genius ${b}")
    }
    // 값을 할당하지 않으면 Statement
    // 값을 할당하면 Expression
    // 코틀린의 모든 함수는 Expression, Unit으로 return 하기 때문
}

// 5 배엻과 리스트 Array, List

// Array 처음에 크기 지정해야함

// List vs MutableList
// Mutable list는 변경 가능 vs list는 변경 불가능
fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(79, 52, 23)

    val arrayObject = arrayOf(1, "d", 3.4f)

    array[0] = 3
//    list[0] = 2   list는 interface이므로 변경 불가능
    list.get(1) // 당연히 1번째 인덱스를 갖고 옴

    val arrayList = arrayListOf<Int>()  // val 로 선언해도 됨. 변경 가능한 var 과 val의 기준은 메모리 참조값임.
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 7
}

// 6. for / while

fun forAndWhile(){
    val students = arrayListOf("Tim", "kyoungmin", "junhyoung")

    for (name in students){
        println("${name}")
    }

    for ((index, name) in students.withIndex()){
        println("${index+1}번째 학생: ${name}")
    }

    var sum = 0
    for (i in 1..10 step 4){
        println(i)
        sum += i
    }
    for( x in 1 until 10) {    // 1..9
    println(x)
    }
    println(sum)

    var index = 0
    while (index < 10){
        println("current index : ${index}")
        index ++
    }
}

// 7. Nullable / NotNull

fun nullcheck(){
    // NPE : Null pointer Exception

    var name : String = "Junlodywn"
    var nullName : String? = null

    var nameInUpperCase = name.toUpperCase()
    println(nameInUpperCase)
    var nullNameInUpperCase = nullName?.toUpperCase()
    println(nullNameInUpperCase)

    // ?:
    val lastName : String? = null
    val fullName = name + (lastName?: "No Lastname")
    // default 값을 준것, lastName이 값이 있다면 값을 주고 없으면 뒤 행동을 해라
    println(fullName)
}

// !!
fun ignoreNulls(str : String?){
    val mNotNull : String = str!!   // Null이 아니라고 보증해줌.
    val upper = mNotNull.uppercase()
    print(upper)

    val email : String?= "dlawnsgud427@naver.com"
    email?.let {
        println("my email is ${it}")    // ${it}, ${name} 같은 것임.
    }

}


