package com.company;

public class LongestPalindrome {
    //babad
    public static void main(String[] args) {
        System.out.println("result is:"+ longestPalindrome("babad"));
    }
    public static String longestPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        System.out.println("length is"+end);
        String endResult="";
        if (s == null || s.length() < 1) return "";
        if ( s.length()== 1) {
             char ch=s.charAt(0);
            String str = String.valueOf(ch);
            return str;
        }
        for(int i=0;i<=end;i++){
            char check=s.charAt(0);
            for(int j=i+1;j<=end;j++) {
                String subs = s.substring(i, j);
                boolean result = isPalindrome02(subs);
                if (result == true) {
                    if(subs.length()>endResult.length()) {
                        endResult = subs;
                    }
                }
            }
        }
        return endResult;
    }
    public static boolean isPalindrome02(String str) {
//        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }
}
