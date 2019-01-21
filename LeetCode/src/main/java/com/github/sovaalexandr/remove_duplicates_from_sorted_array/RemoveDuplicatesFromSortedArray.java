package com.github.sovaalexandr.remove_duplicates_from_sorted_array;

/**
 * {@see https://leetcode.com/problems/remove-duplicates-from-sorted-array}
 */
public class RemoveDuplicatesFromSortedArray
{
    public int removeDuplicates(int[] nums) {
        if (null == nums || 0 == nums.length) return 0;

        int current = nums[0], length = nums.length, i = 1;
        while (true) {
            if (i >= length) break;
            if (current == nums[i]) { // It's a duplicate
                int j;
                for (j = i; j < length; j ++) {
                    if (current != nums[j]) break;
                }
                length -= (j - i);
                System.arraycopy(nums, j - 1, nums, i - 1, length - (i - 1));
            }
            current = nums[i];
            i++;
        }

        return length;
    }
}
