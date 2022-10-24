//Cycle sort is an in-place sorting Algorithm, unstable sorting algorithm, and a
//comparison sort that is theoretically optimal in terms of the total number of writes
//to the original array.
//
//It is optimal in terms of the number of memory writes. It minimizes the number of
//memory writes to sort (Each value is either written zero times if it’s already in its
//correct position or written one time to its correct position.)
//
//It is based on the idea that the array to be sorted can be divided into cycles.
//Cycles can be visualized as a graph. We have n nodes and an edge directed from node i
//to node j if the element at i-th index must be present at j-th index in the sorted array.


package sortingAlgo;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort( int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] -1 ; // because array is started from 1
            if(arr[i] != arr[correct] ){
                swap(arr , i , correct) ;
            }
            else{
                i++ ;
            }
        }
    }
    static void swap (int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
}
