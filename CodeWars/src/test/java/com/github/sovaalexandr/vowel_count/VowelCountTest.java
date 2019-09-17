package com.github.sovaalexandr.vowel_count;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelCountTest
{

    @Test
    void vowelsIn()
    {
        VowelCount target = new VowelCount();
        assertEquals(5, target.vowelsIn("abracadabra"));
    }
}