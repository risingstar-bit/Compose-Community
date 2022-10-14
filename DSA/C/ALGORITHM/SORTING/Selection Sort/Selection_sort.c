
#include<stdio.h>


int main()
{
    int n,i,j,min_idx;
    printf("Enter the length og array : ");
    scanf("%d",&n);
    int arr[n];
    printf("enter the data to the array ");
    for ( i = 0; i < n; i++)
    {
        scanf("%d",&arr[i]);
    }
    for ( i = 0; i < n-1; i++)
    {
        min_idx= i;
        for ( j = i+1; j < n; j++)
        {
            if (arr[min_idx]>arr[j])
            min_idx= j;
            int temp = arr[i];
            arr[i]= arr[min_idx];
            arr[min_idx]= temp;
        }        
    }
    for ( i = 0; i < n; i++)
        {
            printf("%d ",arr[i]);
        }
}