package com.juhezi.sicp

import java.util.*

/**
 * 费马检测
 * Created by Juhezi on 2017/6/19.
 */
fun fermatTest(n: Int, a: Int): Boolean = a.toLong() == Math.pow(a.toDouble(), n.toDouble()).toLong() % n

fun main(args: Array<String>) {
    repeat(7, {
        println(fermatTest(7, it))
    })
}