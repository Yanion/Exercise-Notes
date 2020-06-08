package com.example.springboot.demo.LeetCode.Array;

import com.example.springboot.demo.LeetCode.Node.ListNode;

public class N26RemoveDuplicates {

    public static void main(String[] args) {

    }

    /**
     *
     * 26. 删除排序数组中的重复项
     * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
     *
     *
     *
     * **/

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] == nums[i]) nums[++j] = nums[i];
        }
        return ++j;
    }
}
