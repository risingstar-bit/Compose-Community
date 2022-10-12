#include<bits/stdc++.h>
using namespace std;

int main(){
    int row;
    cin>>row;
    int *arr=new int[row];//creating a dynamic array of size row
    for(int i=0;i<row;i++){
        cin>>arr[i];

    }
    cout<<"The array is:"<<endl;
    int **jagged=new int*[row];//creating a dynamic array of pointers of size row
    for(int i=0;i<row;i++){
        jagged[i]=new int[arr[i]];//creating a dynamic array of size arr[i] at each index of jagged array
    }
    cout<<"Enter the elements of the jagged array:"<<endl;
    for(int i=0;i<row;i++){
        for(int j=0;j<arr[i];j++){
            cin>>jagged[i][j];
        }
    }
    //printing the jagged array
    cout<<"The jagged array is:"<<endl;
    for(int i=0;i<row;i++){
        for(int j=0;j<arr[i];j++){
            cout<<jagged[i][j]<<" ";
        }
        cout<<endl;
    }
}
