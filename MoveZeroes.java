package com.company;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] result={1,0,0,3};
//        System.out.println("resize array is:" + Arrays.toString(moveZeroes(result)));
       pushZerosToEnd(result);

    }
    //1,0,0,3
    public static int[] moveZeroes(int[] nums) {
        int size=nums.length; //4
        int [] resize=new int[size];
        int j=nums.length-1; //3
        int count=0;
        //1
        for (int i = 0; i < size; i++) {
            if(nums[i]==0){
                resize[j]=nums[i]; //1, _, 0_, 0
                j--;
                System.out.println(Arrays.toString(resize));
            }
            if(nums[i]!=0){
                resize[count]=nums[i]; //1,3,0,0
                count++;
                System.out.println( Arrays.toString(resize));
            }
        }
        return resize;

    }
    static void pushZerosToEnd(int arr[])
    {
        int count = 0;  // Count of non-zero elements
        int n=arr.length;

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
        // incremented

        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n)
            arr[count++] = 0;

        System.out.println("resize array is:" + Arrays.toString(moveZeroes(arr)));

    }

}
