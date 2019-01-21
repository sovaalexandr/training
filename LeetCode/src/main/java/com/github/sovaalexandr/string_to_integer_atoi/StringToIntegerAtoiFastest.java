package com.github.sovaalexandr.string_to_integer_atoi;

public class StringToIntegerAtoiFastest
{
    // 1. str==null or only include ' ' return 0;
    // 2. integer is out of 32bit integer return MAX_VALUE/MIN_VALUE;
    // 3. non-convertable character after Integer is ignored;
    // 4. first non-white space character is not digit, return 0;

    public int myAtoi(String str) {
        if (str==null) return 0;

        char[] strArr = str.toCharArray();
        int n = strArr.length;
        int i=0;
        int sign = 1;// default positive
        int digit = 0;
        int result = 0;

        // find first non white space character
        while (i<n && strArr[i] == ' ') i++;

        //all characters are whitespace, return 0
        if (i==n) return 0;

        if(strArr[i] == '-' || str.charAt(i) == '+'){
            sign = (strArr[i] == '+' ? 1 : -1);
            i++;
        }

        // After this, if no digit can be found, return result;
        // if exceed MAX Integer 32BITS, return Integer.MAX_VALUE/MIN_VALUE based on signed;
        while (i<n) {
            if (strArr[i]>='0' && strArr[i]<='9') {
                digit = strArr[i]-'0';
            } else break;

            //check overflow in advance
            if (result > (Integer.MAX_VALUE-digit)/10)
                return sign == -1 ? Integer.MIN_VALUE:Integer.MAX_VALUE;

            result = result*10 + digit;
            i++;
        }

        return sign*result;
    }
}
