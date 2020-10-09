package com.company;

public class IsPrime {
    public static void main(String[] args) {

        System.out.println(countPrimes(10));

    }

    public static int countPrimes(int n) {
        int count =0;
        for(int i=2;i<=n;i++){
            if (isPrime(i)==true){
                count++;
            }
        }
        return count;

        }
//10
    public static boolean isPrime(int n) {
        for (int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }

}
