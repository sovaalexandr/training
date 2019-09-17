package com.github.sovaalexandr.reverse_nodes_in_k_group;

import com.github.sovaalexandr.ListNode;

/**
 * {@see https://leetcode.com/problems/reverse-nodes-in-k-group/}
 * 1 - 2 - 3 - 4 - 5 -
 *         1 -
 *     2 - 1 -
 * 3 - 2 - 1 -
 *
 *
 *   1 - 2 - 3 - 4 - 5 -
 * - 1
 * - 1 - 2
 * - 1 - 2 - 3
 *
 *   4 - 5 -
 *       4 -
 *   5 - 4 -
 */
public class ReverseNodesInKGroup
{
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode tail = null, newHead = null;
        for (int i = 0; i < k; i++) {
            ListNode tmp;
            if (null == head) { // Not enough nodes - roll back;
                while (newHead != null) {
                    tmp = newHead.next;
                    newHead.next = head;
                    head = newHead;
                    newHead = tmp;
                }
                return head;
            }
            if (0 == i) tail = head;
            tmp = head;
            head = head.next;
            tmp.next = newHead;
            newHead = tmp;
        }
        if (null != tail) tail.next = reverseKGroup(head, k);
        return newHead;
    }
}
