package com.github.sovaalexandr.add_two_numbers;

import com.github.sovaalexandr.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest
{

    @Test
    void addTwoNumbers()
    {
        final AddTwoNumbers target = new AddTwoNumbers();

        final ListNode l10 = new ListNode(2);
        final ListNode l11 = new ListNode(4);
        l10.next = l11;
        l11.next = new ListNode(3);


        final ListNode l20 = new ListNode(5);
        final ListNode l21 = new ListNode(6);
        l20.next = l21;
        l21.next = new ListNode(4);


        final ListNode e10 = new ListNode(7);
        final ListNode e11 = new ListNode(0);
        e10.next = e11;
        e11.next = new ListNode(8);

        assertEquals(e10, target.addTwoNumbers(l10, l20));
    }

    @Test
    void addTwoNumbers0()
    {
        final AddTwoNumbers target = new AddTwoNumbers();

        final ListNode l10 = new ListNode(1);
        l10.next = new ListNode(8);


        final ListNode l20 = new ListNode(0);


        final ListNode e10 = new ListNode(1);
        e10.next = new ListNode(8);

        Assertions.assertEquals(e10, target.addTwoNumbers(l10, l20));
    }
}