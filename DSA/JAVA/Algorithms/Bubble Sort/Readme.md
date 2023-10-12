### BUBBLE SORT ALGORITHM
It is a simple sorting algorithm that compares adjacent elements of an array and swaps them
if the element on the right is smaller than the one on the left.
It is an in-place sorting algorithm i.e. no extra space is needed for this sort, the array itself is modified.

## ALGORITHM 
* Traverse from left and compare adjacent elements and the higher one is placed at right side. 
* In this way, the largest element is moved to the rightmost end at first. 
* This process is then continued to find the second largest and place it and so on until the data is sorted.

## Complexity Analysis of Bubble Sort:
Time Complexity: O(N2)
Auxiliary Space: O(1)

#Example:

## Input: arr[] = {5, 1, 4, 2, 8}

## First Pass: 

Bubble sort starts with very first two elements, comparing them to check which one is greater.

( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1. 
( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4 
( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2 
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
## Second Pass: 

Now, during second iteration it should look like this:
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ) 
( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 ) 
## Third Pass: 

Now, the array is already sorted, but our algorithm does not know if it is completed.
The algorithm needs one whole pass without any swap to know it is sorted.
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
