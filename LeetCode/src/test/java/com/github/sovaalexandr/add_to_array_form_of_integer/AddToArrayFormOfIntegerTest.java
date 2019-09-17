package com.github.sovaalexandr.add_to_array_form_of_integer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AddToArrayFormOfIntegerTest
{

    @Test
    void addToArrayForm()
    {
        AddToArrayFormOfInteger target = new AddToArrayFormOfInteger();

        assertEquals(Arrays.asList(1,2,3,4), target.addToArrayForm(new int[] {1, 2, 0, 0}, 34));
        assertEquals(Arrays.asList(4,5,5), target.addToArrayForm(new int[] {2, 7, 4}, 181));
        assertEquals(Arrays.asList(2,3), target.addToArrayForm(new int[] {0}, 23));
        assertEquals(Arrays.asList(1,0,2,1), target.addToArrayForm(new int[] {2, 1, 5}, 806));
        assertEquals(Arrays.asList(1,0,0,0,0,0,0,0,0,0,0), target.addToArrayForm(new int[] {9,9,9,9,9,9,9,9,9,9}, 1));
    }
}