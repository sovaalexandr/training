package com.github.sovaalexandr.longest_palindromic_substring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest
{
    @Test
    void longestPalindrome() {
        final LongestPalindromicSubstring target = new LongestPalindromicSubstring();

        assertEquals("bab", target.longestPalindrome("babad"));
        assertEquals("babab", target.longestPalindrome("babab"));
        assertEquals("bb", target.longestPalindrome("cbbd"));
        assertEquals("a", target.longestPalindrome("a"));
    }

    @Test
    void isPalindrome()
    {
        final LongestPalindromicSubstring target = new LongestPalindromicSubstring();

        assertTrue(target.isPalindrome("aba".toCharArray(), 0, 2));
        assertTrue(target.isPalindrome("baba".toCharArray(), 1, 3));
        assertTrue(target.isPalindrome("baba".toCharArray(), 0, 2));
        assertTrue(target.isPalindrome("babad".toCharArray(), 1, 3));
    }
}