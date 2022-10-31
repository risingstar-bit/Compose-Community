package com.company.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueUptoZero {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        int sum=0,i;
        for ( i=0;i<n-1;i++)
        {
            arr[i]=i+1;
            sum=sum+arr[i];
        }
        arr[i]=-sum;
        System.out.println(Arrays.toString(arr));
    }
}
