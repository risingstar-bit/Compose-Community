#include <bits/stdc++.h>
using namespace std;

int trap(vector<int> &height)
{
	int res = 0;
	int n = height.size();
	vector<int> lmax(n);
	vector<int> rmax(n);

	// Fill left vector
	lmax[0] = height[0];
	for (int i = 1; i < n; i++)
		lmax[i] = max(height[i], lmax[i - 1]);

	// Fill right vector
	rmax[n - 1] = height[n - 1];
	for (int i = n - 2; i >= 0; i--)
		rmax[i] = max(height[i], rmax[i + 1]);

	// Calculate the accumulated water element by element
	for (int i = 1; i < n - 1; i++)
	{
		res += min(lmax[i], rmax[i]) - height[i];
	}
	return res;
}

// Driver program
int main()
{
	vector<int> height{4, 2, 0, 3, 2, 5};
	cout << trap(height);
	return 0;
}
