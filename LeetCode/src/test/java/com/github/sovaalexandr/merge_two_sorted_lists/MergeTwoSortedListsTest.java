package com.github.sovaalexandr.merge_two_sorted_lists;

import com.github.sovaalexandr.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest
{

    /**
     * Input: 1->2->4, 1->3->4
     * Output: 1->1->2->3->4->4
     */
    @Test
    void mergeTwoLists0()
    {
        MergeTwoSortedLists target = new MergeTwoSortedLists();

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(2);
        expected.next.next.next = new ListNode(3);
        expected.next.next.next.next = new ListNode(4);
        expected.next.next.next.next.next = new ListNode(4);

        ListNode left = new ListNode(1);
        left.next = new ListNode(2);
        left.next.next = new ListNode(4);

        ListNode right = new ListNode(1);
        right.next = new ListNode(3);
        right.next.next = new ListNode(4);

        assertEquals(
                expected,
                target.mergeTwoLists(left, right)
        );
    }

    /**
     * Input: 1, 2
     * Output: 1->2
     */
    @Test
    void mergeTwoLists1()
    {
        MergeTwoSortedLists target = new MergeTwoSortedLists();

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);

        ListNode left = new ListNode(1);

        ListNode right = new ListNode(2);

        assertEquals(
                expected,
                target.mergeTwoLists(left, right)
        );
    }
}