package com.github.sovaalexandr.generate_parentheses;

import java.util.*;

/**
 * {@see https://leetcode.com/problems/generate-parentheses/}
 */
public class GenerateParentheses
{
    public List<String> generateParenthesis(int n) {
        if (n < 1) return new ArrayList<>(0);

        LinkedList<String> groups = new LinkedList<>();
        loop(groups, "", 0, 0, n);

        return groups;
    }

    private void loop(List<String> groups, String group, int open, int close, int max) {
        if (open == close && close == max) groups.add(group);
        if (open < max) loop(groups, group + "(", open + 1, close, max);
        if (close < open) loop(groups, group + ")", open, close + 1, max);
    }
}
