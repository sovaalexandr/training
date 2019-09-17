package com.github.sovaalexandr.palindrome_linked_list;

import com.github.sovaalexandr.ListNode;

/**
 * {@see https://leetcode.com/problems/palindrome-linked-list/}
 * Input: 1->2->2->1
 * Target: 1<-2 2->1
 * Output: true
 */
public class PalindromeLinkedList
{
    public boolean isPalindrome(ListNode head) {
        // List of no or single element
        if (head == null || head.next == null) return true;

        ListNode fast = head;
        ListNode prev = null, next;

        while (null != fast) {
            if (null == fast.next) {
                /* Odd number of nodes:
                 * 1<-2  3->2->1
                 *    p  h     f
                 */
                head = head.next;
                break;
            }
            // Advance fast two times faster than slow
            fast = fast.next.next;

            // Reversing what is behind
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        /* At this point we reached the end of list with fast and middle of list with slow
         * Also head now points to a middle of a list but in reverse order
         *
         * Odd number of nodes:
         * 1<-2  3->2->1
         *    p  h     f
         *
         * Even number of nodes:
         * 1<-2 2->1
         *    p h    f
         */

        while (null != prev && null != head) {
            if (prev.val != head.val) return false;
            prev = prev.next;
            head = head.next;
        }
        return true;
    }
}
