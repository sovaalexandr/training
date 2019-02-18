package com.github.sovaalexandr.broken_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrokenCalculatorTest
{

    @Test
    void brokenCalc()
    {
        final BrokenCalculator target = new BrokenCalculator();

        assertEquals(2, target.brokenCalc(2, 3));
        assertEquals(2, target.brokenCalc(5, 8));
        assertEquals(3, target.brokenCalc(3, 10));
        assertEquals(1023, target.brokenCalc(1024, 1));
    }
}