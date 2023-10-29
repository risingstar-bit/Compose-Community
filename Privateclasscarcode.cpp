#include<iostream>
using namespace std;
class Car{

private:
int profit;

public :

void setProfit(int p){
  profit = p;
}
int getProfit() {
  return profit;
}
string brand;
string model;
int price;
string origin;

};
int main(){
Car car1;
car1.brand = "Ford";
car1.model = "GT";
car1.price=500000;
car1.origin = "The United States of America";
car1.setProfit(85000);
Car car2;
car2.brand = "Lamborghini";
car2.model = "Centanario Roadster";
car2.price = 1920000;
car2.origin = "Italy";
car2.setProfit(550000);
Car car3;
car3.brand = "Bugatti";
car3.model = "Centodiecci";
car3.price = 8800000;
car3.origin = "France";
car3.setProfit(1000000);
Car car4;
car4.brand = "Ferrari";
car4.model = "Daytona SP3";
car4.price = 2200000;
car4.origin = "Italy";
car4.setProfit(850000);

cout <<"The Model " <<car1.model<< " from " <<car1.brand<< "originates from" <<car1.origin<< " and costs $" <<car1.price<< "." << endl;
cout <<"The Model " <<car2.model<< " from " <<car2.brand<< "originates from" <<car2.origin<< " and costs $" <<car2.price<< "." << endl;
cout <<"The Model " <<car3.model<< " from " <<car3.brand<< ",originates from" <<car3.origin<< " and costs $" <<car3.price<< "." << endl;
cout <<"The Model " <<car4.model<< " from " <<car4.brand<< ",originates from" <<car4.origin<< " and costs $" <<car4.price<< "." << endl;

cout << "The Profit of " <<car1.model << " is " << car1.getProfit();
cout << "\nThe Profit of " << car2.model << " is " << car2.getProfit();
cout << "\nThe Profit of " << car3.model << " is " << car3.getProfit();
cout << "\nThe Profit of " << car4.model << " is " << car4.getProfit();
return 0;
}
