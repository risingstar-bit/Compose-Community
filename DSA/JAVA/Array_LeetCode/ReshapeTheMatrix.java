package com.company.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReshapeTheMatrix {
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int x=mat.length,y=mat[0].length;
        int m=0,n=0;
        if(x==r && y==c)
            return mat;
        if(x*y!=r*c)
            return mat;

        int arr[][]=new int[r][c];
           for (int i=0;i<r;i++){
               for (int j=0;j<c;j++){
                   if (n<y){
                       arr[i][j]=mat[m][n];
                       n++;
                   }
                   else {
                       n=0;
                       m++;
                       arr[i][j]=mat[m][n];
                       n++;
                   }
               }
           }
       return arr;
        }
    public static void main(String[] args) {
        int mat[][]= {{1,2},{3,4}};
        int ans[][]=matrixReshape(mat,1,6);
        for (int i=0;i<ans.length;i++){
            for (int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
