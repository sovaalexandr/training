package com.github.sovaalexandr.version_strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FastestVersionStringsTest
{

    @Test
    void compareVersion()
    {
        final FastestVersionStrings target = new FastestVersionStrings();
        Assertions.assertEquals(1, target.compareVersion("1", "0"));

        Assertions.assertEquals(-1, target.compareVersion("1", "1.1"));
        Assertions.assertEquals(-1, target.compareVersion("1.2.3.4", "1.2.3.5"));
    }
}