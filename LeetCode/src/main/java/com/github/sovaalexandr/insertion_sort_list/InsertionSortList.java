package com.github.sovaalexandr.insertion_sort_list;

import com.github.sovaalexandr.ListNode;

/**
 * {@see https://leetcode.com/problems/insertion-sort-list/}
 */
public class InsertionSortList
{
    public ListNode insertionSortList(ListNode head) {
        if (null == head || null == head.next) return head;

        ListNode current = head.next, prev = head;
        while (current != null) {
            if (prev.val > current.val) {
                // Remove node from list
                prev.next = current.next;
                if (head.val > current.val) { // Insert before head
                    current.next = head;
                    head = current;
                } else { // Insert before greater number
                    ListNode tmp = head;
                    while (tmp.next.val < current.val) tmp = tmp.next;
                    current.next = tmp.next;
                    tmp.next = current;
                }
            } else prev = prev.next;
            current = prev.next;
        }
        return head;
    }
}
