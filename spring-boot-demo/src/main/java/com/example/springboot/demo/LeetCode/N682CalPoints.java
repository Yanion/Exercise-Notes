package com.example.springboot.demo.LeetCode;
import java.util.Stack;

public class N682CalPoints {

    public static void main(String[] args) {


        String[] in = {"1","C","-62","-45","-68"};
        System.out.println(calPoints(in));

    }

    /**
     * https://leetcode-cn.com/problems/baseball-game/
     * **/

    public static int calPoints(String[] ops) {
        Stack<Integer> scoreStack = new Stack<>();
        for (int i = 0; i <ops.length ; i++) {
            if(ops[i].equals("+") && scoreStack.size()>=2){
                int lastScore1 = scoreStack.pop();
                int lastScore2 = scoreStack.pop();
                scoreStack.push(lastScore2);
                scoreStack.push(lastScore1);
                scoreStack.push(lastScore1 + lastScore2);
            }else if(ops[i].equals("D")){
                int lastScore = scoreStack.pop();
                scoreStack.push(lastScore);
                scoreStack.push(lastScore*2);
            }else if(ops[i].equals("C")){
                scoreStack.pop();
            }else{
                scoreStack.push(Integer.valueOf(ops[i]));
            }
        }
        int totalScore = 0;
        while (!scoreStack.isEmpty()){
            totalScore +=scoreStack.pop();
        }
        return totalScore;
    }
}
