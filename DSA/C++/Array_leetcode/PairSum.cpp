/*You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.
input:
1
9
1 3 6 2 5 4 3 2 4
7
output:
7*/
#include <iostream>
using namespace std;
int pairSum(int *input, int size, int x)
{
    int i,j,count=0;
    for(i=0;i<size;i++)
    {
        for(j=0;j<size;j++)
        {
            if(input[i]+input[j]==x && i!=j)
            {
                count++;
            }
        }
    }
    return count/2;
}

int main()
{
	int t;
	cin >> t;

	while (t--)
	{
		int size;
		int x;

		cin >> size;
		int *input = new int[size];

		for (int i = 0; i < size; i++)
		{
			cin >> input[i];
		}

		cin >> x;

		cout << pairSum(input, size, x) << endl;

		delete[] input;
	}
	
	return 0;
}
