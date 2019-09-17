package com.github.sovaalexandr.valid_parentheses;

/**
 * {@see https://leetcode.com/problems/valid-parentheses/}
 */
public class ValidParentheses
{
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        if (1 == chars.length % 2) return false;
        int i = 0;
        while (i < chars.length) {
            i = withinParentheses(i, chars, false, false, false);
            if (-1 == i) return false;
            i++;
        }
        return true;
    }

    private int withinParentheses(int i, char[] s, boolean parentheses, boolean braces, boolean curlyBraces) {
        while (i < s.length) {
            switch (s[i]) {
                case '(':
                    i = withinParentheses(i + 1, s, true, false, false);
                    break;
                case '[':
                    i = withinParentheses(i + 1, s, false, true, false);
                    break;
                case '{':
                    i = withinParentheses(i + 1, s, false, false, true);
                    break;
                case ')':
                    return parentheses ? i + 1 : -1;
                case ']':
                    return braces ? i + 1 : -1;
                case '}':
                    return curlyBraces ? i + 1 : -1;
                default:
                    return -1;
            }
            if (-1 == i) return -1;
        }
        return (!parentheses && !braces && !curlyBraces) ? i : -1;
    }
}
