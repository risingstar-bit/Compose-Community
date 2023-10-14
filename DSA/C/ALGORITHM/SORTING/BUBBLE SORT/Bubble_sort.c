// This is bubble sort algorithm
#include<stdio.h>
#include<conio.h>
void main ()
{
    int i,n,a[100],item,temp,j;
    printf("enter the order the element ");
    scanf("%d", &n);
    printf("enter the element ");
    for (i=0;i<n;i++)
    {
      scanf("%d", &a[i]);
    }
     for(i=0;i<n;i++)
     {
         for(j=0;j<n-1;j++)
         {
             if(a[j]>a[j+1])
              {
              temp=a[j+1];
              a[j+1]=a[j];
              a[j]=temp;
              }
         }

     }
      for (i=0;i<n;i++)
    {
      printf("%d\t", a[i]);
    }
  
}
