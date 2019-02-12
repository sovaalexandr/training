package com.github.sovaalexandr.longest_palindromic_substring;

/**
 * {@see https://leetcode.com/problems/longest-palindromic-substring}
 */
public class LongestPalindromicSubstring
{
    public String longestPalindrome(String s) {
        if (null == s) return null;

        final char[] chars = s.toCharArray();
        final int length = chars.length;
        if (length <= 1) return s;

        int maxLength = 1, iMax = 0, jMax = 1;

        // Starting from each character in a string
        for (int i = 0; i < length - maxLength; i++)
            // find palindrome substring
            for (int j = i + 1; j < length; j++)
                if (isPalindrome(chars, i, j) && j - i + 1 > maxLength)
                    maxLength = (jMax = j + 1) - (iMax = i);

        return s.substring(iMax, jMax);
    }

    boolean isPalindrome(char[] s, int from, int to)
    {
        for(; from < to; from++, to--) if (s[from] != s[to]) return false;

        return true;
    }
}
