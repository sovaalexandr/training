package com.github.sovaalexandr.search_insert_position;

import java.util.Arrays;

/**
 * {@see https://leetcode.com/problems/search-insert-position/}
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (null == nums || nums.length == 0) return 0;
        int t = Arrays.binarySearch(nums, target);

        return t < 0 ? -t - 1 : t;
    }
}
