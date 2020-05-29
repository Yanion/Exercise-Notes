package com.example.springboot.demo.LeetCode;

import java.util.Stack;

public class N1047RemoveDuplicates {

    public static void main(String[] args) {

        String s1 = "abbaca";
        System.out.println(removeDuplicates(s1));

    }

    /**
     * https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
     **/
    public static String removeDuplicates(String S) {
        char[] strs = S.toCharArray();
        Stack<String> strStack = new Stack<>();
        strStack.push(String.valueOf(strs[0]));
        for (int i = 1; i <strs.length ; i++) {
            if (!strStack.isEmpty() && String.valueOf(strs[i]).equals(strStack.peek())){
                strStack.pop();
            }else {
                strStack.push(String.valueOf(strs[i]));
            }
        }
        String result = "";
        Stack<String> resStack = new Stack<>();
        while (!strStack.isEmpty()){
            resStack.push(strStack.pop());
        }
        while (!resStack.isEmpty()){
            result += resStack.pop();
        }
        return result;
    }
}
