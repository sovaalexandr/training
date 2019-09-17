package com.github.sovaalexandr.regular_expression_matching;

class RegularExpressionMatching
{
    boolean isMatch(String s, String p) {
        if(s == null || p == null) return false;

        char[] sChars = s.toCharArray();
        char[] pChars = p.toCharArray();
        int m = sChars.length, n = pChars.length;
        int[][] dp = new int[m][n];
        return dfs(sChars, 0, pChars, 0, dp);
    }

    private boolean dfs(char[] s, int si, char[] p, int pi, int[][] dp){
        if (pi == p.length) return si == s.length;

        if (si == s.length) {
            for (int i = pi; i < p.length; i += 2) if(i + 1 >= p.length || p[i + 1] != '*') return false;
            return true;
        }

        if (dp[si][pi] > 0) return dp[si][pi] == 1;

        char a = s[si];
        char b = p[pi];
        int res = 2;
        if (pi < p.length - 1
                && p[pi + 1] == '*'
                && (dfs(s, si, p, pi + 2, dp) || equal(a, b) && dfs(s, si + 1, p, pi, dp))
                || (equal(a, b) && dfs(s, si + 1, p, pi + 1, dp))
        ) res = 1;

        dp[si][pi] = res;
        return res == 1;
    }

    private boolean equal(char a, char b){
        return b == '.' || a == b;
    }
}
