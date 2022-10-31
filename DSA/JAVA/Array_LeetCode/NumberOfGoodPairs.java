package com.company.Arrays;

public class NumberOfGoodPairs {
    static int numberOfGoodPairs(int nums[]){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                if(nums[i]==nums[j])
                    sum++;

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(numberOfGoodPairs(new int[]{1,2,3,1,1,3}));
    }
}
