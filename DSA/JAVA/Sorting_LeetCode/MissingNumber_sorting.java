package com.company.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer>list=new ArrayList<>();
     int i=0,j=0;
     while (i<nums1.length && j<nums2.length){
         if(nums1[i]==nums2[j]) {
             if(!list.contains(nums1[i]))
             list.add(nums1[i]);
             i++;j++;
         }
         else if(nums1[i]>nums2[j]) {
             j++;
         }
         else
             i++;
     }
     int ans[]=new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            ans[k]=list.get(k);
        }
        return ans;
    }
public static void main(String[] args) {
    int nums1[]={1};
    int nums2[]={2,2,2,2,2,1};
    System.out.println(Arrays.toString(intersection(nums1,nums2)));
}
}
