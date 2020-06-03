package com.example.springboot.demo.LeetCode.Node;

public class N203RemoveElements {

    public static void main(String[] args) {

    }

    /**
     *
     * 203. 移除链表元素
     * https://leetcode-cn.com/problems/remove-linked-list-elements/
     *
     *
     * **/

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode prev = null;
        ListNode curr = head;
//        1,1,1,2,3
        while (curr != null && curr.val == val) {
            ListNode temp = curr;
            curr = curr.next;
            prev = temp;
        }
        ListNode returnTemp = curr;
        while (curr != null){
            if (curr.val == val){
                prev.next = curr.next;
                curr = curr.next;
            }else {
                prev = curr;
                curr = curr.next;
            }
        }
        return returnTemp;
    }
}
