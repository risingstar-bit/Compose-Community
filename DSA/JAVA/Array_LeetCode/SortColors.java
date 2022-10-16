package com.company.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
        sortColors(nums);
    }
    static void sortColors(int[] nums){
        //using bubble sort...
       for(int i=0;i<nums.length;i++){
           for (int j=0;j<nums.length-i-1;j++){
               if(nums[j]>=nums[j+1]){
                   int temp=nums[j];
                   nums[j]=nums[j+1];
                   nums[j+1]=temp;
               }
           }
       }
        System.out.println(Arrays.toString(nums));
    }
}
