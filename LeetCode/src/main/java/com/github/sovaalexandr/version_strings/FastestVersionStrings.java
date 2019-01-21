package com.github.sovaalexandr.version_strings;

public class FastestVersionStrings
{
    public int compareVersion(String version1, String version2) {
        char[] v1Chars = version1.toCharArray();
        int n1 = v1Chars.length;
        char[] v2Chars = version2.toCharArray();
        int n2 = v2Chars.length;
        int i = 0;
        int j = 0;
        while(i < n1 && j < n2) {
            int levelNum1 = 0;
            while(i < n1 && v1Chars[i] == '.') i++;
            while(i < n1 && v1Chars[i] != '.') {
                levelNum1 = levelNum1 * 10 + (v1Chars[i] - '0');
                i++;
            }
            // System.out.println(levelNum1);
            int levelNum2 = 0;
            while(j < n2 && v2Chars[j] == '.') j++;
            while(j < n2 && v2Chars[j] != '.') {
                levelNum2 = levelNum2 * 10 + (v2Chars[j] - '0');
                j++;
            }
            // System.out.println(levelNum2);
            if(levelNum1 != levelNum2) {
                return levelNum1 > levelNum2 ? 1 : -1;
            }
        }
        int num = 0;
        while(i < n1) {
            if(v1Chars[i] != '.') {
                num = num * 10 + (v1Chars[i] - '0');
            }
            if(num > 0) return 1;
            i++;
        }
        num = 0;
        while(j < n2) {
            if(v2Chars[j] != '.') {
                num = num * 10 + (v2Chars[j] - '0');
            }
            if(num > 0) return -1;
            j++;
        }
        return 0;
    }
}
