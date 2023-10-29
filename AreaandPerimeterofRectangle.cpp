#include <iostream>
using namespace std;

struct rectangle {
    int l;
    float b;
};
int main() {
    struct rectangle x;
    cout << "enter the lenght :";
    cin >> x.l;
    cout << "enter the breadth :";
    cin >>x.b;
    cout << "\nArea = "<< x.l * x.b;
    cout << "\nPerimeter = " << 2*(x.l + x.b);
    cout <<"\n";

    return 0;
}
