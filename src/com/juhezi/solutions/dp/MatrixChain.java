package com.juhezi.solutions.dp;

/**
 * 矩阵链乘法问题
 * 给定 n 个矩阵的链（A1,A2,A3,...,An），矩阵 Ai 的规模为 pi-1 * pi(1 <= i <= n)，
 * 求完全括号化方案，使得计算乘积 A1A2...An 所需标量乘法次数最小
 * <p>
 * Created by qiao1 on 2017/4/7.
 */
public class MatrixChain {

    public static void main(String[] args) {
        int[] p = {30, 35, 15, 5, 10, 20, 25};
        int[][] m = new int[7][7];
        int[][] s = new int[7][7];
        matrixChainOrder(p, m, s);
        printOptimalParens(s, 1, 6);
        System.out.println("\n" + m[1][6]);
    }

    static void matrixChainOrder(int[] p, int[][] m, int[][] s) {
        int n = p.length;
        for (int i = 0; i < n; i++) {
            m[i][i] = 0;
        }
        for (int l = 1; l < n; l++) {
            for (int i = 1; i < n - l; i++) {
                int j = i + l;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < m[i][j]) {
                        m[i][j] = q;
                        s[i][j] = k;
                    }
                }
            }
        }
    }

    static void printOptimalParens(int[][] s, int start, int end) {
        if (start == end) {
            System.out.print("A" + start);
        } else {
            System.out.print("(");
            printOptimalParens(s, start, s[start][end]);
            printOptimalParens(s, s[start][end] + 1, end);
            System.out.print(")");
        }
    }

}
