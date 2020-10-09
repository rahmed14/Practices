package com.company;
import  java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
//*********************************array length is always 2 but, when i use indes i have to count as 0 and 1.
    public static void main(String[] args) {
        int [] ar ={1,2,1,3,4,4,2};
        System.out.println(ar.length);

       System.out.println("result is:" +  singleNumber(ar));

    }
    // 1 1 2 6 2
    //1 2 6
    public static int singleNumber(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for (int x=0;x<=nums.length-1;x++) {
            if(!arr.contains(nums[x])){
                arr.add(nums[x]);
            }
            else{
                arr.remove(new Integer(nums[x]));

            }
        }
        return arr.get(0);
    }

    public static int[] singleNumber1(int[] nums) {
        for (int x=0;x<nums.length-1;x++) {
            for (int y=x++;y<nums.length-1;y++) {
                if(nums[x]==nums[y]){
                    nums[y] = nums[y + 1];
                    //1, 2, 6, 2
                    //x=1,y=3
                    //2, 6, 2
                }
            }
        }
        return nums;
    }

}
