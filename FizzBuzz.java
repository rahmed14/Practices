package com.company;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println(fizzBuzz(15));

    }



    public static List<String> fizzBuzz(int n) {
        ArrayList<String> cars = new ArrayList<String>();

        for (int x=1;x<=n;x++) {
            if (x%5==0 && x%3==0 ) {
                cars.add("FizzBuzz");
            }
            else if (x%3==0){
                cars.add("Fizz");
            }
            else if (x%5==0){
                cars.add("Buzz");
            }
            else{
                cars.add(""+ x);

            }


        }
        return cars;

    }
}
