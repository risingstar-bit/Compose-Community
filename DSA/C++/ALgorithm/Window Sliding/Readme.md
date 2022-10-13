# What is Window Sliding?
  Window Sliding is a computational technique through which nested loops can be replaced by a single loop, thereby reducing the time complexity of the code.
  It is a problem-solving technique of data structure and algorithm for problems that apply arrays or lists. These problems are painless to solve using a brute force approach in O(n²) or O(n³). However, the Sliding window technique can reduce the time complexity to O(n).

# Example
  Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.

      Input  : arr[] = {100, 200, 300, 400}, k = 2
      Output : 700

      Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4 
      Output : 39
      We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.

      Input  : arr[] = {2, 3}, k = 3
      Output : Invalid
      There is no subarray of size 3 as size of whole array is 2.
# Approach
  The technique can be best understood with the window pane in bus, consider a window of length n and the pane which is fixed in it of length k. 
  Consider, initially the pane is at extreme left i.e., at 0 units from the left. 
  Now, co-relate the window with array arr[] of size n and pane with current_sum of size k elements. 
  Now, if we apply force on the window such that it moves a unit distance ahead. 
  The pane will cover next k consecutive elements. 

  Applying sliding window technique : 

      1) We compute the sum of first k elements out of n terms using a linear loop and store the sum in variable window_sum.
      2) Then we will graze linearly over the array till it reaches the end and simultaneously keep track of maximum sum.
      3) To get the current sum of block of k elements just subtract the first element from the previous block and add the last element of the current block.
      
# Time Complexity
  ### With Naive approach:
      Time Complexity:- O(n*k)
      n is length of array
      k is length of subarray
  ### With Window Sliding approach:
      Time Complexity:- O(n)
      n is length of array
