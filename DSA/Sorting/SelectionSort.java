/*The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) 
 * from the unsorted part and putting it at the beginning. 

The algorithm maintains two subarrays in a given array.

The subarray which already sorted. 
The remaining subarray was unsorted.
In every iteration of the selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked
and moved to the sorted subarray. 
*/





import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {38, 52, 9, 18, 6, 62, 13};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
       for(int i=0 ; i<arr.length ; i++){
            int min = i ;
            for(int j =i+1 ; j<arr.length ; j++){
                if(arr[j] < arr[min]){
                    min = j ;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min]= temp;
        }
    }
}
