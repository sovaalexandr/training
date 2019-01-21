package com.github.sovaalexandr.longest_common_prefix;

/**
 * {@see https://leetcode.com/problems/longest-common-prefix/}
 */
public class LongestCommonPrefix
{
    public String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0) return "";

        int charIndex = 0;
        while (true) {
            boolean matches = true;
            if (strs[0].length() <= charIndex) {
                break;
            }
            char c = strs[0].charAt(charIndex);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() <= charIndex || c != strs[i].charAt(charIndex)) {
                    matches = false;
                    break;
                }
            }
            if (!matches) {
                break;
            }
            charIndex++;
        }

        return strs[0].substring(0, charIndex);
    }
}
