#include<iostream>
using namespace std;

bool linearSearch(int arr[],int size, int key){
    for(int i=0;i<size;i++){
        if(arr[i]==key){
            return true;
        }
    }
    return false;
}
int main(){
    int size,key;
    cout<<"Enter the size and Key of array: ";  
    cin>>size>>key;
    int arr[1000];
    cout<<"Enter the element: ";
    for(int i=0;i<size;i++){
        
        cin>>arr[i];
    }
    if(linearSearch(arr,size,key)){
        cout<<"Found"<<endl;
    }
    else{
        cout<<"Not Found"<<endl;
    }

}