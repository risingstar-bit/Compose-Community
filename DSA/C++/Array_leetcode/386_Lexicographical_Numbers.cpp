
// Leetcode 386

class Solution
{
public:
    vector<int> lexicalOrder(int n)
    {
        vector<string> s;
        vector<int> v;

        for (int i = 1; i <= n; i++)
        {
            string q = to_string(i);

            s.push_back(q);
        }
        sort(s.begin(), s.end());
        for (auto e : s)
        {
            v.push_back(stoi(e));
        }
        return v;
    }
};