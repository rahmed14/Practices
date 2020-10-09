package com.company;

import java.util.Arrays;

public class BuySellStock {
    public static void main(String[] args) {
        int [] save={7,1,5,3,6,4};
        System.out.println("the max is: " + maxProfit(save));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            profit+=Math.max(prices[i]-prices[i-1],0);
        }
        return profit;


    }
}
