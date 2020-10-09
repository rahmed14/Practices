package com.company;

import java.util.ArrayList;

public class Fib {
    public static void main(String[] args) {
        System.out.println("result is:"+ searchRange01(10));

    }

    public static ArrayList<Integer> searchRange01(int nums) {

        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);

        for (int i=0;i<=nums;i++){
            int x= result.get(i);
            int y=result.get(i+1);
            int add=x+y;

            result.add(add);
        }
        return result;

    }


}
