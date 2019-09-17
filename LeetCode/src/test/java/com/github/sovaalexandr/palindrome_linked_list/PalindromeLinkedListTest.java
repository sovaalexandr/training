package com.github.sovaalexandr.palindrome_linked_list;

import com.github.sovaalexandr.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest
{

    @Test
    void isPalindrome0()
    {
        PalindromeLinkedList target = new PalindromeLinkedList();

        ListNode actual = new ListNode(1);
        actual.next = new ListNode(2);
        actual.next.next = new ListNode(2);
        actual.next.next.next = new ListNode(1);

        assertTrue(target.isPalindrome(actual));
    }

    @Test
    void isPalindrome1()
    {
        PalindromeLinkedList target = new PalindromeLinkedList();

        ListNode actual = new ListNode(1);
        actual.next = new ListNode(2);

        assertFalse(target.isPalindrome(actual));
    }

    @Test
    void isPalindrome2()
    {
        PalindromeLinkedList target = new PalindromeLinkedList();

        ListNode actual = new ListNode(1);
        actual.next = new ListNode(2);
        actual.next.next = new ListNode(3);
        actual.next.next.next = new ListNode(2);
        actual.next.next.next.next = new ListNode(1);

        assertTrue(target.isPalindrome(actual));
    }
}