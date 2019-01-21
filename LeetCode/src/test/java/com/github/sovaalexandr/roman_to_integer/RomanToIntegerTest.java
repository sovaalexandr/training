package com.github.sovaalexandr.roman_to_integer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest
{

    @Test
    void romanToInt()
    {
        final RomanToInteger target = new RomanToInteger();
        Assertions.assertEquals(3, target.romanToInt("III"));
        Assertions.assertEquals(4, target.romanToInt("IV"));
        Assertions.assertEquals(9, target.romanToInt("IX"));
        Assertions.assertEquals(58, target.romanToInt("LVIII"));
        Assertions.assertEquals(1994, target.romanToInt("MCMXCIV"));
    }
}