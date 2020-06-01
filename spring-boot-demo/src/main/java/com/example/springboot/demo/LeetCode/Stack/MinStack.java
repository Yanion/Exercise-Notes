package com.example.springboot.demo.LeetCode.Stack;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/min-stack-lcci/
 */
public class MinStack {

    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if (minStack.isEmpty() || x <= minStack.peek()){
            minStack.push(x);
        }
        dataStack.push(x);
    }

    public void pop() {
        int obj = dataStack.pop();
        if (obj == minStack.peek() && minStack.size() > 1) minStack.pop();
        if (dataStack.isEmpty()) minStack.clear();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
