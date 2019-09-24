package com.github.sovaalexandr.odd_even_linked_list;

import com.github.sovaalexandr.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenLinkedListTest
{

    @Test
    void oddEvenList0()
    {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);
        input.next.next.next.next = new ListNode(5);
        input.next.next.next.next.next = new ListNode(6);
        input.next.next.next.next.next.next = new ListNode(7);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(3);
        expected.next.next = new ListNode(5);
        expected.next.next.next = new ListNode(7);
        expected.next.next.next.next = new ListNode(2);
        expected.next.next.next.next.next = new ListNode(4);
        expected.next.next.next.next.next.next = new ListNode(6);

        assertEquals(expected, (new OddEvenLinkedList()).oddEvenList(input));
    }
}