#include <iostream>
using namespace std;

class Node {
   public:
    int data;
    Node *next;

    Node(int data) {
        this->data = data;
        next = NULL;
    }
};#include<iostream>
using namespace std;

class Stack {
	Node *head;
    int size;
   public:
    Stack() {
        head = NULL;
        size = 0;
    }

	int getSize() {
        return size;
    }

    bool isEmpty() {
      return (size==0); 
    }

    void push(int element) {
        Node *newnode = new Node(element);
        newnode->next = head;
        head = newnode;
        size++;
    }

    int pop() { 
        if(isEmpty()) {
			return -1;		
		}
		int ans = head -> data;
		Node *temp = head;
		head = head->next;
		delete temp;
		size--;
		return ans;
    }

    int top() {
      if(isEmpty()) {
			return -1;		
		}
		return head -> data;  
    }
};int main() {
    Stack st;

    int q;
    cin >> q;

    while (q--) {
        int choice, input;
        cin >> choice;
        switch (choice) {
            case 1:
                cin >> input;
                st.push(input);
                break;
            case 2:
                cout << st.pop() << "\n";
                break;
            case 3:
                cout << st.top() << "\n";
                break;
            case 4:
                cout << st.getSize() << "\n";
                break;
            default:
                cout << ((st.isEmpty()) ? "true\n" : "false\n");
                break;
        }
    }
}
