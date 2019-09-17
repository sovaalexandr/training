package com.github.sovaalexandr.valid_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest
{

    @Test
    void isPalindrome()
    {
        ValidPalindrome target = new ValidPalindrome();
        assertTrue(target.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(target.isPalindrome("0P"));
        assertFalse(target.isPalindrome("race a car"));
        assertTrue(target.isPalindrome("`l;`` 1o1 ??;l`"));
    }
}