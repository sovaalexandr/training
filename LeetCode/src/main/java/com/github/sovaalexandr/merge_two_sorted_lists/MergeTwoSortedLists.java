package com.github.sovaalexandr.merge_two_sorted_lists;

import com.github.sovaalexandr.ListNode;

/**
 * {@see https://leetcode.com/problems/merge-two-sorted-lists/}
 *
 */
public class MergeTwoSortedLists
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1) return l2;
        if (null == l2) return l1;

        ListNode stub = new ListNode(0);
        ListNode current = stub;
        while (l1 != null || l2 != null) {
            if (null == l1) {
                current.next = l2;
                break;
            } else if (null == l2) {
                current.next = l1;
                break;
            } else if (l1.val < l2.val) {
                current.next = l1;
                current = current.next;
                l1 = l1.next;
            } else if (l2.val < l1.val) {
                current.next = l2;
                current = current.next;
                l2 = l2.next;
            } else {
                current.next = l1;
                current = current.next;
                l1 = l1.next;
                current.next = l2;
                current = current.next;
                l2 = l2.next;
            }
        }

        return stub.next;
    }

}
