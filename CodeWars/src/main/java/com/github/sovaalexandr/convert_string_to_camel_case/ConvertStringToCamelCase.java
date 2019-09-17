package com.github.sovaalexandr.convert_string_to_camel_case;

public class ConvertStringToCamelCase
{
    public String toCamelCase(String s) {
        if (null == s) return s;
        char[] chars = s.toCharArray();
        if (chars.length < 1) return s;

        // Also specialized for chars
        StringBuilder sb = new StringBuilder();
        boolean shouldCapitalize = false;

        for (char c : chars)
            if ('-' == c || '_' == c) shouldCapitalize = true;
            else if ('a' <= c && c <= 'z' && shouldCapitalize) {
                sb.append((char)(c - 32));
                shouldCapitalize = false;
            } else {
                sb.append(c);
                shouldCapitalize = false;
            }

        return sb.toString();
    }
}
