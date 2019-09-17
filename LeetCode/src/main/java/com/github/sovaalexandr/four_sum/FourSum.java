package com.github.sovaalexandr.four_sum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * {@see https://leetcode.com/problems/4sum/}
 */
public class FourSum
{
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new LinkedList<>();
        if (null == nums) return result;

        Arrays.sort(nums);

        if (4 > nums.length || nums[0] > 0 || nums[nums.length - 1] < 0) return result;

        for (int i = 0; i < nums.length - 3; i++) {
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
            if (nums[i] + nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] < target) continue;
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                if (nums[i] + nums[j] + nums[nums.length - 1] + nums[nums.length - 2] < target) continue;
                if (j != i + 1 && nums[j] == nums[j - 1]) continue;

                int l = j + 1, r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if (target > sum) l ++;
                    else if (target < sum) r--;
                    else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        while (l < r && nums[l + 1]==nums[l]) l++;
                        while (r > l && nums[r - 1]==nums[r]) r--;
                        l++; r--;
                    }
                }
            }
        }
        return result;
    }
}
