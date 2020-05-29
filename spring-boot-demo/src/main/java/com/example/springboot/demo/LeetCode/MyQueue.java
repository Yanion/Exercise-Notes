package com.example.springboot.demo.LeetCode;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/implement-queue-using-stacks-lcci/
 */
public class MyQueue {

    private Stack firstStack;
    private Stack secondStack;

    /** Initialize your data structure here. */
    public MyQueue() {
        firstStack = new Stack();
        secondStack = new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        firstStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return (int)secondStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (!secondStack.isEmpty()) return (int)secondStack.peek();
        while (!firstStack.isEmpty()){
            secondStack.push(firstStack.pop());
        }
        return (int)secondStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return firstStack.isEmpty() && secondStack.isEmpty();
    }
}
