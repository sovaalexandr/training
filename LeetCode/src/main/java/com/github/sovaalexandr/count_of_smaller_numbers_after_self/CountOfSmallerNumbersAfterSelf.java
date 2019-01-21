package com.github.sovaalexandr.count_of_smaller_numbers_after_self;

import java.util.*;

public class CountOfSmallerNumbersAfterSelf
{
    /**
     * [5, 2, 3, 6, 1]
     *  3, 1, 1, 1, 0
     *
     * -> 1 -> // Starting point.
     *                      1 {cnt: 1, left: 0} r: 0
     *
     * -> 6 -> // is greater then current val (1) - go to right and increase counter of numbers that are less.
     *         // There is nothing to the right - here is your place
     *                      1 {cnt: 1, left: 0} r: 0
     *                       \
     *                       6 {cnt: 1, left: 0} r: 1
     *
     * -> 3 -> // is greater then current val (1) - go to right.
     *         // is less then current val (6) - go to the left.
     *         // And Node(6).left++    to get    Node(6).left == 1
     *         // There is nothing to the left - here is your place
     *                      1 {cnt: 1, left: 0}
     *                       \
     *                       6 {cnt: 1, left: 1}
     *                      /
     *   {cnt: 1, left: 0} 3
     *
     * -> 2 -> // is greater then current val (1) - go to right.
     *         // is less or equal then current val (6) - go to the left.
     *         // And Node(6).left++   to get    Node(6).left == 2
     *         // is less or equal then current val (3) - go to the left.
     *         // And Node(3).left++   to get    Node(3).left == 1
     *         // There is nothing to the left - here is your place
     *                      1 {cnt: 1, left: 0}
     *                       \
     *                       6 {cnt: 1, left: 2}
     *                      /
     *   {cnt: 1, left: 0} 3
     *                    /
     * {cnt: 1, left: 0} 2
     *
     * -> 5 -> // is greater then current val (1) - go to right.
     *         // is less or equal then current val (6) - go to the left.
     *         // And Node(6).left++   to get    Node(6).left == 3
     *                      1 {cnt: 1, left: 0}
     *                       \
     *                       6 {cnt: 1, left: 3}
     *                      /
     *   {cnt: 1, left: 1} 3
     *                    / \
     * {cnt: 1, left: 0} 2  5 {cnt: 1, left: 0}
     */
    public List<Integer> countSmaller(int[] nums) {
        if (nums == null || nums.length == 0) return Collections.emptyList();
        if (1 == nums.length) return Collections.singletonList(0);

        Integer[] result = new Integer[nums.length];
        // We definitely know that last element marked as 0
        //
        Node lastOne = new Node(nums[nums.length - 1]);
        result[nums.length - 1] = 0;

        // We already used last element and now we start from pre-last element going to first element.
        for (int i = nums.length - 2; i >= 0; i--) {
            Node current = lastOne;
            int nodesWithLessValue = 0;
            while (true)
                if (current.value < nums[i]) {
                    nodesWithLessValue += (current.haveNodesToTheLeft + current.nodesOfTheSameValue);
                    if (null == current.right) {
                        current.right = new Node(nums[i]);
                        break;
                    }
                    current = current.right;
                } else if (current.value > nums[i]) {
                    current.haveNodesToTheLeft++;
                    if (null == current.left) {
                        current.left = new Node(nums[i]);
                        break;
                    }
                    current = current.left;
                } else {
                    nodesWithLessValue += current.haveNodesToTheLeft;
                    current.nodesOfTheSameValue++;
                    break;
                }
            result[i] = nodesWithLessValue;
        }

        return List.of(result);
    }

    public static class Node
    {
        public Node left;
        public Node right;

        public int haveNodesToTheLeft = 0;
        public int nodesOfTheSameValue = 1;

        public final int value;

        public Node(int val) {
            value = val;
        }
    }
}
