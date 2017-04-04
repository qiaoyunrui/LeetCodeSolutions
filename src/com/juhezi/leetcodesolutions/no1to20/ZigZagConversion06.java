package com.juhezi.leetcodesolutions.no1to20;

/**
 * Created by qiao1 on 2017/4/4.
 */
public class ZigZagConversion06 {

    public static void main(String[] args) {
        String old_str = "PAYPALISHIRING";
        String test = "0123456789ABCDEFGH";
        System.out.println(new ZigZagConversion06().convert(old_str, 3));
    }

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder result = new StringBuilder(s.length());
        char[] chars = s.toCharArray();
        int len = chars.length;
        int m = numRows - 1;
        for (int i = 0; i < numRows; i++) { //行循环.
            int index = 0;
            while (true) {
                if (i % m != 0) {   //中间位置
                    if (index * 2 * m + i >= len) break;
                    result.append(chars[index * 2 * m + i]);
                    if ((index + 1) * m * 2 - i >= len) break;
                    result.append(chars[(index + 1) * m * 2 - i]);    //列数 * m * 2 - 行数
                } else if (i % (2 * m) == 0) {  //上方位置
                    if (index * 2 * m >= len) break;
                    result.append(chars[index * 2 * m]);    //列数 * 2 * m
                } else {    //下方位置
                    if ((2 * index + 1) * m >= len) break;
                    result.append(chars[(2 * index + 1) * m]);    // 列数 * m
                }
                index++;  //行数加1
            }
        }
        return result.toString();
    }

}
