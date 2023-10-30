#include <stdio.h>

void printArray(int *A, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", A[i]);
    }
    printf("\n");
}

int partition(int a[], int low, int high)
{
    int pivot = a[low];
    int i = low + 1;
    int j = high;
    int temp;

    do
    {
        while (a[i] <= pivot)
        {
            i++;
        }

        while (a[j] > pivot)
        {
            j--;
        }

        if (i < j)
        {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

    } while (i < j);

    // Swap a[low] and a[j]
    temp = a[low];
    a[low] = a[j];
    a[j] = temp;
    return j;
}

void quicksort(int A[], int low, int high)
{
    int partitionIndex; // Index of pivot after partition

    if (low < high)
    {
        partitionIndex = partition(A, low, high);
        quicksort(A, low, partitionIndex - 1);  // sort left subarray
        quicksort(A, partitionIndex + 1, high); // sort right subarray
    }
}

int main()
{
    int A[] = {5, 9, 2, 16, 11, 43, 12};
    int n = 7;
    printArray(A, n);
    quicksort(A, 0, n - 1);
    printArray(A, n);

    return 0;
}