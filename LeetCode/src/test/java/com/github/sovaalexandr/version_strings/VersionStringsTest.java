package com.github.sovaalexandr.version_strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VersionStringsTest
{

    @Test
    void compareVersion()
    {
        final VersionStrings target = new VersionStrings();
        Assertions.assertEquals(1, target.compareVersion("1", "0"));

        Assertions.assertEquals(-1, target.compareVersion("1", "1.1"));
    }
}