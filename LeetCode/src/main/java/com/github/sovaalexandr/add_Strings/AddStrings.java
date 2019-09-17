package com.github.sovaalexandr.add_Strings;

/**
 * {@see https://leetcode.com/problems/add-strings/}
 * 3568
 *   17
 */
public class AddStrings
{
    public String addStrings(String num1, String num2) {
        if (num1.length() < num2.length()) return addStrings(num2, num1);

        char[] chars0 = num1.toCharArray(), chars1 = num2.toCharArray(), result = new char[chars0.length + 1];

        int i = 1, rest = 0, j = chars0.length;
        while (i <= chars1.length) {
            rest += (chars0[chars0.length - i] - '0') + (chars1[chars1.length - i] - '0');
            result[j--] = (char) (rest % 10 + '0');
            rest /= 10;
            i++;
        }
        i = chars0.length - chars1.length - 1;
        while (i >= 0) if (0 == rest)
            return num1.substring(0, i + 1) + new String(result, j + 1, chars0.length - j);
        else {
            rest += (chars0[i] - '0');
            result[j--] = (char) (rest % 10 + '0');
            rest /= 10;
            i--;
        }

        if (0 == rest) return new String(result, 1, result.length - 1);
        else {
            result[0] = '1';
            return new String(result);
        }
    }
}
