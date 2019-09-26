package com.github.sovaalexandr.sort_list;

import com.github.sovaalexandr.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortListTest
{

    /*
     * Input: 4->2->1->3
     * Output: 1->2->3->4
     */
    @Test
    void sortList0()
    {
        ListNode input = new ListNode(4);
        input.next = new ListNode(2);
        input.next.next = new ListNode(1);
        input.next.next.next = new ListNode(3);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);

        assertEquals(expected, new SortList().sortList(input));
    }

    /*
     * Input: -1->5->3->4->0
     * Output: -1->0->3->4->5
     */
    @Test
    void sortList1()
    {
        ListNode input = new ListNode(-1);
        input.next = new ListNode(5);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);
        input.next.next.next.next = new ListNode(0);

        ListNode expected = new ListNode(-1);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);
        expected.next.next.next.next = new ListNode(5);

        assertEquals(expected, new SortList().sortList(input));
    }
}