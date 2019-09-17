package com.github.sovaalexandr.persistent_bugger;

public class PersistentBugger
{
    public int persistence(int n) {
        if (10 > n) return 0;
        int steps = 0;
        while (true) {
            int i = 1;
            while (n > 0) {
                i *= n % 10;
                n /= 10;
            }
            steps ++;
            if (i < 10) break;
            n = i;
        }
        return steps;
    }
}
