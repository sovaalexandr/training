package com.github.sovaalexandr.repeating_and_missing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest
{

    @Test
    void findRepeatingAndMissing0()
    {
        Search target = new Search();
        int[] input = {4, 3, 6, 2, 1, 1};
        RepeatingAndMissing result = target.findRepeatingAndMissing(input);
        Assertions.assertEquals(1, result.repeating);
        Assertions.assertEquals(5, result.missing);
    }
}