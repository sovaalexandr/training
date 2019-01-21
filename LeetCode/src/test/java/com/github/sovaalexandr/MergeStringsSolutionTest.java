package com.github.sovaalexandr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsSolutionTest
{

    @Test
    void meregeStrings()
    {
        Assertions.assertEquals(MergeStringsSolution.meregeStrings("abc", "def"), "adbecf");
    }
}