package com.example.springboot.demo.LeetCode.Node;

public class N022GetKthFromEnd {

    public static void main(String[] args) {

    }

    /**
     *
     * 面试题22. 链表中倒数第k个节点
     * https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
     *
     * **/

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        curr = prev;
        prev = null;
        for (int i = k; i >0 ; i--) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
