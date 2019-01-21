package com.github.sovaalexandr.add_two_numbers;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode top = new ListNode(0);
        ListNode curr = top;

        int forNext = 0;
        while (null != l1 || null != l2) {
            int val1 = 0;
            if (null != l1) {
                val1 = l1.val;
                l1 = l1.next;
            }
            int val2 = 0;
            if (null != l2) {
                val2 = l2.val;
                l2 = l2.next;
            }
            int val = val1 + val2 + forNext;
            forNext = val / 10;
            val %= 10;
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        if (1 == forNext) {
            curr.next = new ListNode(1);
        }

        return top.next;
    }
}
