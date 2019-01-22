package com.github.sovaalexandr.longest_substring_without_repeating_characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest
{

    @Test
    void lengthOfLongestSubstring()
    {
        final LongestSubstringWithoutRepeatingCharacters target = new LongestSubstringWithoutRepeatingCharacters();

        assertEquals(3, target.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, target.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, target.lengthOfLongestSubstring("pwwkew"));
        assertEquals(3, target.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    void lengthOfLongestSubstringFastest()
    {
        final LongestSubstringWithoutRepeatingCharactersFastest target = new LongestSubstringWithoutRepeatingCharactersFastest();

        assertEquals(3, target.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, target.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, target.lengthOfLongestSubstring("pwwkew"));
        assertEquals(3, target.lengthOfLongestSubstring("dvdf"));
    }
}
