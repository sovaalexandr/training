package com.github.sovaalexandr.count_of_smaller_numbers_after_self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrivialSolution
{

    public List<Integer> countSmaller(int[] nums) {
        if (0 == nums.length) return Collections.emptyList();
        final ArrayList<Integer> integers = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int num = 0;
            for (int j = i; j < nums.length; j++) if (nums[i] > nums[j]) num ++;
            integers.add(i, num);
        }

        return integers;
    }
}
