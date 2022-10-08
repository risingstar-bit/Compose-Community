/*
 Leet Code Problem Number - 989

The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

 

Example 1:

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
Example 2:

Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
Example 3:

Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021
*/

//code


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayForm {
    static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        int take=0;int x;int sum=0;
         for (int i=num.length-1;i>=0;i--){
             x=k%10;
             sum=x+num[i]+take;
             if(sum>9){
                 list.add(sum%10);
                 take=sum/10;
             }
             else {
                 list.add(sum);
                 take=sum/10;
             }
             k=k/10;
         }
         while (k!=0){
             int y=k%10;
             sum=y+take;
             if(sum>9){
                 list.add(sum%10);
                 take=sum/10;
             }
             else {
                 list.add(sum);
                 take=sum/10;
             }
             k=k/10;
         }
         if(take>0)
             list.add(take);
         Collections.reverse(list);
         return list;
    }
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{2,9},72984));
    }
}


