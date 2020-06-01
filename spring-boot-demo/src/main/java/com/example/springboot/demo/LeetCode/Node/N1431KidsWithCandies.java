package com.example.springboot.demo.LeetCode.Node;

import java.util.ArrayList;
import java.util.List;

public class N1431KidsWithCandies {

    public static void main(String[] args) {

        int[] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies,3).toString());

    }

    /**
     * https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
     * **/

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        if (candies.length > 0){
            int max = candies[0];
            for (int i = 1; i <candies.length ; i++) {
                if (max < candies[i]) max = candies[i];
            }
            for (int j = 0; j < candies.length; j++) {
                for (int i = 0; i <= extraCandies ; i++) {
                    if (candies[j] + i == max) {
                        res.add(true);
                        break;
                    }else if (i == extraCandies){
                        res.add(false);
                    }
                }
            }
        }
        return res;
    }
}
