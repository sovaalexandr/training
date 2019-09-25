package com.github.sovaalexandr.convert_sorted_array_to_binary_search_tree;

import com.github.sovaalexandr.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertSortedArrayToBinarySearchTreeTest
{

    @Test
    void sortedArrayToBST0()
    {
        TreeNode expected = new TreeNode(0);
        expected.left = new TreeNode(-3);
        expected.left.left = new TreeNode(-10);
        expected.right = new TreeNode(9);
        expected.right.left = new TreeNode(5);

        assertEquals(expected, (new ConvertSortedArrayToBinarySearchTree()).sortedArrayToBST(new int[] {
                -10,-3,0,5,9
        }));
    }
}