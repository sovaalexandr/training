package com.github.sovaalexandr.string_to_integer_atoi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerAtoiTest
{

    @Test
    void myAtoi()
    {
        final StringToIntegerAtoi target = new StringToIntegerAtoi();
        assertEquals(42, target.myAtoi("42"));
        assertEquals(42, target.myAtoi("      42"));
        assertEquals(42, target.myAtoi("      42ABCD"));
        assertEquals(-42, target.myAtoi("-42"));
        assertEquals(-42, target.myAtoi("      -42"));
        assertEquals(-42, target.myAtoi("      -42ABCD"));



        assertEquals(4193, target.myAtoi("4193 with words"));
        assertEquals(0, target.myAtoi("words and 987"));
        assertEquals(0, target.myAtoi("+-2"));
        assertEquals(2147483647 ,target.myAtoi("18446744073709551617"));
        assertEquals(-2147483648 ,target.myAtoi("-18446744073709551617")); // -91283472332
    }
}