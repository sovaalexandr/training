package com.github.sovaalexandr.palindrome_number;

/**
 * {@see https://leetcode.com/problems/palindrome-number/ }
 */
public class PalindromeNumber
{
    public boolean isPalindrome(int x) {
        if (0 > x) return false;

        int y = 0, X = x;
        while (x > 0) {
            y = y * 10 + x % 10;
            x /= 10;
        }

        return y == X;
    }
}
