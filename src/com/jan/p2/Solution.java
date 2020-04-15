package com.jan.p2;

/**
 * @author Jan
 * @Date 2020/4/15 10:44
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        // 用i,j改变l1,l2的指向
        ListNode i = l1, j = l2, k = head;
        // 进位
        int carry = 0;
        // 当i或j不为空进入循环
        while (i != null|| j !=null){
            // 三段式获得val

            int var1 = i==null?0:i.val;
            int var2 = j==null?0:j.val;
            int sum = var1+var2+carry;
            if(sum>=10){
                carry = 1;
                sum -= 10;
            }else {
                carry = 0;
            }
            k.next = new ListNode(sum);
            k = k.next;
            if(i!=null){i = i.next;}
            if(j!=null){j = j.next;}
        }
        if (carry > 0) {
            k.next = new ListNode(carry);
        }
        return head.next;
    }

}
