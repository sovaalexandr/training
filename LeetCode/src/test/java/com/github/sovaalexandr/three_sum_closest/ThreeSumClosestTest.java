package com.github.sovaalexandr.three_sum_closest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumClosestTest
{

    @Test
    void threeSumClosest()
    {
        ThreeSumClosest target = new ThreeSumClosest();

        assertEquals(2, target.threeSumClosest(new int []{-1, 2, 1, -4}, 1));
        assertEquals(2, target.threeSumClosest(new int []{1,1,1,0}, -100));
    }
}