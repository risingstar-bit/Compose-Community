#include <algorithm>
#include <iostream>
#include <vector>
#include <climits>

using namespace std;
void maximumSubarraySum(vector<int> arr)
{
    int n = arr.size();
    int maxSum = INT_MIN, currSum = 0, start = 0, end = 0, s = 0;

    for (int i = 0; i < arr.size(); i++)
    {
        currSum = currSum + arr[i];
        if (currSum > maxSum)
        {
            maxSum = currSum;
            start = s;
            end = i;
        }
        if (currSum < 0)
        {
            currSum = 0;
            s = i + 1;
        }
    }

    cout << "Maximum contiguous sum is " << maxSum
         << endl;
    cout << "Starting index " << start << endl
         << "Ending index " << end << endl;
}
// Driver's code
int main()
{

    vector<int> a = {-2, 3, -1, 2, -2};
    maximumSubarraySum(a);
    return 0;
}