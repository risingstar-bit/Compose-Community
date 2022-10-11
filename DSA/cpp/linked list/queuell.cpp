#include<iostream>
using namespace std;

class node
{
    public:
    int data;
    int key;
    node *next;

    node(int data,int key)
    {
        this->data;
        this->key;
        next=NULL;
    }
};
class queue
{
    public:
    node* front;
    node* rear;

    queue()
    {
        front=NULL;
        rear=NULL;
    }
    bool isEmpty()
    {
        if(front==NULL && rear==NULL)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    bool nodeExists(node* check)
    {
        node* temp=front;
        while(temp!=NULL)
        {
            if(temp->key==check->key)
            {
                return true;
            }
            temp=temp->next;
        }
        return false;
    }
    void enque(int data,int key)
    {
        node* temp=new node(data,key);
        if(isEmpty())
        {
            front=temp;
            rear=temp;
            return;
        }
        else if(nodeExists(temp))
        {
            cout<<"node already existss"<<endl;
        }
        else
        {
            rear->next=temp;
            temp=rear;
        }
    }
    void deque()
    {
        if(isEmpty())
        {
            cout<<"queue underflow"<<endl;
        }
        else{
            node* temp=front;
            front=front->next;
            if(front==NULL)
            {
                rear=NULL;
            }
             delete temp;
        }
    }
    void print()
    {
        if(isEmpty())
        {
            cout<<"empty queeuq"<<endl;
        }
        node* temp=front;
        while(temp != NULL)
        {
            cout<<temp->data<<" ";
            temp=temp->next;
        }
        cout<<endl;
    }
};

int main()
{
    queue q;
    int data,key,n;
    do
    {
        cout<<"enetr 1 to enque"<<endl;
        cout<<"enter 2 to deque"<<endl;
        cout<<"enter 3 to print"<<endl;
        cout<<"emter 0 to exit"<<endl;
        cin>>n;
        switch(n)
        {
            case 1:
               cout<<"emetr data"<<endl;;
               cin>>data;
               cout<<"eneter key"<<endl;
               cin>>key;
               q.enque(data,key);
               break;

            case 2:
                q.deque();
                break;

            case 3:
               q.print();
               break;

            default:
               exit(0);
               break;
        }

    } while (n != 0);
    return 0;
}