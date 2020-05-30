package com.example.springboot.demo.LeetCode;

import java.util.ArrayList;
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
        if (maxStack.isEmpty() || x >= maxStack.peek()){
            maxStack.push(x);
        }
        dataList.add(x);
    }

    public int pop_front() {
        if (dataList.isEmpty()) return -1;
        int obj = dataList.get(0);
        dataList.remove(0);
        if (obj == maxStack.peek() && maxStack.size() > 1) maxStack.pop();
        if (dataList.isEmpty()) maxStack.clear();
        return obj;
    }


    public int max_value() {
        if (maxStack.isEmpty()) return -1;
        return maxStack.peek();
    }
}
