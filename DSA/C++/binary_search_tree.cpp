#include<bits/stdc++.h>
using namespace std;

struct Node{
    int data;
    struct Node* parent;
    struct Node* left;
    struct Node* right;
};
void insert(Node* root,int n)
{
    Node* x=root;
while(root!=NULL)
{
    if(root->data==n)
    {
    //cout<<root->data<<" "<<n<<endl;
    cout<<"Warning "<<n<<" is repeated"<<endl;
    break;
    }
    else if(root->data>n)
    {
        if(root->left!=NULL)
    root=root->left;
    else
    {
        Node* newnode=new Node();
        newnode->data=n;
        newnode->left=NULL;
        newnode->right=NULL;
        root->left=newnode;
        newnode->parent=root;
        root=root->left;
        return;
    }
    }
    else
   {
    if(root->right!=NULL)
    root=root->right;
    else
    {
        Node* newnode=new Node();
         newnode->data=n;
        newnode->left=NULL;
        newnode->right=NULL;
        root->right=newnode;
         newnode->parent=root;
        root=root->right;
        return;
    }
   }

}
}
Node* mini(Node* root)
{
    while(root->left!=NULL)
        root=root->left;
    return root;
}
int maxi(Node* root)
{
    while(root->right!=NULL)
        root=root->right;
    return root->data;
}
Node* succesor(Node* root,int n)
{
    
}
void delet(Node* root,int n)
{
    
while(root!=NULL)
{
   
    if(root->data==n)
    break;
    else if(root->data>n)
    root=root->left;
    else
    root=root->right;
}
if(root==NULL)
{
    cout<<"There is no element with key "<<n<<" in the BST"<<endl;
}
else
{
    if(root->left==NULL && root->right==NULL)
       {
        if(root->parent->left!=NULL)
            root->parent->left=NULL;
            else
            root->parent->right=NULL;
       }
       else if(root->left!=NULL && root->right!=NULL)
       {
         Node* temp=mini(root->right);
         swap(root->data,temp->data);
         temp->parent->left=NULL;
       }
       else
       {
        if(root->left!=NULL)
        {
            root->parent->left=root->left;
        }
        else
        {
            if(root->parent->right!=NULL)
                 root->parent->left=root->right;
                else
                {
                    if(root->right->data>root->parent->data)
                        root->parent->right=root->right;
                    else
                       root->parent->left=root->right; 
                        
                }
        }
       }
}
}

void preorder(Node* root)
{
    if(root==NULL)
    return;
    cout<<root->data<<" ";
    preorder(root->left);
    preorder(root->right);
}
void postorder(Node* root)
{
    if(root==NULL)
    return;
    
    preorder(root->left);
    cout<<root->data<<" ";
    preorder(root->right);
}
int main(){
   int n,x;
   cin>>n>>x;
   int ar[n];
   int del[x];
   for(int i=0;i<n;i++)
   cin>>ar[i];
for(int i=0;i<x;i++)
cin>>del[i];
   Node* root=new Node();
   root->data=ar[0];
   root->left=NULL;
   root->right=NULL;
   for(int i=1;i<n;i++)
    {
        insert(root,ar[i]);
    }

    preorder(root);
    cout<<endl;
    postorder(root);
    for(int i=0;i<n;i++)
    {
        delet(root,del[i]);
    }

}