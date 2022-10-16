package com.Arrays;

public class MaximumWealth {
    public static void main(String[] args) {
        int [][]accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int sum =0;
        int max=0;
        for (int i=0; i< accounts.length; i++){
            for (int j=0; j< accounts[i].length; j++){
                sum = sum+accounts[i][j];
            }
            if (sum>max){
                max= sum;
            }
            sum = 0;
        }
        return max;
    }
}
