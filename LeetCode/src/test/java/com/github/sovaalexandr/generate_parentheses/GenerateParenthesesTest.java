package com.github.sovaalexandr.generate_parentheses;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest
{

    @Test
    void generateParenthesis3()
    {
        GenerateParentheses target = new GenerateParentheses();

        List<String> actual = target.generateParenthesis(3);
        List<String> expected = Arrays.asList(
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"
        );
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    void generateParenthesis4()
    {
        GenerateParentheses target = new GenerateParentheses();
        List<String> expected = Arrays.asList(
                "(((())))", //
                "((()()))", //
                "((())())", //
                "((()))()", //
                "(()(()))", //
                "(()()())", //
                "(()())()", //
                "(())(())",
                "(())()()",
                "()((()))",
                "()(()())",
                "()(())()",
                "()()(())",
                "()()()()"
        );
        List<String> actual = target.generateParenthesis(4);
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
}