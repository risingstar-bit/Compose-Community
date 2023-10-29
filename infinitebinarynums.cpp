#include <iostream>
using namespace std;

int main() {

int n;
cout << "Enter the no. of turns : ";
cin >> n;

for(int i = 1; 1 <= n; i++){
    for(int j = 1; j <= i; j++){
        cout << " ";
    }

    if (i%2 == 1){
        cout << 1;
    }
    else {
        cout << 0;
    }
}
return 0;
}
