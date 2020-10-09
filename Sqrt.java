package com.company;

public class Sqrt {
    public static void main(String[] args) {
        int result=mySqrt02(9);
        System.out.println("result is:"+ result);
    }

    public static int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        double k = Math.log10(x);
        k = k/2.0;
        int y = (int) Math.pow(10,k);
        int res = (int) y;
        return res;

    }

    public static int mySqrt02(int x) {
        int result= (int) Math.sqrt(x);
        return result;
    }
}
