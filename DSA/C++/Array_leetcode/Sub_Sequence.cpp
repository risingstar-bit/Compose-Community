#include <bits/stdc++.h>
using namespace std;
void findQuadruplet(int arr[], int n)
{

	// If number of elements < 4
	// then no Quadruple are possible
	if (n < 4) {
		cout << "No such Quadruple found";
		return;
	}
	// Initializing the variables with
	// INT_MAX macros.

	// To store the min element.
	int small = INT_MAX;

	// To store the second minimum element.
	int second_small = INT_MAX;

	// To store the middle element.
	int mid = INT_MAX;

	// To remember the mid and the
	// minimum element.
	int min = 0;
	int main_mid = 0;
	int main_min = 0;

	// Traversing the array to find
	// the Quadruple
	for (int i = 0; i < n; i++) {
		if (arr[i] <= small) {
			small = arr[i];
		}
		else if (arr[i] <= second_small) {
			second_small = arr[i];
			min = small;
		}
		else if (arr[i] <= mid) {
			mid = arr[i];
			main_mid = second_small;
			main_min = min;
		}
		else {

			// If the number is greater than mid.
			cout << "Quadruplets: " << main_min
				<< " " << main_mid << " "
				<< mid << " " << arr[i];

			// Return if Quadruple is found.
			return;
		}
	}

	// If no Quadruple is found
	cout << "No such Quadruple";
	return;
}

// Driver program
int main()
{
	int arr[] = { 1, 7, 4, 5, 3, 6, 10 , 45 };
	int N = sizeof(arr) / sizeof(int);
	findQuadruplet(arr, N);
	return 0;
}
