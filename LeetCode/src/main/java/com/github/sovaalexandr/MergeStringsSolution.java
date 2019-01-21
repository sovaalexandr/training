package com.github.sovaalexandr;

public class MergeStringsSolution
{
    static String meregeStrings(String a, String b) {
        final int l = Math.min(a.length(), b.length());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < l; i++) {
            sb.append(a.charAt(i)).append(b.charAt(i));
        }
        if (a.length() > l) {
            sb.append(a.substring(l));
        }
        if (b.length() > l) {
            sb.append(b.substring(l));
        }
        return sb.toString();
    }
}
