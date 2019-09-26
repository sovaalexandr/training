package com.github.sovaalexandr.sort_colors;

/**
 * {@see https://leetcode.com/problems/sort-colors/}
 * Example:
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 */
public class SortColors
{
    public void sortColors(int[] nums) {
        if (null == nums || 0 == nums.length) return;
        int red = -1, green = -1, blue = -1;

        for (int i = 0; i < nums.length; i++) {
            if (0 == nums[i]) {
                red++;
                green++;
                blue++;
                nums[blue] = 2;
                nums[green] = 1;
                nums[red] = 0;
            } else if (1 == nums[i]) {
                green++;
                blue++;
                nums[blue] = 2;
                nums[green] = 1;
            } else {
                blue++;
                nums[blue] = 2;
            }
        }
    }
}
