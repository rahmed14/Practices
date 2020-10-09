package com.company;

import java.util.Arrays;

public class Practice {
    //n=98   //145
    static int[] numSquareSum(int n)
    {
        int [] add = new int[2];
        int squareSum = 0;
        int second=0;
        int x=0;
        while (n!= 0)
        {
            squareSum = (n % 10) ; // 0+8=8, 64+81=145 //0+5*5=25, 25+16=41, 41+1*1=42
            add[x]=squareSum;
            n /= 10; //n=9   //14, 1
            x++;
        }
        return add;
    }
    static int[] reverse(int a[])
    {
        int[] b = new int[2];
        int j=0;
        for (int i = a.length-1; i>= 0; i--) {
            b[j] = a[i];
            j++;
        }

        return b;
    }
    //  Driver code to test above methods
    public static void main(String[] args)
    {
        String name="rifath";
        char s1 = (name.charAt(1));
        System.out.println(" char at is:"+ s1);



        int [] a={2,3};
        System.out.println(" lengths  is:"+ a.length);
        System.out.println("result is:"+ Arrays.toString(numSquareSum(98)));
        System.out.println(" Reverse result is:"+ Arrays.toString(reverse(a)));


    }
}
