<h1>Maximum Subarray Sum: Kadane’s Algorithm </h1>

 • Subarrays are arrays inside another array which only contains contiguous elements.

  <h3><ins>PROBLEM-</ins>  </h3>
   Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

  <h3><ins>APPROACH-</ins> <h3>
   To print the subarray with the maximum sum the idea is to maintain start index of currSum at current index so that whenever maxSum is updated with currSum then start index and end index of subarray can be updated with start and current index.

 <h3><ins>EXAMPLE 1-</ins></ins>  <h3>
    Input: [-3, -4, 5, -1, 2, -4, 6, -1]
    Output: 8
    Explanation: Subarray [5, -1, 2, -4, 6] is the max sum contiguous subarray with sum 8.

 <h3><ins>EXAMPLE 2-</ins><h3>
    Input: nums = [-2, 1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: [4 ,-1,2,1] has the largest sum = 6.

 <h3><ins>EXAMPLE 3- </ins></ins> <h3>
    Input: nums = [-2 ,  3 , -1  , 2 ,  -2]
    Output: 4
    Explanation: [3, -1, 2] has the largest sum = 4


<h3><ins>DRY RUN-</ins><h3>
 
        start= starting index of maximum sum subarray
        end= starting index of maximum sum subarray 

        ARRAY:  -2   3  -1   2  -2
                currSum = 0
                maxSum = INT_MIN
                start= 0
                end=   0

        i=0    -2   3  -1   2  -2
                currSum = 3
                maxSum = 3
                start= 0
                end=   0
        
        i=1     -2   3  -1   2  -2
                currSum = 3
                maxSum = 3
                start=  1
                end=    1
        
        i=2     -2   3  -1   2  -2
                currSum = 2
                maxSum = 3
                start=   1
                end=     1
                  
        i=3     -2   3  -1   2  -2
                currSum = 4
                maxSum =  4
                start=    1
                end=      3

        i=4    -2   3  -1   2  -2
                currSum = 2
                maxSum = 4
                start=   1
                end=     3

        finally returns maxSum= 4, for the subarray between the index 1 and 3 of the array i.e. [ 3 , -1  , 2 ]


 • It is a very efficient algorithm as it uses 
   Time Complexity: O(n)
   Auxiliary Space: O(1)












