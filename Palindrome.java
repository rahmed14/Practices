package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {

        isPalindrome(121);
    }
    public static boolean isPalindrome(int x) {
        char[] chars = ("" + x).toCharArray();
        System.out.println(Arrays.toString(chars));
        int size=chars.length;
        char [] result = new char[size];
        int start=0;
        int end=chars.length-1;
        int y=0;
        for(int i=end;i>=0;i--){
            result[y]=chars[i];
            y++;
        }
        System.out.println(Arrays.toString(result));
        if(chars==result){
            return true;
        }
        return false;
    }
    public boolean isPalindrome02(int x) {
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }
}
