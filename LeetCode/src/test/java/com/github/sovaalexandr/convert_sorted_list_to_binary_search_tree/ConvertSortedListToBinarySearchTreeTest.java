package com.github.sovaalexandr.convert_sorted_list_to_binary_search_tree;

import com.github.sovaalexandr.ListNode;
import com.github.sovaalexandr.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertSortedListToBinarySearchTreeTest
{
    @Test
    void sortedListToBST0()
    {
        ListNode input = new ListNode(-10);
        input.next = new ListNode(-3);
        input.next.next = new ListNode(0);
        input.next.next.next = new ListNode(5);
        input.next.next.next.next = new ListNode(9);

        ConvertSortedListToBinarySearchTree target = new ConvertSortedListToBinarySearchTree();
        TreeNode actual = new TreeNode(0);
        actual.left = new TreeNode(-3);
        actual.left.left = new TreeNode(-10);
        actual.right = new TreeNode(9);
        actual.right.left = new TreeNode(5);

        assertEquals(actual, target.sortedListToBST(input));
    }
    @Test
    void sortedListToBST1()
    {
        ListNode input = new ListNode(0);
        input.next = new ListNode(1);
        input.next.next = new ListNode(2);
        input.next.next.next = new ListNode(3);
        input.next.next.next.next = new ListNode(4);
        input.next.next.next.next.next = new ListNode(5);

        ConvertSortedListToBinarySearchTree target = new ConvertSortedListToBinarySearchTree();
        /*
                                    3
                                  /   \
                                1       5
                              /   \    /
                            0      2  4
         */
        TreeNode actual = new TreeNode(3);
        actual.left = new TreeNode(1);
        actual.left.left = new TreeNode(0);
        actual.left.right = new TreeNode(2);
        actual.right = new TreeNode(5);
        actual.right.left = new TreeNode(4);

        assertEquals(actual, target.sortedListToBST(input));
    }
}