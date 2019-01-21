package com.github.sovaalexandr.remove_duplicates_from_sorted_array;

public class RemoveDuplicatesFastest
{
    public int removeDuplicates(int[] nums) {
        int last = 0;
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] != nums[last])
                nums[++last] = nums[i];
        }

        return (last + 1);
    }
}
