package com.github.sovaalexandr.reverse_integer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest
{

    @Test
    void reverse()
    {
        final ReverseInteger target = new ReverseInteger();

        Assertions.assertEquals(-321, target.reverse(-123));
        Assertions.assertEquals(0, target.reverse(1534236469));
        Assertions.assertEquals(0, target.reverse(-2147483648));
        Assertions.assertEquals(2147483641, target.reverse(1463847412));
        Assertions.assertEquals(-2147483641, target.reverse(-1463847412));
    }
}