package com.company;

public class SubArraySum {
    public static void main (String[] args)
    {
        int [] a = {-2};
        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(a));
    }
    static int maxSubArraySum(int nums[])
    {
        int size = nums.length;
        int max_so_far = 0;     //sum
        int max_ending_here = 0;    //subarray
        if(nums.length==1){
            max_so_far=nums[0];
        }
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + nums[i];   //-2
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here; //

            if (max_ending_here < 0)
                max_ending_here = 0;        //0,
        }
        return max_so_far;
    }

}

