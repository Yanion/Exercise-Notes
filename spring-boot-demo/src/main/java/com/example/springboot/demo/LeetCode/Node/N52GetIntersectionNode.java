package com.example.springboot.demo.LeetCode.Node;

public class N52GetIntersectionNode {

    public static void main(String[] args) {

    }

    /**
     *
     * 面试题52. 两个链表的第一个公共节点
     * https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
     *
     *
     * 面试题 02.07. 链表相交
     * https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci/
     *
     *
     * 160. 相交链表
     * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/submissions/
     *
     * **/

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        while (a != b){
            a = a == null? headB:a.next;
            b = b == null? headA:b.next;
        }
        return a;
    }
}
