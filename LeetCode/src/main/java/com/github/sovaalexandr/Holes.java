package com.github.sovaalexandr;

import java.util.HashMap;
import java.util.Map;

public class Holes
{
    static int countHoles(int num) {
        int res = 0;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            if (digit == 0 ||digit == 4 ||digit == 6 ||digit == 9) {
                res += 1;
            }
            if (digit == 8) {
                res += 2;
            }
        }
        return res;
    }
}
