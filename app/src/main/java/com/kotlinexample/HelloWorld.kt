package com.kotlinexample

fun main(){
    val hello1 = "hello world!"
    var hello2: String = "world2"
    var hello3: String? = "world3"

    println(hello1)
    println(hello2)

    println(hello())
}

fun hello(): String {
    return "hello fun!"
}