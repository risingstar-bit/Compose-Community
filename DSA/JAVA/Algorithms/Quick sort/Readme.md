Quicksort picks an element as pivot, and then it partitions the given array around the picked pivot element. In quick sort, a large array is divided into two arrays in which one holds values that are smaller than the specified value (Pivot), and another array holds the values that are greater than the pivot.

After that, left and right sub-arrays are also partitioned using the same approach. It will continue until the single element remains in the sub-array.

Quick Sort Algorithm:
# Choosing the pivot
Picking a good pivot is necessary for the fast implementation of quicksort. However, it is typical to determine a good pivot. Some of the ways of choosing a pivot are as follows -
Pivot can be random, i.e. select the random pivot from the given array.
Pivot can either be the rightmost element of the leftmost element of the given array.
Select median as the pivot element.

Algorithm

Algorithm:
QUICKSORT (array A, start, end)     
{  
  if (start < end){  
    p = partition(A, start, end)  
    QUICKSORT (A, start, p - 1)    
    QUICKSORT (A, p + 1, end)    
   }   
}  

Partition Algorithm:

The partition algorithm rearranges the sub-arrays in a place.

PARTITION (array A, start, end)     
{  
  pivot ? A[end]     
  i ? start-1     
  for j ? start to end -1 {  
  do if (A[j] < pivot) {    
  then i ? i + 1     
  swap A[i] with A[j]   
   }
  }   
  swap A[i+1] with A[end]     
  return i+1  
}  

# Quicksort complexity
Now, let's see the time complexity of quicksort in best case, average case, and in worst case. We will also see the space complexity of quicksort.

1. Time Complexity
Case	Time Complexity
  Best Case     -------	O(n*logn)
  Average Case	------- O(n*logn)
  Worst Case	  ------- O(n^2)

Best Case Complexity - In Quicksort, the best-case occurs when the pivot element is the middle element or near to the middle element. The best-case time complexity of quicksort is O(n*logn).
Average Case Complexity - It occurs when the array elements are in jumbled order that is not properly ascending and not properly descending. The average case time complexity of quicksort is O(n*logn).
Worst Case Complexity - In quick sort, worst case occurs when the pivot element is either greatest or smallest element. Suppose, if the pivot element is always the last element of the array, the worst case would occur when the given array is sorted already in ascending or descending order. The worst-case time complexity of quicksort is O(n^2).
