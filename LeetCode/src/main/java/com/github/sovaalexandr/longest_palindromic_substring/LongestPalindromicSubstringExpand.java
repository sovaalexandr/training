package com.github.sovaalexandr.longest_palindromic_substring;

public class LongestPalindromicSubstringExpand
{
    public String longestPalindrome(String s) {
        if (null == s) return null;

        final char[] chars = s.toCharArray();
        final int length = chars.length;
        if (length <= 1) return s;

        int longestLength, end = 0, start = 0;
        for (int i = 0; i < length; i++) {
            longestLength = Math.max(
                    expandAroundCenter(chars, i, i),
                    expandAroundCenter(chars, i, i + 1)
            );
            if (longestLength > end - start) {
                start = i - (longestLength - 1) / 2;
                end = i + longestLength / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    int expandAroundCenter(char[] s, int left, int right) {
        for (; left >= 0 && right < s.length; left--, right++)
            if(s[left] != s[right]) break;

        return right - left - 1;
    }
}
