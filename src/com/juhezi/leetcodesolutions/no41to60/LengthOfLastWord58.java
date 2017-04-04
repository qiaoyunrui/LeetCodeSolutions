package com.juhezi.leetcodesolutions.no41to60;

/**
 * Created by qiao1 on 2017/4/4.
 */
public class LengthOfLastWord58 {

    public int lengthOfLastWord(String s) {
        String[] result = s.split(" ");
        if (result.length == 0)
            return 0;
        return result[result.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord58().lengthOfLastWord("Hello World"));
    }

}
