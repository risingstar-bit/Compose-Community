#include <bits/stdc++.h>
using namespace std;

// Returns length of the longest
// contiguous subsequence
class Solution {
public:
    int longestConsecutive(vector<int>& nums) {

        // Hash all the array elements
        unordered_set<int> s(begin(nums),end(nums));

        int res = 0,count = 0;

        // check each possible sequence from
	    // the start then update optimal length.
        for(int i=0 ; i<nums.size() ; i++){
            if(s.find(nums[i] - 1) == s.end()){
                count = 1;
                while(s.find(nums[i] + count) != s.end())
                    count ++; 
                    
                // Update the Result.    
                res = max(res , count);
            }
        }
        return res;
    }
};
// Driver code
int main()
{
    Solution obj;
	vector<int> nums{40,3,7,2,5,8,4,6,0,1};
	cout << obj.longestConsecutive(nums);
	return 0;
}
