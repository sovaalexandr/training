package com.github.sovaalexandr.swap_nodes_in_pairs;

import com.github.sovaalexandr.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesInPairsTest
{

    @Test
    void swapPairs()
    {
        SwapNodesInPairs target = new SwapNodesInPairs();

        ListNode actual = new ListNode(1);
        actual.next = new ListNode(2);
        actual.next.next = new ListNode(3);
        actual.next.next.next = new ListNode(4);

        ListNode expected = new ListNode(2);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(4);
        expected.next.next.next = new ListNode(3);

        assertEquals(expected, target.swapPairs(actual));
    }
}