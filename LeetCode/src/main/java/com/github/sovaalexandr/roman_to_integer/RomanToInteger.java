package com.github.sovaalexandr.roman_to_integer;

/**
 * {@see https://leetcode.com/problems/roman-to-integer/}
 */
public class RomanToInteger
{
    public int romanToInt(String s) {
        if (null == s || 0 == s.length()) throw new RuntimeException("Invalid argument");

        int i = 0;

        while(0 < s.length())
        switch (s.charAt(0)) {
            case 'I':
                if (s.length() > 1) {
                    switch (s.charAt(1)) {
                        case 'V':
                            i += 4;
                            s = s.substring(2);
                            break;
                        case 'X':
                            i += 9;
                            s = s.substring(2);
                            break;
                        default:
                            i += 1;
                            s = s.substring(1);
                            break;
                    }
                    break; // ?
                }
                i += 1;
                s = s.substring(1);
                break;
            case 'V':
                i += 5;
                s = s.substring(1);
                break;
            case 'X':
                if (s.length() > 1) {
                    switch (s.charAt(1)) {
                        case 'L':
                            i += 40;
                            s = s.substring(2);
                            break;
                        case 'C':
                            i += 90;
                            s = s.substring(2);
                            break;
                        default:
                            i += 10;
                            s = s.substring(1);
                            break;
                    }
                    break;
                }
                i += 10;
                s = s.substring(1);
                break;
            case 'L':
                i += 50;
                s = s.substring(1);
                break;
            case 'C':
                if (s.length() > 1) {
                    switch (s.charAt(1)) {
                        case 'D':
                            i += 400;
                            s = s.substring(2);
                            break;
                        case 'M':
                            i += 900;
                            s = s.substring(2);
                            break;
                        default:
                            i += 100;
                            s = s.substring(1);
                            break;
                    }
                    break;
                }
                i += 100;
                s = s.substring(1);
                break;
            case 'D':
                i += 500;
                s = s.substring(1);
                break;
            case 'M':
                i += 1000;
                s = s.substring(1);
                break;
        }

        return i;
    }
}
