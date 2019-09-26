package com.github.sovaalexandr.add_two_numbers_ii;

import com.github.sovaalexandr.ListNode;

/**
 * {@see https://leetcode.com/problems/add-two-numbers-ii/}
 */
public class AddTwoNumbersII
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1end = null, l2end = null, current = null;
        int rest = 0;
        while (l1 != l1end || l2 != l2end) {
            ListNode l1head = l1, l2head = l2; // Start from the beginning

            int l1val = 0;
            if (l1 != l1end) {
                while (l1head.next != l1end) l1head = l1head.next;
                l1val = l1head.val;
                l1end = l1head;
            }

            int l2val = 0;
            if (l2 != l2end) {
                while (l2head.next != l2end) l2head = l2head.next;
                l2val = l2head.val;
                l2end = l2head;
            }

            rest = rest + l1val + l2val;
            ListNode tmp = new ListNode(rest % 10);
            rest /= 10;
            tmp.next = current;
            current = tmp;
        }
        if (0 != rest) {
            ListNode tmp = new ListNode(rest);
            tmp.next = current;
            current = tmp;
        }
        return current;
    }
}
