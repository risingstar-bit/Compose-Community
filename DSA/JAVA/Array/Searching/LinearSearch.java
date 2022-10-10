/*

In LinearSearch algorithm, array is traversed from first element to last element. 
Here, if value is matched while traversing array, Then index of value is returned

If value is not found then -1 is returned

*/
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {9, 4, 3, 2, 1};
        int value = 1;

        int index = linearSearch(value, arr);
        System.out.println("Index of " + value + " is " + index);

        value = 5;
        index = linearSearch(value, arr);
        System.out.println("Index of " + value + " is " + index);
    }

    /*
    Parameters - 
        value : pass the value you wanted to search for
        arr : pass the array you wanted to search value in

    Return -
        returns index of value in array 0 based indexing
        return -1 if value is not in array
    */
    static int linearSearch(int value, int[] arr){
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == value) return i;
        }

        return -1;
    }
}
