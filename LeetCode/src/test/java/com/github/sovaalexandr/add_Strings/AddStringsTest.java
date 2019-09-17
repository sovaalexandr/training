package com.github.sovaalexandr.add_Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddStringsTest
{

    @Test
    void addStrings()
    {
        AddStrings target = new AddStrings();

        assertEquals("1000", target.addStrings("999", "1"));
        assertEquals("107", target.addStrings("98", "9"));
        assertEquals("9133", target.addStrings("9133", "0"));
    }
}