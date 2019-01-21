package com.github.sovaalexandr.reverse_integer;

public class FastestReverseInteger
{
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return (int)res == res ? (int)res : 0;
    }
}
