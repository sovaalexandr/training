package com.github.sovaalexandr.single_number;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber
{
    public int singleNumber(int[] nums) {

        final Set<Integer> candidates = new HashSet<>();
        candidates.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            final int current = nums[i];
            if (!candidates.remove(current)) {
                candidates.add(current);
            }
        }

        return candidates.iterator().next();
    }
}
