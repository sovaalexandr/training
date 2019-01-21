package com.github.sovaalexandr.remove_nth_node_from_end_of_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.github.sovaalexandr.remove_nth_node_from_end_of_list.RemoveNthNodeFromEndOfList.ListNode;

class RemoveNthNodeFromEndOfListTest
{

    @Test
    void removeNthFromEnd()
    {
        final RemoveNthNodeFromEndOfList target = new RemoveNthNodeFromEndOfList();
        ListNode expected, actual, tmp;
        actual = new ListNode(1);
        tmp = actual;
        tmp.next = new ListNode(2);
        tmp = tmp.next;
        tmp.next = new ListNode(3);
        tmp = tmp.next;
        tmp.next = new ListNode(4);
        tmp = tmp.next;
        tmp.next = new ListNode(5);

        expected = new ListNode(1);
        tmp = expected;
        tmp.next = new ListNode(2);
        tmp = tmp.next;
        tmp.next = new ListNode(3);
        tmp = tmp.next;
        tmp.next = new ListNode(5);

        Assertions.assertEquals(expected, target.removeNthFromEnd(actual, 2));
    }

    @Test
    void removeNthFromEnd0()
    {
        final RemoveNthNodeFromEndOfList target = new RemoveNthNodeFromEndOfList();
        ListNode actual;
        actual = new ListNode(1);

        assertNull(target.removeNthFromEnd(actual, 1));
    }

    @Test
    void removeNthFromEnd1()
    {
        final RemoveNthNodeFromEndOfList target = new RemoveNthNodeFromEndOfList();
        ListNode actual, tmp;
        actual = new ListNode(1);
        tmp = actual;
        tmp.next = new ListNode(2);

        Assertions.assertEquals(new ListNode(2), target.removeNthFromEnd(actual, 2));
    }

    @Test
    void removeNthFromEnd2()
    {
        final RemoveNthNodeFromEndOfList target = new RemoveNthNodeFromEndOfList();
        ListNode actual, tmp;
        actual = new ListNode(1);
        tmp = actual;
        tmp.next = new ListNode(2);

        Assertions.assertEquals(new ListNode(1), target.removeNthFromEnd(actual, 1));
    }
}