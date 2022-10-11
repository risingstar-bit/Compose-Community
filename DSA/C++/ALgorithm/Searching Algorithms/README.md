# Searching Algorithms

### Binary Search Algorithm

Binary search is a divide and conquer algorithm which repeatedly divides the array into two halves to search for an element in a sorted array.
The fundamental steps of the algorithm are-
1. Start with the middle element of the array.
2. If the value of the middle element is equal to the element to be searched, then return the index of middle element stating that it is found.
3. Else if the value of middle element is greater than the element to be searched, then narrow the search interval to the lower half of the array.
4. Otherwise, narrow the search interval to the upper half of the array.
5. Repeat from step 2 until the element is found or the search interval gets empty.
6. Return -1 stating that the element does not exist in the array.

Time complexity: O(log N)
Auxiliary space: O(1)

### Linear Search Algorithm

Linear search is the simplest searching technique which starts a sequential search from first element and goes through each element of the array until the desired one is found.
The search continues till the last element of the array.
The fundamental steps involved are-
1. Start from the first element of the array and compare the value of desired element with each element one-by-one.
2. If the value matches with an element, return its index stating that the element is found.
3. If the last element is reached and it does not match with the desired element, return -1 stating that the element is not found.

Time complexity: O(N)
Auxiliary space: O(1)