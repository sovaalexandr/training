package com.github.sovaalexandr.happy_number;

import java.util.HashSet;

/**
 * {@see https://leetcode.com/problems/happy-number/}
 */
public class HappyNumber
{
    public boolean isHappy(int n) {
        HashSet<Integer> visited = new HashSet<>();
        while(true) {
            int i = 0;
            while (n > 0) {
                int j = n % 10;
                n /= 10;
                i += j*j;
            }
            if (i == 1) return true;
            if (visited.contains(i)) return false;
            visited.add(n = i);
        }
    }

    public boolean isHappy0(int n) {
        if (n == 1) return true;
        else {
            int sumOfSquare = 0;
            while(n != 0) {
                sumOfSquare += (n % 10)*(n % 10);
                n /= 10;
            }
            return sumOfSquare == 4 ? false : isHappy0(sumOfSquare);
        }
    }
}
