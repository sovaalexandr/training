package com.github.sovaalexandr.letter_combinations_of_a_phone_number;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsOfAPhoneNumberTest
{

    @Test
    void letterCombinations()
    {
        LetterCombinationsOfAPhoneNumber target = new LetterCombinationsOfAPhoneNumber();

        assertEquals(
            List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
            target.letterCombinations("23")
        );
    }
}