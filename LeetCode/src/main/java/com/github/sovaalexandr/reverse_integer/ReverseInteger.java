package com.github.sovaalexandr.reverse_integer;

public class ReverseInteger
{
    public int reverse(int x) {

        int result = 0;
        int reminder = x;
        while (reminder != 0) {
            int add = reminder % 10;
            if (result >= Integer.MAX_VALUE / 10 + add || result <= Integer.MIN_VALUE / 10 - Math.abs(add)) return 0;
            result *= 10;
            result += add;
            reminder /= 10;
        }
        return result;
    }
}
