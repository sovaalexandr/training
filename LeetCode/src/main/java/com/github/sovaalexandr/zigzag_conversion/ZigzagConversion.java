package com.github.sovaalexandr.zigzag_conversion;

/**
 * {@see https://leetcode.com/problems/zigzag-conversion/}
 */
public class ZigzagConversion
{
    public String convert(String s, int numRows) {
        if (null == s || 0 == s.length() || 2 > numRows) return s;

        final char[] chars = s.toCharArray();
        StringBuilder[] matrix = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) matrix[i] = new StringBuilder();

        for (int i = 0, column = 1, cell = 0; i < chars.length; i++) {
            matrix[cell].append(chars[i]);

            if (1 == column) cell++;
            else cell--;

            if (0 == cell) column = 1;
            else if (cell == numRows) {
                column++;
                cell = numRows - 2;
            } else if (1 < column) column++;
            if(column == numRows) column = 1;
        }

        for (int i = 1; i < numRows; i++) {
            matrix[0].append(matrix[i]);
        }

        return matrix[0].toString();
    }
}
