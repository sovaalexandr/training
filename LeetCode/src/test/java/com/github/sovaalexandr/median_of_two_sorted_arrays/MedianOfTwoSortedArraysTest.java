package com.github.sovaalexandr.median_of_two_sorted_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest
{

    @Test
    void findMedianSortedArrays()
    {
        final MedianOfTwoSortedArrays target = new MedianOfTwoSortedArrays();

        assertEquals(2.0, target.findMedianSortedArrays(new int[] {1, 3}, new int[] {2}));
        assertEquals(1.0, target.findMedianSortedArrays(new int[] {1}, new int[] {1}));
        assertEquals(2.5, target.findMedianSortedArrays(new int[] {4}, new int[] {1, 2, 3}));
        assertEquals(2.5, target.findMedianSortedArrays(new int[] {2}, new int[] {1, 3, 4}));
        assertEquals(3.0, target.findMedianSortedArrays(new int[] {2}, new int[] {1, 3, 4, 5}));
        assertEquals(3.5, target.findMedianSortedArrays(new int[] {2}, new int[] {1, 3, 4, 5, 6}));
        assertEquals(2.5, target.findMedianSortedArrays(new int[] {1, 3}, new int[] {2, 4}));
        assertEquals(2.5, target.findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4}));
        assertEquals(1., target.findMedianSortedArrays(new int[] {}, new int[] {1}));
        assertEquals(2.5, target.findMedianSortedArrays(new int[] {}, new int[] {2,3}));
        assertEquals(-1., target.findMedianSortedArrays(new int[] {3}, new int[] {-2, -1}));
        assertEquals(3.5, target.findMedianSortedArrays(new int[] {1, 3, 5}, new int[] {2, 4, 6}));
        assertEquals(3.5, target.findMedianSortedArrays(new int[] {1, 3, 7}, new int[] {2, 4, 8}));
        assertEquals(4.0, target.findMedianSortedArrays(new int[] {1, 3, 5}, new int[] {2, 4, 6, 8}));
        assertEquals(4.0, target.findMedianSortedArrays(new int[] {1, 3, 5, 7}, new int[] {2, 4, 6}));
        assertEquals(4.0, target.findMedianSortedArrays(new int[] {1, 2, 6, 7}, new int[] {3, 4, 5}));
        assertEquals(4.5, target.findMedianSortedArrays(new int[] {1, 2, 7, 8}, new int[] {3, 4, 5, 6}));
        assertEquals(2.0, target.findMedianSortedArrays(new int[] {2, 2, 2, 2}, new int[] {2, 2, 2}));
    }
}