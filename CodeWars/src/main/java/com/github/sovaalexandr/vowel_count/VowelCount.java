package com.github.sovaalexandr.vowel_count;

public class VowelCount
{
    int vowelsIn(String s) {
        int vowels = 0;
        for (char c : s.toCharArray()) {
            if ('a' == c || 'e' == c || 'i' == c || 'o' == c || 'u' == c) vowels++;
        }

        return vowels;
    }
}
