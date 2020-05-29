package com.example.springboot.demo.LeetCode;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyQueue {

    private Stack myStack;

    /** Initialize your data structure here. */
    public MyQueue() {
        myStack = new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        myStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (myStack.isEmpty()) throw new EmptyStackException();
        int obj = (int)myStack.pop();
        while (!myStack.isEmpty()){
            obj = (int)myStack.pop();
        }
        return obj;
    }

    /** Get the front element. */
    public int peek() {
        if (myStack.isEmpty()) throw new EmptyStackException();
        Stack peekStack = new Stack();
        Stack myStackTemp = myStack;
        int len = myStack.size();
        System.out.println("myStack:"+myStack.toString());
        for (int i = 0; i <len ; i++) {
            peekStack.push(myStackTemp.pop());
        }
        System.out.println("peekStack:"+peekStack.toString());
        return (int)peekStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return myStack.isEmpty();
    }
}
