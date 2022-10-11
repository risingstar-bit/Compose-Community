#include<iostream>
using namespace std;

int binarySearch(int arr[], int n, int x){
    int start=0, end=n-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(arr[mid]==x){
            return mid;

        }
        else if(arr[mid]>x){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    return -1;

}

int main(){
    int arr[] = {1,2,3,4,5,6,7,8,10};
    int n = sizeof(arr)/sizeof(arr[0]);
    int x = 5;
    int result = binarySearch(arr, n, x);
    if(result == -1){
        cout<<"Element not found";
    }
    else{
        cout<<"Element found at index "<<result;
    }
    
    return 0;
}