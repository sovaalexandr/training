package com.github.sovaalexandr.three_sum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest
{
    @Test
    void threeSum()
    {
        ThreeSum target = new ThreeSum();

        assertEquals(
                Arrays.asList(
                        Arrays.asList(-1, -1, 2),
                        Arrays.asList(-1, 0, 1)
                ),
                target.threeSum(new int[] {
                        -1, 0, 1, 2, -1, -4
                }));

        assertEquals(
                Arrays.asList(Arrays.asList(0,0,0)),
                target.threeSum(new int[] {
                        0, 0, 0, 0
                }));
    }

    @Test
    void threeSum0()
    {
        ThreeSum target = new ThreeSum();

        assertEquals(
                Arrays.asList(
                        Arrays.asList(0, 1, -1),
                        Arrays.asList(2, -1, -1)
                ),
                target.threeSum0(new int[] {
                        -1, 0, 1, 2, -1, -4
                }));

        assertEquals(
                Arrays.asList(Arrays.asList(0,0,0)),
                target.threeSum0(new int[] {
                        0, 0, 0, 0
                }));
    }
}