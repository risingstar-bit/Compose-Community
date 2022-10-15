#include <bits/stdc++.h>
using namespace std;
class ListNode
{
public:
    bool data;
    ListNode *next;
};
int getDecimalValue(ListNode *head)
{
    ListNode *n;
    n = head;
    int count = 0;
    while (n != NULL)
    {
        n = n->next;
        count++;
    }
    n = head;
    count = count - 1;
    int sum = 0;
    while (n != NULL)
    {
        sum += n->data * (int)(pow(2, count) + 0.5);
        n = n->next;
        count--;
    }
    return sum;
}

// Utility function to create a new node.
ListNode *newNode(bool data)
{
    ListNode *temp = new ListNode;
    temp->data = data;
    temp->next = NULL;
    return temp;
}

// Drivers Code
int main()
{
    ListNode *head = newNode(1);
    head->next = newNode(0);
    head->next->next = newNode(1);
    cout << "Integer value :- " << getDecimalValue(head);
    return 0;
}