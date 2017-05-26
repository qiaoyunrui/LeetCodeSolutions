package com.juhezi.solutions.problems

/**
 * N-queen
 * 分析：
 * 采用逐步试探的方式，先从一个方向往前走，能进则进，不能进则退，尝试另外的路径。
 *
 * 用回溯的方法解决 8 皇后问题的步骤为：
 * 1. 从第一列开始，为皇后找到安全位置，然后跳到下一列
 * 2. 如果在第 n 列出现死胡同，如果该列为第一列，
 * 棋局失败，否则推到上一列，再进行回溯
 * 3. 如果第 8 列找到安全位置，则棋局成功
 *
 * Created by Juhezi on 2017/5/25.
 */
const val queen = 10
const val output = true //true -> 输出具体解 false -> 不输出

var k = Array(queen) { Array(queen) { 0 } } //二维数组，棋盘
var queens = Array(queen) { -1 }    //存放皇后的位置
var count = 0   //布局种类

/**
 * 判断当前位置是否安全
 */
fun isSafe(x: Int, y: Int): Boolean {
    fun isSuitable(m: Int): Boolean = (m in 0 until queen)
    for (i in 0 until queen) {
        if (k[i][y] == 1 || k[x][i] == 1)
            return false
        if (isSuitable(x + i) && isSuitable(y + i) && k[x + i][y + i] == 1)
            return false
        if (isSuitable(x + i) && isSuitable(y - i) && k[x + i][y - i] == 1)
            return false
        if (isSuitable(x - i) && isSuitable(y + i) && k[x - i][y + i] == 1)
            return false
        if (isSuitable(x - i) && isSuitable(y - i) && k[x - i][y - i] == 1)
            return false
    }
    return true
}

tailrec fun getQueen(startX: Int, startY: Int) {
    if (startX < 0) return
    if (startX in 0 until queen) {
        if (startY in 0 until queen) {
            if (isSafe(startX, startY)) {
                k[startX][startY] = 1
                queens[startX] = startY
                if (startX == queen - 1) {
                    if (output) {
                        queens.forEach {
                            print("$it ")
                        }
                        println()
                    }
                    count++
                    k[startX][startY] = 0
                    getQueen(startX, startY + 1)
                } else {
                    getQueen(startX + 1, 0) //向下一层迈进
                }
            } else {
                getQueen(startX, startY + 1) //Y 继续变大
            }
            return
        }
        if (startY >= queen) {  //Y 超出棋盘
            if (startX == 0) return
            k[startX - 1][queens[startX - 1]] = 0
            queens[startX] = -1
            getQueen(startX - 1, queens[startX - 1] + 1)
        }
    }
}

fun main(args: Array<String>) {
    getQueen(0, 0)
    println(count)
}