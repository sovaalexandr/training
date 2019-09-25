package com.github.sovaalexandr.add_two_numbers_ii;

import com.github.sovaalexandr.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersIITest
{

    @Test
    void addTwoNumbers()
    {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode expected = new ListNode(7);
        expected.next = new ListNode(8);
        expected.next.next = new ListNode(0);
        expected.next.next.next = new ListNode(7);

        assertEquals(expected, (new AddTwoNumbersII()).addTwoNumbers(l1, l2));
    }
}