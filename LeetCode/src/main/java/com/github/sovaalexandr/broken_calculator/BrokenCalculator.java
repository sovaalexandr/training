package com.github.sovaalexandr.broken_calculator;

/**
 * {@see https://leetcode.com/problems/broken-calculator/}
 */
public class BrokenCalculator
{
    public int brokenCalc(int X, int Y) {
        int steps = 0;
        while (Y > X) {
            steps++;
            if (Y % 2 == 1) Y++;
            else Y /= 2;
        }

        return steps + X - Y;
    }
}
