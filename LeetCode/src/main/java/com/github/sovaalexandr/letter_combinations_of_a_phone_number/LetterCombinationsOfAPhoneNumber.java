package com.github.sovaalexandr.letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * {@see https://leetcode.com/problems/letter-combinations-of-a-phone-number}
 */
public class LetterCombinationsOfAPhoneNumber
{
    private static final String[][] letters = new String[][] {
            new String[] {"a", "b", "c"}, // 2
            new String[] {"d", "e", "f"}, // 3
            new String[] {"g", "h", "i"}, // 4
            new String[] {"j", "k", "l"}, // 5
            new String[] {"m", "n", "o"}, // 6
            new String[] {"p", "q", "r", "s"}, // 7
            new String[] {"t", "u", "v"}, // 8
            new String[] {"w", "x", "y", "z"}, // 9
    };

    private List<String> combinations = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (null == digits || digits.isEmpty()) return combinations;

        loop("", digits.toCharArray(), 0);

        return combinations;
    }

    private void loop(String combination, char[] digits, int idx) {
        if (idx == digits.length) {
            combinations.add(combination);
            return;
        }
        for (String letter : letters[digits[idx] - '2']) {
            loop(combination + letter, digits, idx + 1);
        }
    }

    public List<String> letterCombinations1(String digits) {
        if (null == digits || digits.isEmpty()) return new ArrayList<>();

        char[] chars = digits.toCharArray();
        List<String> combinations = new ArrayList<>(Arrays.asList(letters[chars[0] - '2']));

        for (int i = 1; i < chars.length; i++) {
            List<String> temp = new ArrayList<>(combinations);
            combinations.clear();
            for (String letter: letters[chars[i] - '2']) for (String combination : temp) {
                combinations.add(combination+letter);
            }
        }
        return combinations;
    }

    public List<String> letterCombinations0(String digits) {
        if (null == digits || digits.isEmpty()) return new ArrayList<>();
        if (1 == digits.length()) {
            int digit = digits.charAt(0) - '2';
            List<String> combinations = new ArrayList<>(letters[digit].length);
            combinations.addAll(Arrays.asList(letters[digit]));

            return combinations;
        } else {
            List<String> combinations = letterCombinations(digits.substring(0, digits.length() - 1));
            int digit = digits.charAt(digits.length() - 1) - '2';
            List<String> newCombinations = new ArrayList<>(combinations.size() * letters[digit].length);

            for (String combination : combinations) for (String letter : letters[digit])
                newCombinations.add(combination + letter);

            return newCombinations;
        }
    }
}
