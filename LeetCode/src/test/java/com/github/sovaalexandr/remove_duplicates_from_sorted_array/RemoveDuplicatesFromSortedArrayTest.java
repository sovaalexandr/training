package com.github.sovaalexandr.remove_duplicates_from_sorted_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest
{

    @Test
    void removeDuplicates()
    {
        final RemoveDuplicatesFromSortedArray target = new RemoveDuplicatesFromSortedArray();
        int[] actual;

         actual = new int[]{
                1, 1, 2
        };
        Assertions.assertEquals(2, target.removeDuplicates(actual));
        assertArrayEquals(new int[] {1, 2}, Arrays.copyOfRange(actual, 0, 2));

        actual = new int[]{
                1, 2, 2
        };
        Assertions.assertEquals(2, target.removeDuplicates(actual));
        assertArrayEquals(new int[] {1, 2}, Arrays.copyOfRange(actual, 0, 2));

        actual = new int[]{
                1, 2, 2, 3
        };
        Assertions.assertEquals(3, target.removeDuplicates(actual));
        assertArrayEquals(new int[] {1, 2, 3}, Arrays.copyOfRange(actual, 0, 3));

        actual = new int[] {
                0,0,1,1,1,2,2,3,3,4
        };
        Assertions.assertEquals(5, target.removeDuplicates(actual));
        assertArrayEquals(new int[] {0, 1, 2, 3, 4}, Arrays.copyOfRange(actual, 0, 5));
    }

    @Test
    void removeDuplicatesFastest()
    {
        RemoveDuplicatesFastest target = new RemoveDuplicatesFastest();
        int[] actual;

        actual = new int[]{
                1, 1, 2
        };
        Assertions.assertEquals(2, target.removeDuplicates(actual));
        assertArrayEquals(new int[] {1, 2}, Arrays.copyOfRange(actual, 0, 2));

        actual = new int[]{
                1, 2, 2
        };
        Assertions.assertEquals(2, target.removeDuplicates(actual));
        assertArrayEquals(new int[] {1, 2}, Arrays.copyOfRange(actual, 0, 2));

        actual = new int[]{
                1, 2, 2, 3
        };
        Assertions.assertEquals(3, target.removeDuplicates(actual));
        assertArrayEquals(new int[] {1, 2, 3}, Arrays.copyOfRange(actual, 0, 3));

        actual = new int[] {
                0,0,1,1,1,2,2,3,3,4
        };
        Assertions.assertEquals(5, target.removeDuplicates(actual));
        assertArrayEquals(new int[] {0, 1, 2, 3, 4}, Arrays.copyOfRange(actual, 0, 5));
    }
}