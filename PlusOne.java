package com.company;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int [] save= {1,2,3,4};
//        save[save.length-1]+=1;
        System.out.println("result is:"+ (Arrays.toString(plusOne(save))));
    }


    public static int [] plusOne(int[] digits) {
        int size= digits.length-1;
        digits[size]+=1;
        return digits;

    }
}
