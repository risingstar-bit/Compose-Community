package com.company.Arrays;


// Works for only square matrix


import java.util.ArrayList;
import java.util.Arrays;

public class Set_Matrix_Zero {
    public static void main(String[] args) {
        int arr[][]={{0,1},{1,1}};
        ArrayList<Integer>list=new ArrayList<>();
        int m=0,n=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    m=i;
                    n=j;
                    list.add(m);list.add(n);
                }
            }
        }
        for (int c=0;c<list.size()-1;c++){
            int g1=list.get(c);
            int g2=list.get(c+1);
           for (int i=0;i<arr.length;i++){
               arr[g1][i]=0;
               arr[i][g2]=0;
           }
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
