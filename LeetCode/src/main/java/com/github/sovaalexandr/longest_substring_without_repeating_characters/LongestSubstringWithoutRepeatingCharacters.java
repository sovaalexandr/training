package com.github.sovaalexandr.longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.HashSet;

/**
 * {@see https://leetcode.com/problems/longest-substring-without-repeating-characters/}
 */
public class LongestSubstringWithoutRepeatingCharacters
{
    public int lengthOfLongestSubstring(String s) {
        if (null == s) return 0;
        final char[] chars = s.toCharArray();
        HashMap<Character, Integer> seen = new HashMap<>();

        int i, j, max = 0;
        Integer prevIdx;
        for(i = 0, j = 0; j < chars.length; j++) {
            prevIdx = seen.put(chars[j], j);
            if (null != prevIdx && i <= prevIdx) { // This char is already seen
                max = Math.max(max, j - i);
                i = prevIdx + 1;
            }
        }

        return Math.max(max, j - i);
    }
}
