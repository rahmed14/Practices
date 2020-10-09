package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HappyNumber {
    //n=98   //145
    static int numSquareSum(int n)
    {
        int squareSum = 0;
        while (n!= 0)
        {
            squareSum += (n % 10) * (n % 10); // 0+8*=64, 64+81=145 //0+5*5=25, 25+16=41, 41+1*1=42
            n /= 10; //n=9   //14, 1
        }
        return squareSum;
    }
    //98
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(!set.contains(n)){
            set.add(n);
            n = numSquareSum(n);
            if(n==1)
                return true;
        }
        return false;
    }
    //  Driver code to test above methods
    public static void main(String[] args) {

        System.out.println(isHappy(19));
    }

}



