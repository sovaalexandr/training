package com.github.sovaalexandr.add_to_array_form_of_integer;

import java.util.LinkedList;
import java.util.List;

/**
 * {@see https://leetcode.com/problems/add-to-array-form-of-integer/}
 */
public class AddToArrayFormOfInteger
{
    public List<Integer> addToArrayForm(int[] A, int K) {
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = A.length - 1; i >= 0; i--) {
            int digit = A[i] + K % 10;
            K = K / 10 + digit / 10;
            result.addFirst(digit % 10);
        }
        while (K > 0) {
            result.addFirst(K % 10);
            K /= 10;
        }
        return result;
    }
}
