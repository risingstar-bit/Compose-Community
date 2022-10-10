#include<bits/stdc++.h>
using namespace std;

int partition(int ar[],int l,int r)
{
int pivot=ar[l];
int i;
if(ar[l+1]>ar[l])
i=l+1;
else
    i=l;
for(int j=l+1;j<=r;j++)
{
    if(ar[j]<=pivot)
    {
        swap(ar[j],ar[i]);
        i++;
    }
}
swap(ar[i-1],ar[l]);
return i-1;
}
// 3 8 2 6 5 4 1 7
void QuickSort(int ar[],int l,int r)
{
    if(l>=r)
        return;
   
  int j=partition(ar,l,r);

  QuickSort(ar,l,j-1);
  QuickSort(ar,j+1,r);
}
int main()
{
    int n;
    cout<<"Enter the no of elements = ";
    cin>>n;
    int ar[n];
    for(int i=0;i<n;i++)
    {
      cin>>ar[i];  
     }
 QuickSort(ar,0,n-1);
  cout<<"Sorted array is: ";
  for(int i=0;i<n;i++)
  cout<<ar[i]<<" ";

}
