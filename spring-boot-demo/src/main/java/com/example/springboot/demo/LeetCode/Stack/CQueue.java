package com.example.springboot.demo.LeetCode.Stack;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 */
public class CQueue {

    private  Stack<Integer> stackWrite;
    private  Stack<Integer> stackRead;

    public CQueue() {
        stackRead = new Stack<>();
        stackWrite = new Stack<>();
    }

    public void appendTail(int value) {
        stackWrite.push(value);
    }

    public int deleteHead() {
        if (stackRead.isEmpty() && stackWrite.isEmpty()) return  -1;
        if (!stackRead.isEmpty()) return stackRead.pop();
        if (!stackWrite.isEmpty() && stackRead.isEmpty()) {
            while (!stackWrite.isEmpty()){
                stackRead.push(stackWrite.pop());
            }
        }
        return stackRead.pop();
    }

}
