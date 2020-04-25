package com.hank

fun main() {
    var h = Human()
    h.hello()
    var age = 123
    val age2 = 123

    var age3 : Int = 123
    val age4 : Char = '1'
}

class Human(){
    fun hello(){
        println("Hello Kotlin")
    }
}