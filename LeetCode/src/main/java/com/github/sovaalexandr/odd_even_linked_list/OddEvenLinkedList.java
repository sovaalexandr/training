package com.github.sovaalexandr.odd_even_linked_list;

import com.github.sovaalexandr.ListNode;

/**
 * {@see https://leetcode.com/problems/odd-even-linked-list/}
 * 1 - 2 - 3 - 4 - 5 - 6 - 7
 */
public class OddEvenLinkedList
{
    public ListNode oddEvenList(ListNode head) {
        if (null == head || null == head.next) return head;
        ListNode fast = head.next, slow = head;
        while (null != fast && null != fast.next) {
            // remove odd
            ListNode odd = fast.next;
            fast.next = fast.next.next;
            fast = fast.next;
            /*
             * 1 - 2 - 4 - ...
             *     3 -/
             */

            // insert odd before even
            ListNode even = slow.next;
            slow.next = odd;
            slow = slow.next;
            slow.next = even;
        }
        return head;
    }
}
