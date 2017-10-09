package com.juhezi.codewars

fun main(args: Array<String>) {
//    println(Character.digit('a', 16))   //字符转换为数字
//    "Hello"()
//    println(multiplyBy2(add5(2)))   //(2 + 5) * 2
    println(calculate(2,2,2))
    println(curriedCalculate(2)(2)(2))
    println(tempCalculate(2))
    println(newCalculate(2, 2, 2))
}

operator fun Any.invoke() = println(this)

val add5 = { i: Int -> i + 5 }
val multiplyBy2 = { i: Int -> i * 2 }

// f andThen g -> g(f(x))
infix fun <P1, P2, R> Function1<P1, P2>.andThen(function: Function1<P2, R>): Function1<P1, R> {
    return fun(p1: P1): R {
        return function.invoke(this.invoke(p1))
    }
}

// f compose g -> f(g(x))
infix fun <P1, P2, R> Function1<P2, R>.compose(function: Function1<P1, P2>): Function1<P1, R> {
    return fun(p1: P1): R {
        return this.invoke(function.invoke(p1))
    }
}

val add5AndMultiplyBy2 = add5 andThen multiplyBy2

//infix 中缀表达式
//andThen --> Function1的扩展方法
//Lambda 表达式的类型

fun hello(x: String, y: Int, z: Boolean): Boolean {
    println("$x $y $z")
    return true
}

/*
fun curriedHello(x: String): (y: Int) -> (z: Boolean) -> Boolean {

}*/

fun calculate(x: Int, y: Int, z: Int) = x * y + z

//val add5 = { i: Int -> i + 5 }

fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.currying():
        (p1: P1) -> (p2: P2) -> (p3: P3) -> R
        = fun(p1: P1) = fun(p2: P2) = fun(p3: P3) = this(p1, p2, p3)

//上下两种方法类似
/*fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.currying():
        (p1: P1) -> (p2: P2) -> (p3: P3) -> R =
        { p1: P1 ->
            { p2: P2 ->
                { p3: P3 ->
                    this(p1, p2, p3)
                }
            }
        }*/

val curriedCalculate = ::calculate.currying()
val tempCalculate = (::calculate.currying())(2)(2)

//fun(:){} 是一个匿名函数

//uncurrying
fun <P1, P2, P3, R> Function1<P1, (p2: P2) -> (p3: P3) -> R>.uncurrying():
        (p1: P1, p2: P2, p3: P3) -> R
        = fun(p1: P1, p2: P2, p3: P3) = this(p1)(p2)(p3)

val newCalculate = curriedCalculate.uncurrying()