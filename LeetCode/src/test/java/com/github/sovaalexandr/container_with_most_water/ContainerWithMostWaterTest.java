package com.github.sovaalexandr.container_with_most_water;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest
{

    @Test
    void maxArea()
    {
        final ContainerWithMostWater target = new ContainerWithMostWater();

        assertEquals(49, target.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }
}