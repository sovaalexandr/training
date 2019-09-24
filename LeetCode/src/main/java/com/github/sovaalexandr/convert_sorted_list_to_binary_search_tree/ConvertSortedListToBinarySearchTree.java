package com.github.sovaalexandr.convert_sorted_list_to_binary_search_tree;

import com.github.sovaalexandr.ListNode;
import com.github.sovaalexandr.TreeNode;

/**
 * {@see https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/}
 */
public class ConvertSortedListToBinarySearchTree
{
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;

        ListNode mid = this.findMiddleElement(head);

        TreeNode node = new TreeNode(mid.val);

        if (head == mid) return node;

        node.left = this.sortedListToBST(head);
        node.right = this.sortedListToBST(mid.next);
        return node;
    }

    private ListNode findMiddleElement(ListNode head) {

        ListNode prevPtr = null;
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            prevPtr = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        if (prevPtr != null) {
            prevPtr.next = null;
        }

        return slowPtr;
    }
}
