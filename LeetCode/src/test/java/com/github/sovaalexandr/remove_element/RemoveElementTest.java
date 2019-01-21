package com.github.sovaalexandr.remove_element;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest
{

    @Test
    void removeElement()
    {
        final RemoveElement target = new RemoveElement();

        int[] arr;

        arr = new int[] {
                3, 2, 2, 3
        };

        Assertions.assertEquals(2, target.removeElement(arr, 3));
        assertArrayEquals(new int[] { 2, 2 }, Arrays.copyOfRange(arr, 0, 2));
    }
}