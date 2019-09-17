package com.github.sovaalexandr.detect_capital;

/**
 * {@see https://leetcode.com/problems/detect-capital/}
 */
public class DetectCapital
{
    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        if (chars.length < 1) return true;
        else if ('a' <= chars[0] && chars[0] <= 'z') {
            for (int i = 1; i < chars.length; i++) if ('A' <= chars[i] && chars[i] <= 'Z') return false;
        } else if ('A' <= chars[0] && chars[0] <= 'Z') {
            if (chars.length > 1 && 'A' <= chars[1] && chars[1] <= 'Z') {
                for (int i = 2; i < chars.length; i++) if ('a' <= chars[i] && chars[i] <= 'z') return false;
                return true;
            }
            for (int i = 2; i < chars.length; i++) if ('A' <= chars[i] && chars[i] <= 'Z') return false;
        }

        return true;
    }
}
