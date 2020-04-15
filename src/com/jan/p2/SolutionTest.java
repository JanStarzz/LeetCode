package com.jan.p2;


/**
 * @author Jan
 * @Date 2020/4/15 11:01
 */
class SolutionTest {



    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(8);
        ListNode l3 = new ListNode(7);
        ListNode l4 = new ListNode(6);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(4);
        l1.next = l3;
        l2.next = l4;
        l3.next = l5;
        l4.next = l6;
        System.out.println(579+468);
        System.out.println(new Solution().addTwoNumbers(l1,l2));
    }
}