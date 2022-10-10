#include<bits/stdc++.h>
using namespace std;
int N=86028121;
bool Sieve[86028121+ 1];
vector<int> primes;
void createSieve(){
    
    for(int i=2;i<=N;i++){
        Sieve[i]=true;
    }
    for(int i=2;i*i<=N;i++){
        if(Sieve[i]==true){
            for(int j=i*i;j<=N;j+=i){
                Sieve[j]=false;
            }
        }
    }
    //5*10^6
    // int limit=5000000;
    // int count=0;
    // int size=0;
    // for(int i=2;i<=N;i++){
    //     if(Sieve[i]==true){
    //         count++;
    //         if(count==limit){
    //             size=i;
    //             break;
    //         }
    //     }
    // }
    // cout<<size<<endl;
    for(int i=2;i<=N;i++){
        if(Sieve[i]==true){
            primes.push_back(i);
        }
    }


}

int main(){
    createSieve();
    int t;
    cout<<"Enter the number of Quires ";
    cin>>t;
    
    while(t--){
        int k;
        cin>>k;
        if(k==1) cout<<"Please enter Number greater than 1"<<endl;
        cout<<"Prime no "<<primes[k-1]<<endl;

    }
}
