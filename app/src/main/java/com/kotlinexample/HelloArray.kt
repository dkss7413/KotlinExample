package com.kotlinexample

fun main(){
    //배열
    var arr1 = listOf("1", "2")     //수정 불가능
    var arr2 = mutableListOf("1", "2")      //수정 가능

    //반복문
    for(item in arr1){
        println(item)
    }
    for((index, item) in arr1.withIndex()){
        println("$index, $item")
    }

    //Auto Casting(자동 형변환)
    var hello: Any = "hello"
    if(hello is String){
        var str: String = hello
    }
}