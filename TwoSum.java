package com.company;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr={3,2,4};
        System.out.println("value is:"+ Arrays.toString((twoSum01(arr,6))));
    }
    public static int[] twosum(int[] nums, int target) {
      int[] indices = new int[5];
        for (int i = 0; i <= nums.length-1; i++) {  //0, 1, 2
            for (int j = i+1; j <= nums.length-1; j++) { //1, 2
                if (nums[i] + nums[j] == target) {
                    indices= new int[] { i, j }; // (1,2)
                }
            }
        }
        return indices;
    }

    //checking my knowledge

    public static int[] twoSum01(int[] nums, int target) {
        int []indices = new int[5];
        int x=0;
        for (int i = 0; i <= nums.length - 1; i++) {  //0, 1, 2
            for (int j = i + 1; j <= nums.length - 1; j++) { //1, 2
                if (nums[i] + nums[j] == target) {
                    indices[x]=i;
                    x++;
                    indices[x]=j;
                }

            }
        }
        return indices;
    }


    }


























