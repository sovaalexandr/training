package com.github.sovaalexandr.middle_of_the_linked_list;

import com.github.sovaalexandr.ListNode;

/**
 * {@see https://leetcode.com/problems/middle-of-the-linked-list/}
 */
public class MiddleOfTheLinkedList
{
    public ListNode middleNode(ListNode head) {
        if (null == head || null == head.next) return head;

        ListNode fast = head;
        while (null != fast && null != fast.next) {
            fast = fast.next.next;
            head = head.next;
        }
        return head;
    }
}
