package com.company.Arrays;

import java.util.Arrays;

public class RotateArray {
    static void rotate(int[] nums, int k) {
          if(k==0) {
//              System.out.println(Arrays.toString(nums));
              return;
          }
        int prev=nums[0];
        int last=nums[nums.length-1];
          for (int i=1;i<nums.length;i++){
              int current=nums[i];
              nums[i]=prev;
              prev=current;
          }
          nums[0]=last;
          rotate(nums,k-1);
        }
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7},3);
    }
}
