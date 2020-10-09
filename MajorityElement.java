package com.company;

import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int [] result={3,2,3};
        System.out.println("result is:"+majorityElement(result));

    }


    // 2, 3, 3
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int save = 0;
        int majortiy=nums.length/2; //2.5


        for(int i=0;i<nums.length;i++){
             save= nums[i];
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(save==nums[j]){
                    count=count+1;
                }
            }

            if (count>majortiy){
                return save;
            }
            else {
                count =1;
            }


            }
        return save;

        }

}
