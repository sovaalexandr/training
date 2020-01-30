package com.github.sovaalexandr.first_bad_version;

/**
 * {@see https://leetcode.com/problems/first-bad-version/}
 */
public class FirstBadVersion {

    private final int badStartsFrom;

    public FirstBadVersion(int badStartsFrom) {
        this.badStartsFrom = badStartsFrom;
    }

    public int firstBadVersion(int n) {

        int lastGood = 0, firstBad = n;

        while (lastGood < firstBad) {
            final int mid = (lastGood + firstBad) >>> 1;
            if (isBadVersion(mid)) firstBad = mid; // All bad to the right
            else lastGood = mid + 1;
        }
        return firstBad;
    }

    protected boolean isBadVersion(int n) {
        return n >= badStartsFrom;
    }
}
