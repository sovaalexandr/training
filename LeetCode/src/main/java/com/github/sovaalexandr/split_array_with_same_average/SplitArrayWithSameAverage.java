package com.github.sovaalexandr.split_array_with_same_average;

import java.util.Arrays;

/**
 * {@see https://leetcode.com/problems/split-array-with-same-average/}
 */
public class SplitArrayWithSameAverage
{

    public boolean splitArraySameAverage(int[] A) {
        int aLength = A.length;
        if (1 == aLength) return false;

        int aSum = 0;
        Arrays.sort(A);
        for (int a0 : A) aSum += a0;

        // B sublist length: From 1 element up to half of elements
        for (int bLength = 1; bLength <= aLength / 2; bLength++) {
            // 1. Avg B == Avg A
            // bSum / bLength == aSum / aLength
            // bSum == aSum * bLength / aLength

            // 2. bSum - sum of integers so it is integer
            // 0 == aSum * bLength % aLength
            if (0 == (aSum * bLength) % aLength
                    && haveSubsequenceOfLengthAndSum(A, bLength, aSum * bLength / aLength, 0))
                return true;
        }

        return false;
    }

    /**
     * - Array is sorted
     * - Peek an element i
     * - Do we have subsequence of length = length - 1 and sum = sum - A[i]?
     *
     *
     *
     * [3, 5, 7, 8] l: 2 s: 13
     * Expect [5, 8]
     * sf: 0 => 3 - need to find l = 1, s = 10
     *      sf: 1 => 5 - need to find l = 0, s = 5
     *          - s != 0 => false
     *      sf: 2 => 7 - need to find l = 0, s = 3
     *          - s != 0 => false
     *      sf: 3 => 8 - need to find l = 0, s = 2
     *          - s != 0 => false
     * sf: 1 => 5 - need to find l = 1, s = 8
     *      sf: 2 => 7 - need to find l = 0, s = 1
     *          - s != 0 => false
     *      sf: 3 => 8 - need to find l = 0, s = 0
     *          - s != 0 => true <<<<<<<-------------Finally!
     */
    public boolean haveSubsequenceOfLengthAndSum(int[] A, int length, int sum, int startFrom) {
        if (0 == length) { // Maybe such an element is already found
            return 0 == sum; // Yes, previous one was just what we need
        } else for (int i = startFrom; i < A.length; i++) {
            if (haveSubsequenceOfLengthAndSum(A, length - 1, sum - A[i], i + 1)) {
                return true;
            }
        }
        return false;
    }
}
