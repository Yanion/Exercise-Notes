package com.example.springboot.demo.LeetCode.Node;

import java.util.ArrayList;
import java.util.List;

public class N18DeleteNode {

    public static void main(String[] args) {

    }

    /**
     *
     * 面试题18. 删除链表的节点
     * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
     *
     *
     * **/

    public ListNode deleteNode(ListNode head, int val) {
        while (head.val == val){
            head = head.next;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode returnTemp = head;
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
