package com.example.springboot.demo.LeetCode.Node;

public class N0202KthToLast {

    public static void main(String[] args) {

    }

    /**
     *
     * 面试题24. 反转链表
     * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
     *
     *  206. 反转链表
     *  https://leetcode-cn.com/problems/reverse-linked-list/
     * **/

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}
