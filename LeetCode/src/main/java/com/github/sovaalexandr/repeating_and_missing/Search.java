package com.github.sovaalexandr.repeating_and_missing;

/**
 * {@see https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/}
 */
public class Search
{
    public RepeatingAndMissing findRepeatingAndMissing(int[] input) {
        RepeatingAndMissing result = new RepeatingAndMissing();
        int[] temp = new int[input.length];
        for (int a: input) {
            final int i = a - 1;
            if (temp[i] > 0) {
                result.repeating = a;
            }
            temp[i]++;
        }
        for (int i = 0; i < temp.length; i++) {
            if (0 == temp[i]) {
                result.missing = i+1;
            }
        }

        return result;
    }
}
