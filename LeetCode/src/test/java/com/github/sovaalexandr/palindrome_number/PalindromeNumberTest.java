package com.github.sovaalexandr.palindrome_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest
{

    @Test
    void isPalindrome()
    {
        PalindromeNumber target = new PalindromeNumber();

        assertTrue(target.isPalindrome(121));
        assertFalse(target.isPalindrome(-121));
        assertFalse(target.isPalindrome(10));
    }
}