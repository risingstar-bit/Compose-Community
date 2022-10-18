#include <bits/stdc++.h>
using namespace std;
#include <string.h>

void count_sort( int arr[], int n){

 int k =arr[0];
 for(int i=0;i<n;i++){
     k=max(k,arr[i]);
 }

  int count[10]={0};
 for(int i=0;i<n;i++){
     count[arr[i]]++;
 }
for(int i=0;i<=k;i++){
  count[i]+=count[i-1];

}
int result[n];
for(int i=n-1;i>=0;i--){
    result[--count[arr[i]]]= arr[i] ;

}
for(int i =0;i<n;i++){
    arr[i]=result[i];
}


}



int main(){
   int arr[]={8,2,8,5,5,7,8,7};
  count_sort(arr,8);

for(int i=0;i<8;i++) 
{
    cout<<arr[i]<<" ";
}

return 0;

}
