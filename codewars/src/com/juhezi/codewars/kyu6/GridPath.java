package com.juhezi.codewars.kyu6;

import java.math.BigInteger;

/**
 * URL: https://www.codewars.com/kata/paths-in-the-grid/train/java
 * 最简单的动态规划
 */
public class GridPath {

    public static BigInteger numberOfRoutes(int m, int n) {
        BigInteger[][] array = new BigInteger[m + 1][n + 1];
        for (int i = 0; i <= m; i++)
            array[i][0] = BigInteger.ONE;
        for (int j = 0; j <= n; j++) {
            array[0][j] = BigInteger.ONE;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                array[i][j] = array[i - 1][j].add(array[i][j - 1]);
            }
        }
        return array[m][n];
    }

    public static void main(String[] args) {
        System.out.println(numberOfRoutes(3,4));
    }

}
