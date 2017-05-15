package com.juhezi.solutions.dp;

import java.util.Stack;

/**
 * Created by qiao1 on 2017/4/6.
 * <p>
 * 切割钢条问题
 * 给定一段长度为n英寸的钢条和一个价格表pi，求钢条的切割方案，使得销售收益rn最大。
 * <p>
 * 长度	1	2	3	4	5	6	7	8	9	10
 * 价格	1	5	8	9	10	17	17	20	24	30
 */
public class CutRod {

    public static void main(String[] args) {
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        System.out.println(extendedBottomUpCutRod(prices, 4));
    }

    /**
     * 自顶向下递归实现
     *
     * @param prices
     * @param n
     * @return
     */
    static int cutRod(int[] prices, int n) {
        if (n == 0) {
            return 0;
        }
        int q = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            q = Math.max(q, prices[i - 1] + cutRod(prices, n - i));
        }
        return q;
    }

    /**
     * 带备忘的自顶向下法
     *
     * @param p
     * @param n
     * @return
     */
    static int memoizedCutRod(int[] p, int n) {
        int[] r = new int[n + 1];   //备忘录
        for (int i = 1; i < n + 1; i++) {
            r[i] = Integer.MIN_VALUE;
        }
        return memoizedCutRodAux(p, n, r);
    }

    static int memoizedCutRodAux(int[] p, int n, int[] r) {
        if (r[n] >= 0) //如果备忘录中已经存在
            return r[n];
        int q;
        if (n == 0) {
            q = 0;
        } else {
            q = Integer.MIN_VALUE;
            for (int i = 1; i < n + 1; i++) {
                q = Math.max(q, p[i - 1] + memoizedCutRodAux(p, n - i, r));
            }
        }
        r[n] = q;
        return q;
    }


    /**
     * 自底向上版本
     *
     * @param p
     * @param n
     * @return
     */
    static int bottomUpCutRod(int[] p, int n) {
        int[] r = new int[n + 1];
        r[0] = 0;
        int q;
        for (int j = 1; j < n + 1; j++) {
            q = Integer.MIN_VALUE;
            for (int i = 1; i <= j; i++) {
                q = Math.max(q, p[i - 1] + r[j - i]);
            }
            r[j] = q;
        }
        return r[n];
    }

    Stack<Integer> stack = new Stack<>();

    /**
     * 自底向上，并且保存对应的切割方案（即打印切割的长度段）
     *
     * @param p
     * @param n
     * @return
     */
    static int extendedBottomUpCutRod(int[] p, int n) {
        int[] r = new int[n + 1];
        String[] strs = new String[n + 1];
        strs[0] = "";
        r[0] = 0;
        int q;
        String str = "";
        for (int j = 1; j < n + 1; j++) {
            q = Integer.MIN_VALUE;
            for (int i = 1; i <= j; i++) {
                if (q < p[i - 1] + r[j - i]) {
                    q = p[i - 1] + r[j - i];
                    str = strs[j - i] +  i + " ";
                }
            }
            strs[j] = str;
            r[j] = q;
        }
        System.out.println(strs[n]);
        return r[n];
    }

}
