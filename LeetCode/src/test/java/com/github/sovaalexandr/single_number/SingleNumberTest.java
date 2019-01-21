package com.github.sovaalexandr.single_number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest
{

    @Test
    void singleNumber()
    {
        final SingleNumber target = new SingleNumber();

        Assertions.assertEquals(1, target.singleNumber(new int[] {
                2,2,1
        }));
        Assertions.assertEquals(4, target.singleNumber(new int[] {
                4,1,2,1,2
        }));
    }
}