package com.example.springboot.demo.LeetCode.Graph;

import com.example.springboot.demo.LeetCode.Node.ListNode;

import java.util.HashMap;
import java.util.Map;

public class N41FirstMissingPositive {

    public static void main(String[] args) {

    }

    /**
     *
     * 41. 缺失的第一个正数
     * https://leetcode-cn.com/problems/first-missing-positive/
     *
     *
     * **/

    public int firstMissingPositive(int[] nums) {
        if(nums.length == 0) return 1;
        Map<String,Integer> map = new HashMap<>();
        int max = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max) max = nums[i];
            if(nums[i]>0 && !map.containsValue(nums[i])) map.put(i+"",nums[i]);
        }
        for(int i = 1;i<= max;i++){
            if(!map.containsValue(i)) return i;
        }

        return max <= 0? 1:max+1;
    }
}
