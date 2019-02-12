package com.github.sovaalexandr.longest_palindromic_substring;

public class LongestPalindromicSubstringFastest
{
    private int maxLen =0, start=0;

    public String longestPalindrome(String s) {
        if(s == null || s.isEmpty()){
            return s;
        }
        char[] arr = s.toCharArray();
        int n = s.length();
        int pointer = 0;
        while(pointer < n){
            pointer = palindromeCheck(pointer, arr, n);
            pointer++;
        }

        return s.substring(start, start+ maxLen);


    }

    private int palindromeCheck(int mid, char[] arr, int n){
        int left= mid-1;
        while(mid<n-1 && arr[mid]==arr[mid+1]) mid++;
        int right = mid+1;

        while(left>=0 && right<n && arr[left]==arr[right]){
            left--;
            right++;
        }

        int len = right-left-1;
        if(len>= maxLen){
            maxLen = len;
            start = left+1;
        }
        return mid;
    }
}
