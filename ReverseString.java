package com.company;

public class ReverseString {
    public static void main(String[] args) {
        char[] result={'A','B'};
        reverseString(result);
    }
    //A,B
    public static void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        while(start<=end){
            char save=s[start];
            s[start++] = s[end];
            s[end--] = save;
        }
        System.out.println(s);

    }
}
