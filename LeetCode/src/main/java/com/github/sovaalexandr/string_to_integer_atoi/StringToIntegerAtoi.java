package com.github.sovaalexandr.string_to_integer_atoi;

/**
 * {@see https://leetcode.com/problems/string-to-integer-atoi/}
 */
public class StringToIntegerAtoi
{
    public int myAtoi(String str) {
        if (null == str) return 0;

        final char[] damnJVM = str.toCharArray();
        final int length = damnJVM.length;

        int i;
        char c = ' ';
        for(i = 0; i < length; i++) {
            c = damnJVM[i];
            if (' ' != c) break;
        }

        int sign;
        int result;
        int digit = c - '0';
        if ('-' == c) { result = 0; sign = -1; }
        else if ('+' == c) { result = 0; sign = 1; }
        else if (i == length) return 0;
        else if (isInsignificant(c)) return 0;
        else { result = digit; sign = 1; }

        for (i+=1; i < length; i++) {
            c = damnJVM[i];
            if (isInsignificant(c)) break;
            digit = c - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) return -1 == sign ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            else result = result * 10 + digit;
        }

        return sign * result;
    }

    private boolean isInsignificant(char c)
    {
        return '0' > c || '9' < c;
    }
}
