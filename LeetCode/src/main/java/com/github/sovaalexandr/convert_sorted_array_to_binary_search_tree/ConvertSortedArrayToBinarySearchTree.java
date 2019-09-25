package com.github.sovaalexandr.convert_sorted_array_to_binary_search_tree;

import com.github.sovaalexandr.TreeNode;

public class ConvertSortedArrayToBinarySearchTree
{
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int from, int to) {
        if (from > to) return null;
        if (from == to) return new TreeNode(nums[to]);
        int middle = (to - from + 1) >> 1;
        TreeNode node = new TreeNode(nums[from + middle]);
        node.left = sortedArrayToBST(nums, from, from + middle - 1);
        node.right = sortedArrayToBST(nums, from + middle + 1, to);
        return node;
    }
}
