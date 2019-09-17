package com.github.sovaalexandr.linked_list_cycle;

import com.github.sovaalexandr.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest
{

    /**
     *
     * 3 -> 2 -> 0 -> -4
     *      \---------/
     * h    f
     *      h          f
     *          hf
     *
     */
    @Test
    void hasCycle0()
    {
        ListNode actual = new ListNode(3);
        actual.next = new ListNode(2);
        actual.next.next = new ListNode(0);
        ListNode loop = new ListNode(-4);
        actual.next.next.next = loop;
        loop.next = actual.next;

        LinkedListCycle target = new LinkedListCycle();

        assertTrue(target.hasCycle(actual));
    }
    /**
     *
     * 3 -> 2 -> 0 -> -4 -> 5
     *      \--------------/
     * h    f
     *      h          f
     *      f    h
     *                hf
     */
    @Test
    void hasCycle1()
    {
        ListNode actual = new ListNode(3);
        actual.next = new ListNode(2);
        actual.next.next = new ListNode(0);
        actual.next.next.next = new ListNode(-4);
        ListNode loop = new ListNode(5);
        actual.next.next.next.next = loop;
        loop.next = actual.next;

        LinkedListCycle target = new LinkedListCycle();

        assertTrue(target.hasCycle(actual));
    }
    /**
     *
     * 3 -> 2 -> 0 -> -4
     */
    @Test
    void hasNoCycle0()
    {
        ListNode actual = new ListNode(3);
        actual.next = new ListNode(2);
        actual.next.next = new ListNode(0);
        actual.next.next.next = new ListNode(-4);

        LinkedListCycle target = new LinkedListCycle();

        assertFalse(target.hasCycle(actual));
    }
}