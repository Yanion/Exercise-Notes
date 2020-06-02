package com.example.springboot.demo.LeetCode.Node;

import javax.swing.*;

public class N024ReverseList {

    public static void main(String[] args) {

    }

    /**
     *
     * 面试题 02.02. 返回倒数第 k 个节点
     * https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/
     *
     * **/

    public int kthToLast(ListNode head, int k) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        curr = prev;
        while (curr != null){
            if (k == 1) return curr.val;
            k--;
            curr = curr.next;
        }
        return 0;
    }
}
