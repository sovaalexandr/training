package com.github.sovaalexandr.swap_nodes_in_pairs;

import com.github.sovaalexandr.ListNode;

/**
 * {@see https://leetcode.com/problems/swap-nodes-in-pairs/}
 */
public class SwapNodesInPairs
{
    public ListNode swapPairs(ListNode head) {
        if (null == head || null == head.next) return head;
        ListNode tail = head.next;
        head.next = swapPairs(head.next.next);
        tail.next = head;
        return tail;
    }
}
