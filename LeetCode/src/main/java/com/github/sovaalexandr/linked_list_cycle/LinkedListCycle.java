package com.github.sovaalexandr.linked_list_cycle;

import com.github.sovaalexandr.ListNode;

/**
 * {@see https://leetcode.com/problems/linked-list-cycle/}
 *
 * 3 -> 2 -> 0 -> -4
 *      \---------/
 * h    f
 *      h          f
 *          hf
 *
 * 3 -> 2 -> 0 -> -4 -> 5
 *      \--------------/
 * h    f
 *      h          f
 *      f    h
 *                hf
 */
public class LinkedListCycle
{
    public boolean hasCycle(ListNode head) {
        if (null == head) return false;
        ListNode fast = head.next;
        while (null != fast) {
            if (null == fast.next) return false;
            if (fast == head) return true;
            fast = fast.next.next;
            head = head.next;
        }
        return false;
    }
}
