package com.example.springboot.demo.LeetCode.Node;

public class N0206IsPalindrome {

    public static void main(String[] args) {

    }

    /**
     *
     * 面试题 02.06. 回文链表
     * https://leetcode-cn.com/problems/palindrome-linked-list-lcci/
     *
     *
     * 234. 回文链表
     * https://leetcode-cn.com/problems/palindrome-linked-list/
     * **/

    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while (head != null){
            len++;
            head = head.next;
        }
        head = temp;
        ListNode prev = null;
        ListNode curr = head;
        for (int i = 0; i < len/2 ; i++) {
            if (curr != null){
                ListNode tem = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tem;
            }else {
                break;
            }
        }
        ListNode newHead = prev;
        ListNode subHead = curr;
        if (len%2 == 1){
            ListNode singleNewHead = new ListNode(subHead.val);
            singleNewHead.next = prev;
            newHead = singleNewHead;
        }
        while (newHead != null && subHead != null){
            if (newHead.val != subHead.val){
                return false;
            }else {
                newHead = newHead.next;
                subHead = subHead.next;
            }
        }
        return true;
    }
}
