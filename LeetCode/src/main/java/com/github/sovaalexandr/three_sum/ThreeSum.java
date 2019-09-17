package com.github.sovaalexandr.three_sum;

import java.util.*;

/**
 * {@see https://leetcode.com/problems/3sum/}
 * -1, 0, 1, 2, -1, -4
 *
 * -4, -1, -1, 0, 1, 2
 */
public class ThreeSum
{
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        if (null == nums) return res;
        Arrays.sort(nums);
        if (3 > nums.length || 0 < nums[0] || 0 > nums[nums.length-1]) return res;
        int target;
        int l, r;
        for (int i = 0; nums[i] <= 0 && i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            target = 0 - nums[i];
            l = i+1; r = nums.length-1;
            while (l < r) {
                if (nums[l] + nums[r] < target) l++;
                else if(nums[l] + nums[r] > target) r--;
                else {
                    List<Integer> ls = new LinkedList<>();
                    ls.add(nums[i]);
                    ls.add(nums[l]);
                    ls.add(nums[r]);
                    res.add(ls);
                    while (l<r && nums[l+1]==nums[l]) l++;
                    while (r>l && nums[r-1]==nums[r]) r--;
                    l++; r--;
                }
            }
        }
        return res;
    }

    public List<List<Integer>> threeSum0(int[] nums) {
        int len = nums.length;
        if (len < 3) return new ArrayList<>();
        // Sort input array 1st
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        // Allocate enough space to avoid check in if statement
        int max = Math.max(nums[len - 1], Math.abs(nums[0]));
        byte[] hash = new byte[(max << 1) + 1];
        // Hash and count appearing times of every num
        for (int v : nums) {
            hash[v + max]++;
        }
        // Search the position of 0.
        // It also represents the position of the last negative number in the array
        int lastNeg = Arrays.binarySearch(nums, 0);
        // The pos. of the 1st pos. number in the array
        int firstPos = lastNeg;
        // 0 not found
        if (lastNeg < 0) {
            firstPos = ~lastNeg;
            lastNeg = -lastNeg - 2;
            // see Java API
        } else {
            // found
            // skip all 0
            while (lastNeg >= 0 && nums[lastNeg] == 0) --lastNeg;
            while (firstPos < len && nums[firstPos] == 0) ++firstPos;
            int zeroCount = firstPos - lastNeg - 1;
            // 0 appears 3 times at least
            if (zeroCount >= 3) {
                res.add(Arrays.asList(0, 0, 0));
            }
            // 0 appears at least 1 time
            if (zeroCount > 0) {
                // traverse all the pos. numbers to see whether or not there's a neg. number whose abs. val.
                // equals the pos. number
                for (int i = firstPos; i < len; ++i) {
                    // skip duplicate (same) elements
                    if (i > firstPos && nums[i] == nums[i - 1]) continue;
                    if (hash[-nums[i] + max] > 0) {
                        res.add(Arrays.asList(0, nums[i], -nums[i]));
                    }
                }
            }
        }
        // one positive number and two negetive numbers
        // traverse all the pos. numbers to find whether there are 2 neg. numbers to make the 3 numbers
        // add up to 0
        for (int i = firstPos; i < len; ++i) {
            // skip dups. (same elements)
            if (i > firstPos && nums[i] == nums[i - 1]) continue;
            // we can only traverse half of the pos. numbers
            int half;
            if (nums[i] % 2 != 0) half = -((nums[i] >> 1) + 1);
            else {
                half = -(nums[i] >> 1);
                if (hash[half + max] > 1) res.add(Arrays.asList(nums[i], half, half));
            }
            for (int j = lastNeg; j >= 0 && nums[j] > half; --j) {
                if (j < lastNeg && nums[j] == nums[j + 1]) continue;
                if (hash[(-nums[i] - nums[j]) + max] > 0)
                    res.add(Arrays.asList(nums[i], nums[j], -nums[i] - nums[j]));
            }
        }
        // one negative number and two positive numbers
        // traverse all the negative numbers to find whether there are two positive numbers to make the
        // 3 numbers add up to 0
        for (int i = lastNeg; i >= 0; --i) {
            // skip dups. (same elements)
            if (i < lastNeg && nums[i] == nums[i + 1]) continue;
            // we can only traverse half of the negative numbers
            int half;
            if (nums[i] % 2 != 0) half = -(nums[i] / 2 - 1);
            else {
                half = -(nums[i] >> 1);
                if (hash[half + max] > 1) res.add(Arrays.asList(nums[i], half, half));
            }
            for (int j = firstPos; j < len && nums[j] < half; ++j) {
                if (j > firstPos && nums[j] == nums[j - 1]) continue;
                if (hash[(-nums[i] - nums[j]) + max] > 0)
                    res.add(Arrays.asList(nums[i], nums[j], -nums[i] - nums[j]));
            }
        }
        return res;
    }
}
