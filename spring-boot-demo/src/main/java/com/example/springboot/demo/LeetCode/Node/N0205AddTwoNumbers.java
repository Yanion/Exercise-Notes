package com.example.springboot.demo.LeetCode.Node;

import java.util.ArrayList;
import java.util.List;

public class N0205AddTwoNumbers {

    public static void main(String[] args) {

    }

    /**
     *
     * 面试题 02.05. 链表求和
     * https://leetcode-cn.com/problems/sum-lists-lcci/
     *
     *
     * [2,4,3,5]
     * [5,6,4]
     *
     * **/

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode l1cur = l1;
        ListNode l2cur = l2;
        int carrier = 0;
        int a = l1.val;
        int b = l2.val;
        if (a+b>=10){
            carrier = 1;
        }
        ListNode cur = new ListNode((a+b)%10);
        ListNode returnHead = cur;
        l1cur = l1cur.next;
        l2cur = l2cur.next;
        while (l1cur != null || l2cur != null){
            int tempA = 0;
            int tempB = 0;
            if (l1cur == null){
                System.out.println("l2cur:"+l2cur.val);
                tempB = l2cur.val;
                cur.next = l2cur;
                l2cur = l2cur.next;
                // continue;
            }else if (l2cur == null){
                tempA = l1cur.val;
                cur.next = l1cur;
                l1cur = l1cur.next;
                // continue;
            }
            if (l1cur != null && l2cur != null){
                tempA = l1cur.val;
                tempB = l2cur.val;

                l1cur = l1cur.next;
                l2cur = l2cur.next;
            }
            System.out.println("tempA:"+tempA);
            System.out.println("tempB:"+tempB);
            ListNode temp = new ListNode((tempA+tempB+carrier)%10);
            if (tempA+tempB+carrier>=10){
                carrier = 1;
            }else {
                carrier = 0;
            }
            cur.next = temp;
            cur = temp;
        }
        if (carrier == 1){
            ListNode last = new ListNode(1);
            cur.next = last;
        }
        return  returnHead;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ans = new ListNode(0);
        ListNode cur = ans;
        while (l1 != null || l2 != null) {
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;

            int num = num1 + num2 + carry;
            carry = num / 10;

            cur.next = new ListNode(num % 10);

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            cur = cur.next;
        }
        if (carry == 1)
            cur.next = new ListNode(carry);
        return ans.next;
    }
}
