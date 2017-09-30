package com.juhezi.codewars

fun main(args: Array<String>) {
    println(Character.digit('a', 16))   //字符转换为数字
    "Hello"()
}

operator fun Any.invoke() = println(this)