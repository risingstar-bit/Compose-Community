//442. Find All Duplicates in an Array

class Solution {
public:
    vector <int> findDuplicates(vector <int>& nums) {
        vector<int> v1;
        int n=nums.size();
        sort(nums.begin(),nums.end());
        for(int i=0 ; i<n-1 ; i++){
            if(nums[i]==nums[i+1]){
                v1.push_back(nums[i]);
            }
        }
        return v1;
    }
};