package com.github.sovaalexandr.remove_element;

/**
 * {@see https://leetcode.com/problems/remove-element/}
 */
public class RemoveElement
{
    public int removeElement(int[] nums, int val) {
        if (null == nums || 1 > nums.length) return 0;

        int i = 0;

        // Skip the beginning
        for (; i < nums.length; i++) if (nums[i] == val) break;

        // Right now nums[i] == val || i == nums.length
        for(int j = i + 1; j < nums.length; j++) {
            if (nums[j] == val) {
                continue; // Skip elements while not find suitable or end
            }
            nums[i] = nums[j]; // Place found element to suitable pos
            i++;
        }

        return i;
    }
}
