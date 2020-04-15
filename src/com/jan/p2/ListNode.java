package com.jan.p2;

/**
 * Definition for singly-linked list.
 *
 * @author Jan
 * @Date 2020/4/15 10:40
 */

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
