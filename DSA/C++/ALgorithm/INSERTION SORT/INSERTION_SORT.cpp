#include<iostream>
#include<vector>

using namespace std;

int main()
{
    int n ,i,j,key;
    cout << "Enter the length of array : ";
    cin>>n;
    int arr[n];
    cout<<"Enter the data in array"<<endl;
    for ( i = 1; i <= n; i++)
    {
        cin>>arr[i];
    }
    for ( j = 2; j <= n; j++)
    {
        key=arr[j];
        i=j-1;
        while (i>0 && arr[i]>key)
        {
            arr[i+1]=arr[i];
            i=i-1;     
        }
        arr[i+1]=key;
    }    
    for ( i = 1; i <= n; i++)
    {
        cout<<arr[i]<<" ";
    }
    
}
