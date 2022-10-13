#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>

struct node
{
    int data ;
    struct node *next;
};

struct node *start=NULL;
struct node *create_ll(struct node * );
struct node *display(struct node *);
struct node *insert_at_begin(struct node *);
struct node *insert_at_end(struct node *);
struct node *insert_at_after(struct node * );
struct node *insert_at_before(struct node * );


int main()
{
    int option;
    do
    {
        printf("\n\n***MAIN MENU***");
        printf("\n 1:: CREATE THE LIST");
        printf("\n 2::  Display");
        printf("\n 3::  insert_at_begin");
        printf("\n 4::  insert_at_end");
        printf("\n 5::  insert_at_after");
        printf("\n 6::  insert_at_before");
        printf("\n 11:: Exit ");
        printf("\n Enter the option  :  ");
        scanf("%d", &option);
        switch (option)
        {       
        case 1: start = create_ll(start);
                printf("/n LINKED LIST CREATED");
                break;
        case 2: start = display(start);
                break;
        case 3: start = insert_at_begin(start);
                break;
        case 4: start = insert_at_end(start);
                break;
        case 5: start = insert_at_after(start);
                break;
        case 6: start = insert_at_before(start);
                break;
        }         
    }while (option!=11);
    return 0;
}

struct node *create_ll(struct node *start)
{
    struct node *new_node,*ptr;
    int num;
    
    printf("\n Enter -1 to stop");
    printf("\n ENTER the data :");
    scanf("%d",&num);
    while (num!=-1)
    {
        new_node= (struct node*)malloc(sizeof(struct node));
        new_node->data=num;
        if (start==NULL)
        {
            new_node->next=NULL;
            start=new_node;
        }
        else
        {
            ptr = start;
            while (ptr->next!=NULL)
            ptr=ptr->next;
            ptr->next=new_node;
            new_node->next=NULL;    
        }
        printf("Enter the data ::");
        scanf("%d",&num);
    }
    return start;
}

struct node *display(struct node *start)
{
    struct node *ptr;
    ptr = start;
    int count =0;
    while(ptr != NULL)
    {
        count = count +1;
        printf("\t%d", ptr -> data);
        ptr=ptr->next;
    }
    printf("\n NUMBER OF NODES==  %d",count);
    return start;
}


struct node *insert_at_begin(struct node *start)
{
    struct node *new_node,*ptr ;
    int val;
    printf("\n ENTER THE VAL FOR BEGIN== ");
    scanf("%d",&val);
    new_node=(struct node *)malloc(sizeof(struct node ));
    new_node->data= val;
    new_node->next= start;
    start = new_node;
    return start;   
}

struct node *insert_at_end(struct node *start)
{
    int val ;
    struct node *new_node, *ptr;
    new_node= (struct node *)malloc(sizeof(struct node));
    printf("\n ENTER THE VAL FOR INSERT IN END== ");
    scanf("%d",&val);
    ptr = start;
    new_node->data=val;
    new_node->next=NULL;
    while (ptr->next != NULL)
    {
        ptr=ptr->next;
    }
    ptr->next=new_node;
    return start;
}

struct node *insert_at_before(struct node *start)
{
    int num, val;
    struct node *new_node,*preptr,*ptr;
    printf("Enter the num ");
    scanf("%d",&num);
    printf("Enter the value after which the data has to be inserted : ");
    scanf("%d",&val);
    new_node=(struct node *)malloc(sizeof(struct node));
    new_node->data=num;
    ptr=start;
    while(ptr -> data != val);
    {
     preptr=ptr;
     ptr=ptr -> next;
    }
    preptr -> next = new_node;
    new_node -> next= ptr;
    return start;
}
struct node *insert_at_after(struct node *start)
{
    struct node *new_node, *ptr, *preptr;
    int num, val;
    printf("\n Enter the data : ");
    scanf("%d", &num);
    printf("\n Enter the value after which the data has to be inserted : ");
    scanf("%d", &val);
    new_node = (struct node *)malloc(sizeof(struct node));
    new_node -> data = num; 
    ptr = start;
    preptr = ptr;
    while(preptr -> data != val)
    {
     preptr = ptr;
     ptr = ptr -> next;
    }
    preptr -> next=new_node;
    new_node -> next = ptr;
    return start;
}
