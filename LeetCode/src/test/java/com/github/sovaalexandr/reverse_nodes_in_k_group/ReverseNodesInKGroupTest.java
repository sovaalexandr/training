package com.github.sovaalexandr.reverse_nodes_in_k_group;

import com.github.sovaalexandr.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNodesInKGroupTest
{

    @Test
    void reverseKGroup()
    {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);
        input.next.next.next.next = new ListNode(5);

        ListNode expected = new ListNode(3);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(1);
        expected.next.next.next = new ListNode(4);
        expected.next.next.next.next = new ListNode(5);

        ReverseNodesInKGroup target = new ReverseNodesInKGroup();
        assertEquals(expected, target.reverseKGroup(input, 3));
    }
}