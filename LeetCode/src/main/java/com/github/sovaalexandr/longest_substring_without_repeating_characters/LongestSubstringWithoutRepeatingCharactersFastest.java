package com.github.sovaalexandr.longest_substring_without_repeating_characters;

public class LongestSubstringWithoutRepeatingCharactersFastest
{
    public int lengthOfLongestSubstring(String s) {
        int[] dict = new int[128];
        int res = 0, left = 0, right = 1;
        for(char c : s.toCharArray()) { // Initially - there are no characters at dictionary
            left = Math.max(left, dict[c]); // But if there is already such char at dictionary - move left border to it's prev position
            dict[c] = right; // Store position of char at dictionary
            res = Math.max(res, right++ - left); // Check isn't it a longest string and advance right border
        }
        return res;
    }
}
