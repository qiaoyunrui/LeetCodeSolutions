package com.juhezi.solutions.dp;

/**
 * Created by qiao1 on 2017/4/7.
 */
public class AliProblem {

    static int[] array = {3, 4, 2, 1, 3, 1};

    /**
     * OK
     *
     * @param args
     */
    public static void main(String[] args) {

        int n = array.length;
        int[][] m = new int[n][n];
        int[][] s = new int[n][n];  //记录路径
        for (int i = 0; i < n; i++) {
            m[i][i] = 1;
        }
        for (int l = 1; l < n; l++) {
            for (int i = 0; i < n - l; i++) {
                int j = i + l;
                if (i + array[i] >= j) {    //i 可以直达 j
                    m[i][j] = 1;
                    s[i][j] = i;
                } else {
                    m[i][j] = l;    //最大值
                }
                for (int k = i; k < j; k++) {
                    int q = m[i][k] + m[k][j];
                    if (q < m[i][j]) {
                        m[i][j] = q;
                        s[i][j] = k;
                    }
                }
            }
        }
        print(s, 0, 5);
        System.out.println(array[n - 1]);
    }

    static void print(int[][] s, int start, int end) {
        if (start == end) {
            System.out.print(array[start] + ",");
        } else {
            if (end != s[start][end]) {
                print(s, start, s[start][end]);
            }
            if (start != s[start][end]) {
                print(s, s[start][end], end);
            }
        }
    }

}
