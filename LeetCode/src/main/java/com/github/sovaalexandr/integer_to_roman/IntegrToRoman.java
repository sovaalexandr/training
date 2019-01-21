package com.github.sovaalexandr.integer_to_roman;

/**
 * {@see https://leetcode.com/problems/integer-to-roman/}
 */
public class IntegrToRoman
{
    public String intToRoman(int num) {
        if (num < 0 || num >= 4000) throw new RuntimeException("invalid argument");

        StringBuilder s = new StringBuilder();
        int position = 0;
        while (0 < num) {
            if (3 == position) {
                for (int j = num; j > 0; j--) s.insert(0, 'M');
                break;
            } else {
                int i = num % 10;
                switch (i) {
                    case 4:
                        s.insert(0, fourAtPosition(position)); break;
                    case 9:
                        s.insert(0, nineAtPosition(position)); break;
                    default:
                        StringBuilder s5 = new StringBuilder();
                        if (i >= 5) {
                            s5.insert(0, fiveAtPosition(position));
                            i -= 5;
                        }
                        for (int j = i; j > 0; j--) {
                            s5.append(oneAtPosition(position));
                        }
                        s.insert(0, s5.toString());
                }
                position ++;
                num /= 10;
            }
        }

        return s.toString();
    }

    private char oneAtPosition(int position)
    {
        switch (position) {
            case 0: return 'I';
            case 1: return 'X';
            case 2: return 'C';
            default: throw new RuntimeException("Numbers >= 4000 not accepted");
        }
    }

    private char fiveAtPosition(int position)
    {
        switch (position) {
            case 0: return 'V';
            case 1: return 'L';
            case 2: return 'D';
            default: throw new RuntimeException("Numbers >= 4000 not accepted");
        }
    }

    private String nineAtPosition(int position)
    {
        switch (position) {
            case 0: return "IX";
            case 1: return "XC";
            case 2: return "CM";
            default: throw new RuntimeException("Numbers >= 4000 not accepted");
        }
    }

    private String fourAtPosition(int position)
    {
        switch (position) {
            case 0:
                return "IV";
            case 1:
                return "XL";
            case 2:
                return "CD";
            default:
                throw new RuntimeException("Numbers >= 4000 not accepted");
        }
    }
}
