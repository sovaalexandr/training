package com.github.sovaalexandr.sort_colors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortColorsTest
{

    @Test
    void sortColors()
    {
        int[] nums = {2, 0, 2, 1, 1, 0};
        new SortColors().sortColors(nums);
        assertArrayEquals(new int[] { 0, 0, 1, 1, 2, 2 }, nums);
    }
}