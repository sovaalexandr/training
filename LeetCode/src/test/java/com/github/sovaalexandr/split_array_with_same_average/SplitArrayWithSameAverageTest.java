package com.github.sovaalexandr.split_array_with_same_average;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitArrayWithSameAverageTest
{

    @Test
    void splitArraySameAverage()
    {
        final SplitArrayWithSameAverage target = new SplitArrayWithSameAverage();
        Assertions.assertEquals(true, target.splitArraySameAverage(new int[] {
                1,2,3,4,5,6,7,8
        }));

        Assertions.assertEquals(false, target.splitArraySameAverage(new int[] {
                0
        }));

        Assertions.assertEquals(true, target.splitArraySameAverage(new int[] {
                2,0,5,6,16,12,15,12,4
        }));

        /**
         * [2, 3, 5, 11, 19] => [2, 3, 19] + [5, 11]
         */
        Assertions.assertEquals(true, target.splitArraySameAverage(new int[] {
                5,3,11,19,2
        }));
    }

    @Test void haveSubsequenceOfLengthAndSum() {
        final SplitArrayWithSameAverage target = new SplitArrayWithSameAverage();

        Assertions.assertTrue(target.haveSubsequenceOfLengthAndSum(new int[] {
                1,2,3,4,5,6,7,8
        }, 4, 18, 0));

        Assertions.assertTrue(target.haveSubsequenceOfLengthAndSum(new int[] {
                2, 3, 5, 11, 19
        }, 2, 16, 0));
    }
}