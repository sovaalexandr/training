package com.github.sovaalexandr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HolesTest
{

    @Test
    void countHoles()
    {
        Assertions.assertEquals(Holes.countHoles(630), 2);
    }
}