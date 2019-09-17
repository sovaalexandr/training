package com.github.sovaalexandr.detect_capital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectCapitalTest
{

    @Test
    void detectCapitalUse()
    {
        DetectCapital tagret = new DetectCapital();

        assertTrue(tagret.detectCapitalUse("USA"));
        assertTrue(tagret.detectCapitalUse("leetcode"));
        assertTrue(tagret.detectCapitalUse("Google"));

        assertFalse(tagret.detectCapitalUse("leetCode"));
        assertFalse(tagret.detectCapitalUse("LeetCode"));
    }
}