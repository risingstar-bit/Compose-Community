/*

 Leet Code Problem Number - 2420

You are given a 0-indexed integer array nums of size n and a positive integer k.
We call an index i in the range k <= i < n - k good if the following conditions are satisfied:

     •  The k elements that are just before the index i are in non-increasing order.
     •  The k elements that are just after the index i are in non-decreasing order.
Return an array of all good indices sorted in increasing order.


Example 1:
Input: nums = [2,1,1,1,3,4,1], k = 2
Output: [2,3]
Explanation: There are two good indices in the array:
- Index 2. The subarray [2,1] is in non-increasing order, and the subarray [1,3] is in non-decreasing order.
- Index 3. The subarray [1,1] is in non-increasing order, and the subarray [3,4] is in non-decreasing order.
Note that the index 4 is not good because [4,1] is not non-decreasing.


Example 2:
Input: nums = [2,1,1,2], k = 2
Output: []
Explanation: There are no good indices in this array.

*/

class Solution {
  public List<Integer> goodIndices(int[] nums, int k) {
    final int n = nums.length;
    List<Integer> ans = new ArrayList<>();
    int[] dec = new int[n]; // dec[i] := continuous decreasing before i
    int[] inc = new int[n]; // inc[i] := continuous increasing before i

    Arrays.fill(dec, 1);
    Arrays.fill(inc, 1);

    for (int i = 1; i < n; ++i)
      if (nums[i - 1] >= nums[i])
        dec[i] = dec[i - 1] + 1;

    for (int i = n - 2; i >= 0; --i)
      if (nums[i] <= nums[i + 1])
        inc[i] = inc[i + 1] + 1;

    for (int i = k; i < n - k; ++i)
      if (dec[i - 1] >= k && inc[i + 1] >= k)
        ans.add(i);

    return ans;
  }
}
