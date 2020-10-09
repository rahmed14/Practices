package com.company;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int [] save= {1,4,3,4};
//        save[save.length-1]+=1;
        System.out.println("result is:"+ removeElement02(save,2));
    }
    public static int removeElement(int[] nums, int val) {
        int size=0;
        for (int i=0;i<=nums.length-1;i++){
            if(nums[i]!=val){
                size++;
            }
        }
        return size;
    }

    public static int removeElement02(int[] nums, int val) {
        int i = 0;
        for(int n: nums){
            if(n != val){
                nums[i] = n;
                i++;
            }
        }
        return i;
    }
}
