package com.example.springboot.demo.LeetCode.Node;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.List;

public class N1290GetDecimalValue {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        System.out.println(getDecimalValue(head));
    }

    /**
     *
     * 1290. 二进制链表转整数
     * https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
     *
     * **/

    public static int getDecimalValue(ListNode head) {
        if (head.next == null) return head.val;
        int decimalVal = 0;
        List<Integer> data = new ArrayList<>();
        while (head.next != null){
            data.add(head.val);
            head = head.next;
        }
        data.add(head.val);
        for (int i = data.size() - 1; i >=0 ; i--) {
            decimalVal = decimalVal + data.get(i) * (int)Math.pow(2,data.size()-i-1);
        }
        return decimalVal;
    }
}
