package com.github.sovaalexandr.integer_to_roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegrToRomanTest
{

    @Test
    void intToRoman()
    {
        final IntegrToRoman target = new IntegrToRoman();

        Assertions.assertEquals("III", target.intToRoman(3));
        Assertions.assertEquals("IV", target.intToRoman(4));
        Assertions.assertEquals("IX", target.intToRoman(9));
        Assertions.assertEquals("LVIII", target.intToRoman(58));
        Assertions.assertEquals("MCMXCIV", target.intToRoman(1994));
    }
}