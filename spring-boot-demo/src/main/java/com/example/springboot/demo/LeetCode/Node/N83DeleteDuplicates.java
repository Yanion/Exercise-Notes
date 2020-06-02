package com.example.springboot.demo.LeetCode.Node;

import java.util.ArrayList;
import java.util.List;

public class N83DeleteDuplicates {

    public static void main(String[] args) {

    }

    /**
     *
     * 83. 删除排序链表中的重复元素
     * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
     *
     *
     * **/

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode returnTemp = head;
        while (curr != null){
            while (prev.val == curr.val){
                if (curr.next == null){
                    prev.next = null;
                    curr = null;
                    break;
                }
                prev.next = curr.next;
                curr = curr.next;
            }
            if (curr != null){
                prev = curr;
                curr = curr.next;
            }
        }
        return returnTemp;
    }
}
