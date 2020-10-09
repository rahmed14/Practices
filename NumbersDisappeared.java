package com.company;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumbersDisappeared {

    public static void main(String[] args) {
        int [] result={1,1};
        System.out.println("result is:"+findDisappearedNumbers01(result));

    }

    //with arraylist
    public static List<Integer> findDisappearedNumbers(int[] nums) {

//        ArrayList list01 = new ArrayList<>(Arrays.asList(nums));
        List<Integer> list01 = new ArrayList<Integer>();
        for(Integer text:nums) {
            list01.add(text);
        }

        System.out.println("arraylist is "+ list01.size());

        ArrayList<Integer> result= new ArrayList<>();

    //1, 1
        for(int i=1;i<=list01.size();i++){
            int compare=i;
            if(!list01.contains(compare)){
                result.add(compare);
            }
        }
        return result;

    }
    public static List<Integer> findDisappearedNumbers01(int[] nums) {
        int[] arr = new int[nums.length + 1];

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;

        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] ==0) {
                result.add(i);
            }
        }

        return result;
    }


}
