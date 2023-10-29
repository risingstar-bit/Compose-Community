#include <iostream>
using namespace std;

int main() {
    int num, x, y, z, arm;
    
    cout << "Enter three digit num :";
    cin >> num;
    cout << "The no. entered by the user is :" << num << endl;
    cout << "Enter the hundreds digit of the no. :" << endl;
    cin >> x;
    cout << "Enter the tens digit of the no. :" << endl;
    cin >> y;
    cout << "Enter the unit digit of the no. :" << endl;
    cin >> z;
    cout << "The value of hundreds digit is :" << x << "\nThe value of tens digit is :" << y << "\nThe value of unit digit is :" << z << "."<<endl;
    arm = (x*x*x) + (y*y*y) + (z*z*z);
    cout << "The value found from product of cube of individual digit is :"<< arm << "."<< endl;
    if(arm == num){
        cout << "The given no. is an armstrong no."<<endl;
    }
    else {
        cout << "The given no. is not an armstrong no." <<endl;
    }
    
 return 0;   
}
