package com.company.Sorting;

public class MissingNumber {
    static int missingNumber(int[] nums) {
        int n=nums.length;
        int store=0;
        int indexStore=0;
        int i=0;
      while (i<nums.length){
          if(i==nums[i])
              i++;
          else{
              int index=nums[i];
              if(index>nums.length-1){
                  store=index;
                  indexStore=i;
                  i++;
              }
              else {
                  int temp=nums[i];
                  nums[i]=nums[index];
                  nums[index]=temp;
              }
          }
      }
      if(indexStore!=store)
          return indexStore;
      else
         return nums.length;
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5};
        System.out.println(missingNumber(arr));

    }
}

