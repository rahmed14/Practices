package com.company;

public class MaxAread {
    public static void main(String[] args) {

        System.out.println("result is:"+ maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] height) {
        int maxarea = 0;
        for (int i = 0; i < height.length; i++)
            for (int j = i + 1; j < height.length; j++)
                maxarea = Math.max(maxarea, (Math.min(height[i],height[j])*Math.min(height[i],height[j])));
        return maxarea;
    }
}
