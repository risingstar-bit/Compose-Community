package com.company.Sorting;

import java.util.Arrays;

public class HeightChecker {
    static int heightChecker(int[] heights) {
        int arr[]= Arrays.copyOfRange(heights,0,heights.length);
        Arrays.sort(arr);
        int count=0;
        for (int i = 0; i < heights.length; i++) {
         if(heights[i]!=arr[i])
             count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{5,1,2,3,4}));
    }
}
