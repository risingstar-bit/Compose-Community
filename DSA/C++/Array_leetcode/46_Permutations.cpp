class Solution {
public:
    
    void solve(int index, vector<int>& vec, vector<vector<int>> &ans){
        if(index==vec.size()){
            ans.push_back(vec);
            return;
        }
        
        for(int i=index;i<vec.size();i++){
            swap(vec[i], vec[index]);
            solve(index+1, vec, ans);
            swap(vec[i], vec[index]);
        }
    }
    
    vector<vector<int>> permute(vector<int>& nums) {
        vector<int> vec = nums;
        vector<vector<int>> ans;
        solve(0, vec, ans);
        return ans;
    }
};
