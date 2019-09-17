package com.github.sovaalexandr.regular_expression_matching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest
{

    @Test
    void isMatch()
    {
        RegularExpressionMatching target = new RegularExpressionMatching();

        assertTrue(target.isMatch("aa", "a*"));
        assertTrue(target.isMatch("ab", ".*"));
        assertTrue(target.isMatch("aab", "c*a*b"));
        assertTrue(target.isMatch("aaa", "ab*a*c*a"));
        assertTrue(target.isMatch("mississippi", "mis*is*.p*."));

        assertFalse(target.isMatch("aa", "a"));
        assertFalse(target.isMatch("aaa", "aa"));
        assertFalse(target.isMatch("aaa", "aaaa"));
        assertFalse(target.isMatch("mississippi", "mis*is*p*."));
    }
}