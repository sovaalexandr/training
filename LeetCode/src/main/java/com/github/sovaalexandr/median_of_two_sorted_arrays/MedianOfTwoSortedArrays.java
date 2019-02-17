package com.github.sovaalexandr.median_of_two_sorted_arrays;

/**
 * {@see https://leetcode.com/problems/median-of-two-sorted-arrays/}
 */
public class MedianOfTwoSortedArrays
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (null == nums1 || 0 == nums1.length) { // Left array is empty
            return medianOf(nums2);
        } else if (null == nums2 || 0 == nums2.length) { // Left array is empty
            return medianOf(nums1);
        }

        final int length = nums1.length + nums2.length;
        final int medianIdx = length >> 1;
        int left = nums1[0], right = left, i = 0, j = 0;
        for (;i + j <= medianIdx;) {
            left = right;
            if (i == nums1.length) {
                right = nums2[j++];
            } else if (j == nums2.length) {
                right = nums1[i++];
            } else if (nums1[i] <= nums2[j]) {
                right = nums1[i++];
            } else if (nums2[j] <= nums1[i]) {
                right = nums2[j++];
            }
        }
        return 1 == length % 2
                ? right // Odd - median is one of elements
                : (left + right) / 2.0;
    }

    private double medianOf(int[] nums) {
        final int middle = nums.length >> 1;
        return 1 == nums.length % 2
                ? nums[middle] // Odd number of elements - median is element in the middle.
                : (nums[middle - 1] + nums[middle]) / 2.0; // Even number of elements - median is between two middle elements.
    }
}
