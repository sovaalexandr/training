package com.github.sovaalexandr.valid_palindrome;

/**
 * {@see https://leetcode.com/problems/valid-palindrome/}
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 */
public class ValidPalindrome
{
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int direct = 0, reverse = chars.length - 1;
        while (direct < reverse) {
            if ('0' > chars[direct]
                    || ('9' < chars[direct] && 'A' > chars[direct])
                    || ('Z' < chars[direct] && 'a' > chars[direct])
                    || 'z' < chars[direct]
            ) {
                direct++;
                continue;
            }
            if ('0' > chars[reverse]
                    || ('9' < chars[reverse] && 'A' > chars[reverse])
                    || ('Z' < chars[reverse] && 'a' > chars[reverse])
                    || 'z' < chars[reverse]
            ) {
                reverse--;
                continue;
            }

            char d = chars[direct++];
            if (d >= 'a') d -= 32;

            char r = chars[reverse--];
            if (r >= 'a') r -= 32;

            if (d != r) return false;
        }
        return true;
    }
}
