package com.juhezi.leetcodesolutions.dp;

/**
 * Created by qiao1 on 2017/4/7.
 */
public class AliProblem {


    /**
     * 待解决
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {3, 1, 1, 1, 3, 1, 1, 1};
        int n = array.length;
        int[][] m = new int[n][n];
        int[][] s = new int[n][n];  //记录路径
        for (int i = 0; i < n; i++) {
            m[i][i] = 1;
        }
        for (int l = 1; l < n; l++) {
            for (int i = 0; i < n - l; i++) {
                int j = i + l;
                if (i + array[i] >= j) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = l;
                }
                for (int k = i; k < j; k++) {
                    int q = m[i][k] + m[k][j];
                    if (q < m[i][j]) {
                        m[i][j] = q;
                        s[i][j] = k;
//                        System.out.println(i + " " + j + " " + s[i][j]);
                    }
                }
            }
        }
//        System.out.println(m[0][7]);
//        print(s, 0, 7);
    }

    static void print(int[][] s, int start, int end) {
        if (start == end) System.out.print(start + " ");
        else {
            print(s, start, s[start][end]);
            print(s, s[start][end], end);
        }
    }

}
