#include <bits/stdc++.h>

using namespace std;

struct Node {
    int data;
    struct Node* next;
};


void insert(struct Node** head, int value)
{
    
    struct Node* node= (struct Node*)malloc(sizeof(struct Node));
    if (node == NULL) {
       
        printf("Memory overflow\n");
    }
    else {
        node->data = value;
        node->next = NULL;
        if (*head == NULL) {
            *head = node;
        }
        else {
            struct Node* temp = *head;

            
            while (temp->next != NULL) {
                temp = temp->next;
            }

            
            temp->next = node;
        }
    }
}


void display(struct Node* head)
{
    if (head == NULL) {
        printf("Empty linked list");
        return;
    }
    struct Node* temp = head;
    printf("\n Linked List :");
    while (temp != NULL) {
        printf(" %d", temp->data);
        temp = temp->next;
    }
}


struct Node* last_node(struct Node* head)
{
    struct Node* temp = head;
    while (temp != NULL && temp->next != NULL) {
        temp = temp->next;
    }
    return temp;
}

struct Node* parition(struct Node* first, struct Node* last)
{
    // Get first node of given linked list
    struct Node* pivot = first;
    struct Node* front = first;
    int temp = 0;
    while (front != NULL && front != last) {
        if (front->data < last->data) {
            pivot = first;

           
            temp = first->data;
            first->data = front->data;
            front->data = temp;

            
            first = first->next;
        }

        
        front = front->next;
    }

   
    temp = first->data;
    first->data = last->data;
    last->data = temp;
    return pivot;
}


void quick_sort(struct Node* first, struct Node* last)
{
    if (first == last) {
        return;
    }
    struct Node* pivot = parition(first, last);

    if (pivot != NULL && pivot->next != NULL) {
        quick_sort(pivot->next, last);
    }

    if (pivot != NULL && first != pivot) {
        quick_sort(first, pivot);
    }
}


int main()
{
    struct Node* head = NULL;
 int n;
    cin>>n;
    int x;
    for(int i=0;i<n;i++)
    {
      cout<<"Give Data of Node "<<i+1<<":";
      cin>>x;
      insert(&head,x);
    }
    printf("\n Before Sort ");
    display(head);

    // Function call
    quick_sort(head, last_node(head));
    printf("\n After Sort ");
    display(head);
    return 0;
}
