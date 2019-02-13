package com.github.sovaalexandr.longest_palindromic_substring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringExpandTest
{

    @Test
    void longestPalindrome()
    {
        final LongestPalindromicSubstringExpand target = new LongestPalindromicSubstringExpand();

        assertEquals("aba", target.longestPalindrome("babad"));
        assertEquals("babab", target.longestPalindrome("babab"));
        assertEquals("bb", target.longestPalindrome("cbbd"));
        assertEquals("a", target.longestPalindrome("a"));
    }

    @Test
    void expandAroundCenter()
    {
        final LongestPalindromicSubstringExpand target = new LongestPalindromicSubstringExpand();

        assertEquals(1, target.expandAroundCenter("a".toCharArray(), 0, 0));
        assertEquals(3, target.expandAroundCenter("bab".toCharArray(), 1, 1));
        assertEquals(4, target.expandAroundCenter("baab".toCharArray(), 1, 2));
        assertEquals(3, target.expandAroundCenter("babd".toCharArray(), 1, 1));
        assertEquals(2, target.expandAroundCenter("baad".toCharArray(), 1, 2));
    }
}