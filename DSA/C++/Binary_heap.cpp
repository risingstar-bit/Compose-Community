#include<bits/stdc++.h> 
using namespace std; 


struct node{ 
    int data;
    struct node* parent;
    struct node* left; 
    struct node* right;  
};
node* root;

int heap_size=0;

node* newNode(int key)
{
    node* nd = new node;
    nd->data = key;
    nd->left = NULL;
    nd->right = NULL; 
    return(nd);
}

struct node * left(node* root, int key){
    struct node * lc= newNode(key);
    root->left = lc;
    lc->parent = root;
    return lc;
}

// function for right child
struct node * right(node* root, int key){
    struct node * rc =newNode(key);
    root->right = rc;
   rc->parent = root;
    return rc;
}


/* Insert function for heap*/
void insert(node* root, int key){
    node* prev = NULL;
    while(root!=NULL){
        prev = root;
        if(root->data == key){
            cout<<"Cannot insert! "<<key<<" is already there in a tree"<<endl;
        }
        if(root->left!=NULL && root->right!=NULL){
            if(root->left->left == NULL || root->left->right == NULL) root = root->left;
            else if(root->right->left != NULL && root->right->right != NULL) root = root->left;
            else root = root->right;
        }
        else if(root->right == NULL && root->left == NULL) root = root->left;
        else root = root->right; 
    }
    
    node * n = NULL;
    if(prev->left == NULL) prev->left = left(prev, key);
    else prev->right = right(prev, key);
}




void maxheapify(node* root,node* prev)
{
    if(root==NULL) return ;           

    maxheapify(root->left,root);
    maxheapify(root->right,root);

    if(prev != NULL && root->data > prev->data) 
    swap(root->data,prev->data);
}


void convert_to_Heap_max(struct node* root)
{    
    if(root == NULL) return;

    maxheapify(root,NULL);
    convert_to_Heap_max(root->left); 
    convert_to_Heap_max(root->right);
}


/* parent of i*/ 
int parent(int i)
{
  return (i-1)/2;
} 

/* left child of i*/
int lc(int i)
{
return 2*i+1;
}


/* Right  child of i*/
int  rc(int i)
{
  return 2*i+2;
}

/* Insert function for heap*/
void insert(vector<int> &v,int k)
{
  v.push_back(k);
  int i=v.size()-1;
  while(i>=0)
  {
    int x;
    int p=parent(i);
    if(v[lc(p)]<v[rc(p)] && lc(p)<v.size())
      x=lc(p);
    if(v[lc(p)]>v[rc(p)] && rc(p)<v.size())
      x=rc(p);
    if(v[p]>v[x])
      swap(v[x],v[p]);
    if(i==0)
      i=-1;
    else
    i=p;
  }
}

/* heapify method  */
void minheapify(vector<int> &v,int i)
{
  
  int l = lc(i);
    int r = rc(i);
    int smallest = i;
    int heap_size=v.size();
    if (l < heap_size && v[l] < v[smallest])
        smallest = l;
    if (r < heap_size && v[r] < v[smallest])
        smallest = r;
    if (smallest != i)
    {
        swap(v[i], v[smallest]);
        minheapify(v,smallest);
    }
}

/* heap sort*/
void heap_sort(vector<int> v)
{
  if(v.size()==0)
    return;
  
  vector<int> u=v;
  cout<<u[0]<<" ";
  swap(u[0],u[u.size()-1]);
  u.pop_back();
  minheapify(u,0);

heap_sort(u);
}




 /* printing the heap*/
void display_vector(vector<int> &v)
{
  for(int i=0;i<v.size();i++)
    cout<<v[i]<<" ";
  cout<<endl;
  
}



void inorder(node* root)
{
    if(root==NULL)
    return;
   
   inorder(root->left);
     cout<<root->data<<" ";
    inorder(root->right);
}

int main()
{
	int n;
	cout<<"enter the number of elements in heap:  "<<endl;
	cin>>n;
	int ar[n];
	 vector<int> v;
	for(int i=0;i<n;i++)
	{
		cin>>ar[i];
		v.push_back(ar[i]);
	}
	 for(int i=v.size()/2;i>=0;i--)
  {
    minheapify(v,i);
  }
  heap_sort(v);
	node* root=newNode(ar[0]);
   for(int i=1;i<n;i++)
    {
        insert(root,ar[i]);
    }
	
	cout<<endl;
	inorder(root);
	cout<<endl;
	
	convert_to_Heap_max(root);
	
	inorder(root);
	cout<<endl;
	display_vector(v);
	cout<<endl;
	
}