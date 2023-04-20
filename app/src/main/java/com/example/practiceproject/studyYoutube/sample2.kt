package com.example.practiceproject

// 고급 문법

//1. Lamda

// 우리가 value처럼 다룰 수 있는 익명함수이다.
// 1) 메소드의 파라미터로 넘겨줄 수 있음. fun maxBy(a :Int) -> a : Int 자리에 함수를 넣을 수 있음
// return 값으로 사용할 수 있음.

//

fun main(){
    var a = square(5)
    print(a)
    println(nameAge("JH", 23))
    val aa = "JH said"
    val bb = "KY said"

    println(aa.pizzaIsGreat())
    println(bb.pizzaIsGreat())

    println(extendString("ariana", 25))
}

val square : (Int) -> (Int) ={number -> number * number}
val square2 = {number:Int -> number * number}  // 같은 함수

val nameAge = {name : String, age : Int ->
    "my name id ${name} I'm ${age}"
}
// 확장 함수
// 있는 클래스를 추가하는것

val pizzaIsGreat : String.() -> String = {
    this + " Pizzd is the best!"
}

fun extendString(name : String, age:Int) :String {
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years Old"}
    return name.introduceMyself(age)
}




