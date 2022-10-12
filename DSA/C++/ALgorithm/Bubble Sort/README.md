
# BUBBLE SORT

Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.

## How does Bubble Sort Work?


Input: arr[] = {5, 1, 4, 2, 8}

* First Pass: 

Bubble sort starts with very first two elements, comparing them to check which one is greater. <br />
-( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1. <br />
-( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4    <br />
-( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2    <br />
-( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.

* Second Pass: 

Now, during second iteration it should look like this: <br />
-( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )    <br />
-( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2    <br />
-( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )    <br />
-( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )    <br />

* Third Pass: 

Now, the array is already sorted, but algorithm does not know if it is completed.
The algorithm needs one whole pass without any swap to know it is sorted.  <br />
-( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )     <br />
-( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )      <br />
-( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )      <br />
-( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )      <br />

Therefore, In our Algorithm, e optimized our code by using a variable which is initially false which will get true when any swap will be done during the pass.
* If there is no swap in last pass then the loop will break.


## Follow the below steps to solve the problem:
1. Run a nested for loop to traverse the input array using two variables i and j, such that 0 ≤ i < n-1 and 0 ≤ j < n-i-1
2. If arr[j] is greater than arr[j+1] then swap these adjacent elements, else move on
3. Print the sorted array

# IMPORTANT OBSERVATION
**Time Complexity: O(N2) <br/>
Auxiliary Space: O(1)**  <br/>

**Worst and Average Case Time Complexity: O(N2).** The worst case occurs when an array is reverse sorted.  <br/>
**Best Case Time Complexity: O(N).** The best case occurs when an array is already sorted. <br/>
**Auxiliary Space: O(1)** 