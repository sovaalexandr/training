package com.github.sovaalexandr.longest_common_prefix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest
{

    @Test
    void longestCommonPrefix()
    {
        final LongestCommonPrefix target = new LongestCommonPrefix();

        Assertions.assertEquals("fl", target.longestCommonPrefix(new String[] {
                "flower","flow","flight"
        }));

        Assertions.assertEquals("", target.longestCommonPrefix(new String[] {
                "dog","racecar","car"
        }));

        Assertions.assertEquals("", target.longestCommonPrefix(new String[] {
                ""
        }));
    }
}