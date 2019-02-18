package com.github.sovaalexandr.zigzag_conversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagConversionTest
{

    @Test
    void convert()
    {
        final ZigzagConversion target = new ZigzagConversion();

        assertEquals("PAHNAPLSIIGYIR", target.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", target.convert("PAYPALISHIRING", 4));
        assertEquals("ACBD", target.convert("ABCD", 2));
    }
}