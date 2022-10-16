package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Candies {
    public static void main(String[] args) {
        int candies[] = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies,3));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = 0;
        for (int i=0;i<n;i++){
            if (candies[i]>max){
                max = candies[i];
            }
        }

        List list = new ArrayList<>();
        for (int i=0;i<n;i++){
            if (candies[i]+extraCandies>=max){
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
        return list;
    }
}
