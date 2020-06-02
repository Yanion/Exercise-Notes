package com.example.springboot.demo.LeetCode.Node;

import java.util.ArrayList;
import java.util.List;

public class N0102RemoveDuplicateNodes {

    public static void main(String[] args) {

    }

    /**
     *
     * 面试题 02.01. 移除重复节点
     * https://leetcode-cn.com/problems/remove-duplicate-node-lcci/
     *
     *
     * **/

    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null || head.next == null) return head;
        List<Integer> data = new ArrayList<>();
        ListNode prev = null;
        ListNode curr = head;
        ListNode returnTemp = head;
        while (curr != null){
            if (data.contains(curr.val)){
                prev.next = curr.next;
                curr = curr.next;
            }else{
                data.add(curr.val);
                prev = curr;
                curr = curr.next;
            }
        }
        return returnTemp;
    }
}
