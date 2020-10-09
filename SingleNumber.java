package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        Reverse r1 = new Reverse();
        int y = r1.reverse(123);
        System.out.println(y);

        int x = 8;
        int pop = x % 10; //3,2,
        int result = x / 10; //12,1,0
        System.out.println(pop);
        System.out.println(result);

        int[] elemetns = {1, 2, 1, 2, 3};

        System.out.println("result is: " + singleNumber03(elemetns));

    }

    public static int singleNumber01(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++)
            ans = ans ^ nums[i]; //
        return ans;
    }

    public static String singleNumber(int[] nums) {
        ArrayList<int[]> save = new ArrayList<>(Arrays.asList(nums));

        int result;
        for (int i = 0; i <= save.size() - 1; i++) {
            int compare = nums[i];
            for (int j = 1; j <= save.size() - 1; j++) {
                if (compare == nums[j]) {
                    save.remove(nums[j]);
                }
            }
        }
        return " " + save;
    }

    public static int singleNumber03(int[] nums) {
        Arrays.sort(nums);
        int save = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {

                if (nums[i] != nums[i + 1]) {
                     save=nums[i];
                    return save;
                }
            }
        }
        return save;

    }
}



