package com.example.springboot.demo.LeetCode.Node;

import java.util.ArrayList;
import java.util.List;

public class N0203DeleteNode {

    public static void main(String[] args) {

    }

    /**
     *
     * 面试题 02.03
     * https://leetcode-cn.com/problems/delete-middle-node-lcci/
     *
     * 237. 删除链表中的节点
     * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
     * **/

    public static void deleteNode(ListNode node) {
        if (node.next != null){
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
