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

        ListNode middle = head, last = head.next;
        while (null != last && null != last.next) {
            middle = middle.next;
            last = last.next.next;
        }
        ListNode right = middle.next;
        middle.next = null;

        return merge(sortList(head), sortList(right));
    }

    private ListNode merge(ListNode left, ListNode right) {
        if (null == left) return right;
        if (null == right) return left;

        ListNode current = null, head = null;
        while (left != null && right != null) {
            if (left.val < right.val) {
                if (null == current) head = current = left;
                else {
                    current.next = left;
                    current = current.next;
                }
                left = left.next;
            } else {
                if (null == current) head = current = right;
                else {
                    current.next = right;
                    current = current.next;
                }
                right = right.next;
            }
        }
        current.next = null == left ? right : left;

        return head;
    }
}
