/*We have given an array we have to return the smallest missing positive integer. THe array may also contain negative numbers.for eg. input- 1 2 3 4 output-5 input- -1 -5 0 1 3  output-2 */
#include <bits/stdc++.h> 
int firstMissing(int arr[], int n)
{
  int i=0, j =0;
   sort(arr,arr+n);
   for(int i=0; i<n;i++)
   {
       if(arr[i]>0)
       {
           j++;
         if(arr[i]!=j)return j;
       }
   }
   return j+1;
}
