package com.github.sovaalexandr.two_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest
{

    @Test
    void twoSum()
    {
        final TwoSum target = new TwoSum();

        Assertions.assertArrayEquals(new int[] {0, 1}, target.twoSum(new int[] {2, 7, 11, 15}, 9));
    }
}