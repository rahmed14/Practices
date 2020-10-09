package com.company;

public class FirstLastPosition {
    public static void main(String[] args) {
        System.out.println("result is:");
        int arr[] = { 5,7,8,10 };
        boolean result=searchRange01(arr,9);
        System.out.println("result is:"+ result);
    }
    //5,7,7,8,8,10
    public static boolean searchRange01(int[] nums, int target) {
        int left=0;
        int right=nums.length;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return true;
            }
                else if(target>nums[mid]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
            }
        }
        return false;
    }


}
