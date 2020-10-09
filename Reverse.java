package com.company;

import java.util.Arrays;

public class Reverse {


    public static void main(String[] args) {
        int x = 123;
        System.out.println("value is:" );

        System.out.println("value is:" + ((reverse02(x))));

    }

    //123
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10; //3, 2, 1
            x /= 10; // 12, 1, 0
            rev = rev * 10 + pop; //3,32, 321
        }
        return rev;
    }


    public static int reverse01(int x) {
        char[] chars = ("" + x).toCharArray();
        char[] chars02 = new char[4];
        int y = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            chars02[y] = chars[i];
            y++;
        }
        int number = Integer.parseInt(new String(chars02));
        return number;
    }
    //123
    public static int reverse02(int x) {
        int index = 0;
        int rev=0;
        int result=0;
        while (x != 0) {
             result = x % 10;
            rev = rev * 10 + result; //3,32, 321

        }
        return rev;



    }
}
























