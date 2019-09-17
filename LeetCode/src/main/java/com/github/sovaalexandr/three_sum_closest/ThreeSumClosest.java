package com.github.sovaalexandr.three_sum_closest;

import java.util.Arrays;

/**
 * {@see https://leetcode.com/problems/3sum-closest/}
 */
public class ThreeSumClosest
{
    public int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        if (nums.length <= 3) {
            for (int num : nums) sum += num;
            return sum;
        }
        int diff = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int current = nums[i] + nums[l] + nums[r];
                if (current == target) return target;
                if (current < target) l++;
                else r--;

                int currentDiff = Math.abs(target - current);
                if (0 == diff || currentDiff < diff) {
                    sum = current;
                    diff = currentDiff;
                }
            }
        }
        return sum;
    }
}
