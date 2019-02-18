package com.github.sovaalexandr.container_with_most_water;

/**
 * {@see https://leetcode.com/problems/container-with-most-water/}
 */
public class ContainerWithMostWater
{
    public int maxArea(int[] height) {
        if (null == height || 0 == height.length) return 0;

        int max = 0; //Math.min(height[0], height[height.length - 1]) * height.length;

        for (int left = 0, right = height.length - 1; left < right;) {
            int minHeight, width = right - left;
            if (height[left] <= height[right]) {
                minHeight = height[left];
                left++;
            } else {
                minHeight = height[right];
                right--;
            }
            max = Math.max(max, width * minHeight);
        }

        return max;
    }
}
