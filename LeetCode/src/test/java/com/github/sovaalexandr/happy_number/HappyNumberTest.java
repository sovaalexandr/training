package com.github.sovaalexandr.happy_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest
{

    @Test
    void isHappy()
    {
        HappyNumber target = new HappyNumber();

        assertTrue(target.isHappy(19));
    }
    @Test
    void isHappy0()
    {
        HappyNumber target = new HappyNumber();

        assertFalse(target.isHappy0(17));
    }
}