package com.github.sovaalexandr.count_of_smaller_numbers_after_self;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOfSmallerNumbersAfterSelfTest
{

    @Test
    void countSmaller()
    {
        final TrivialSolution trivialSolution = new TrivialSolution();
        final CountOfSmallerNumbersAfterSelf target = new CountOfSmallerNumbersAfterSelf();

        int[] ints;
        /**
         * 5, 2, 6, 1
         * 2, 1, 1, 0
         */
        ints = new int[] {
                5, 2, 6, 1
        }; // Arrays.asList(2, 1, 1, 0)
        Assertions.assertEquals(
                trivialSolution.countSmaller(ints),
                target.countSmaller(ints)
        );
        /**
         * 5, 2, 3, 6, 1
         * 3, 1, 1, 1, 0
         */
        ints = new int[] {
                5, 2, 3, 6, 1
        }; // Arrays.asList(2, 1, 1, 0)
        Assertions.assertEquals(
                trivialSolution.countSmaller(ints),
                target.countSmaller(ints)
        );

    }
}