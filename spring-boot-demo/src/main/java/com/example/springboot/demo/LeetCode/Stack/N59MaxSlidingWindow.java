package com.example.springboot.demo.LeetCode.Stack;

public class N59MaxSlidingWindow {

    public static void main(String[] args) {

        int[] nums = {2,7,9,3,1};
//        System.out.println(rob(nums));

//        int[] nums1 = {1,2,1,1};
        int[] nums1 = {1,3,-1,-3,5,3,6,7};
        System.out.println(maxSlidingWindow(nums1,3).toString());

    }

    /**
     * https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/
     * **/

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length > 0 && k > 0){
            int resLength =  nums.length - k + 1;
            if (resLength > 0){
                int[] results = new int[resLength];
                for (int i = 0; i < resLength ; i++) {
                    int maxRes = nums[i];
                    for (int j = i; j < i + k; j++) {
                        if (nums[j] > maxRes){
                            maxRes = nums[j];
                        }
                    }
                    results[i] = maxRes;
                }
                return results;
            }else {
                return new int[0];
            }
        }else {
            return new int[0];
        }
    }
}
