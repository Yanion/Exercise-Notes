package com.example.springboot.demo.LeetCode.Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/
 */
public class MaxQueue {

    private List<Integer> dataList;
    private Stack<Integer> maxStack;

    /** initialize your data structure here. */
    public MaxQueue() {
        dataList = new ArrayList<>();
        maxStack = new Stack<>();
    }

    public void push_back(int x) {
        if (maxStack.isEmpty()){
            maxStack.push(x);
        }else {
            if (x > maxStack.peek()){
                maxStack.clear();
                maxStack.push(x);
            }else if (x == maxStack.peek()){
                maxStack.push(x);
            }else {
                Stack<Integer> tempStack = new Stack<>();
                while (!maxStack.isEmpty() && x<maxStack.peek()){
                    tempStack.push(maxStack.pop());
                }
                tempStack.push(x);
                maxStack.clear();
                while (!tempStack.isEmpty()){
                    maxStack.push(tempStack.pop());
                }
            }
        }
        dataList.add(x);
    }

    public int pop_front() {
        if (dataList.isEmpty()) return -1;
        int obj = dataList.get(0);
        dataList.remove(0);
        if (obj == maxStack.peek() && maxStack.size() >= 1) maxStack.pop();
        if (dataList.isEmpty()) maxStack.clear();
        return obj;
    }


    public int max_value() {
        if (dataList.size()<=0) return -1;
        return maxStack.peek();
    }
}
