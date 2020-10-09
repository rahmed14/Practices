package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> result= new ArrayList<Integer>();
        result.add(1);
        result.add(0);
        result.add(1);
        result.add(2);
        result.add(2);
        int [] res={1,0,1,2,2};
//        System.out.println("with arraylist result is:"+removeDuplicates(res) );
//        System.out.println("wiht stack result is:"+WithStack(res) );
        System.out.println("wiht stack result is:"+WithSet(res) );


    }
    public static ArrayList<Integer> removeDuplicates(int[] nums) {
//        int[] result=new int[nums.length];
        ArrayList<Integer> end= new ArrayList<Integer>();
        int size=nums.length;
        for (int i = 0; i < size; i++) {
            if (!end.contains(nums[i])){
                end.add(nums[i]);
            }
        }
        return end;

    }
    //1,0,1,2,2
    public static Stack<Integer> WithStack(int[] nums) {
        Stack<Integer> stack= new Stack<Integer>();
        int size=nums.length;
        for (int i = 0; i < size; i++) {
            int x=nums[i];
            Integer pos = (Integer) stack.search(x); //-1,
            if (pos==-1){
                stack.push(nums[i]);
            }
        }
        return stack;
    }
    public static Set<Integer> WithSet(int[] nums) {
        Set<Integer> hash_Set = new HashSet<Integer>();
        int size=nums.length;
        for (int i = 0; i < size; i++) {
            hash_Set.add(nums[i]);
        }
        return hash_Set;

    }


    public int removeDuplicates03(int[] nums) {
        ArrayList<Integer> save= new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int element=nums[i];

            if(!save.contains(element)){
                save.add(element);
            }
        }
        return save.size();

        }























    }
