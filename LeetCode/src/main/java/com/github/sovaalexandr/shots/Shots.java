package com.github.sovaalexandr.shots;

import java.util.ArrayList;
import java.util.List;

public class Shots
{
    public List<Integer> solve(List<Character> inputList) {
        final int size = inputList.size();
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (i < size) {
            final char ci = inputList.get(i);
            for (int j = size - 1; j >= i; j--) {
                final char cj = inputList.get(j);
                if (ci == cj) {
                    List<Character> inBetween = inputList.subList(i, j);
                    int z = j+1;
                    do {
                        if (z == size) {
                            break; // Spike-leg
                        }
                        final char chz = inputList.get(z);
                        if (inBetween.contains(chz)) {
                            j = z;
                        }
                            z++;
                    } while (z<size);
                    result.add(j - i + 1);
                    i = j + 1;
                }
            }
        }

        return result;
    }
}
