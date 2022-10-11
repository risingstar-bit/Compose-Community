// Author: Siddharth Verma
#include <bits/stdc++.h>
using namespace std;
int linearSearch(vector<int>&a, int x)
{
    for(int i=0;i<a.size();i++)
    {
        if(a[i]==x)
            return i;
    }
    return -1;
}
int main()
{
    int x, ind;
    vector<int>a{2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
    cout<<"Enter the element to search: ";
    cin>>x;
    ind=linearSearch(a,x);
    if(ind != -1)
        cout<<"Element found at index "<<ind<<"\n";
    else
        cout<<"Element not found\n";
	return 0;
}
