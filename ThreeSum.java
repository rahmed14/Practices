package com.company;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
       int[] arra=  {-1, 0, 1, 2, -1, -4};
       System.out.println("result array is:"+ threeSum(arra));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= nums.length-1; i++) {  //0, 1, 2
            for (int j = i+1; j <= nums.length-1; j++) { //1, 2
                for (int k = i+2; k <= nums.length-1; k++) { //1, 2
                    if (nums[i] + nums[j] +nums[k]== 0) {
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[k]);
                        res.add(arr);

                    }
                }
            }
        }
        return res;
    }
}
