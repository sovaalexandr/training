package com.github.sovaalexandr.valid_parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest
{

    @Test
    void isValid()
    {
        ValidParentheses target = new ValidParentheses();

        assertTrue(target.isValid("()"));
        assertTrue(target.isValid("()[]{}"));
        assertTrue(target.isValid("{[]}"));

        assertFalse(target.isValid("["));
        assertFalse(target.isValid("(("));
        assertFalse(target.isValid("(]"));
        assertFalse(target.isValid("([)]"));
    }
}