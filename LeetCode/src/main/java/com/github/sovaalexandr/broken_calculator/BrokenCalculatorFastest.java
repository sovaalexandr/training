package com.github.sovaalexandr.broken_calculator;

public class BrokenCalculatorFastest
{
    public int brokenCalc(int X, int Y) {
        if (X >= Y) return X - Y;

        return 1 + brokenCalc(
                X,
                (Y & 1) == 0 ? Y / 2 : Y + 1
        );
    }
}
