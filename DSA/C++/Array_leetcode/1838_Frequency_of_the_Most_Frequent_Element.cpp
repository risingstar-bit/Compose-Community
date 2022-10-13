//              Frequency of the Most Frequent Element

// Leetcode 1838 :: https://leetcode.com/problems/frequency-of-the-most-frequent-element/

class Solution
{
public:
    int maxFrequency(vector<int> &nums, int k)
    {
        sort(nums.begin(), nums.end());
        long long l = 0;
        long long total = 0;
        long long ans = 0;
        for (long long r = 0; r < nums.size(); r++)
        {
            total += nums[r];

            while (nums[r] * (r - l + 1) > (total + k))
            {
                total -= nums[l];
                l++;
            }
            ans = max(ans, r - l + 1);
        }
        return ans;
    }
};