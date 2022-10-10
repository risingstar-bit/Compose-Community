#include <bits/stdc++.h>
using namespace std;
int binarySearch(vector<int>&a, int x)
{
    int low=0,high=a.size()-1,mid;
    while(low<=high)
    {
        mid=low+(high-low)/2;
        if(a[mid]==x)
            return mid;
        else if(a[mid]>x)
            high=mid-1;
        else
            low=mid+1;
    }
    return -1;
}
int main()
{
    int x, ind;
    vector<int>a{2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
    cout<<"Enter the element to search: ";
    cin>>x;
    ind=binarySearch(a,x);
    if(ind != -1)
        cout<<"Element found at index "<<ind<<"\n";
    else
        cout<<"Element not found\n";
	return 0;
}
