package com.github.sovaalexandr.maximum_length_chain_of_pairs;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest
{

    @Test
    void findLongestSubsequence0()
    {
        final Search target = new Search();
        final String longestSubsequence = target
                .findLongestSubsequence(Stream.of(new Pair(5, 24), new Pair(39, 60), new Pair(15, 28), new Pair(27, 40), new Pair(50, 90)));
        assertEquals("The longest subSequence is (5, 24); (27, 40); (50, 90) and it's length is 3", longestSubsequence);
    }

    @Test
    void findLongestSubsequenceLength0()
    {
        final Search target = new Search();
        final int longestSubsequence = target
                .findLongestSubsequenceLength(Stream.of(new Pair(5, 24), new Pair(39, 60), new Pair(15, 28), new Pair(27, 40), new Pair(50, 90)));
        assertEquals(3, longestSubsequence);
    }
}