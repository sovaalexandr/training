package com.github.sovaalexandr.sort_list;

import com.github.sovaalexandr.ListNode;

/**
 * {@see https://leetcode.com/problems/sort-list/}
 * Example 1:
 * Input: 4->2->1->3
 * Output: 1->2->3->4
 *
 * Example 2:
 * Input: -1->5->3->4->0
 * Output: -1->0->3->4->5
 */
public class SortList
{
    public ListNode sortList(ListNode head) {
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
