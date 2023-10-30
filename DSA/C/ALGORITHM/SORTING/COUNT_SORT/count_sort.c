#include <stdio.h>
#include <limits.h>
#include <stdlib.h>

void printArray(int *A, int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", A[i]);
    }
    printf("\n");
}

int maximum(int A[], int n) {
    int max = INT_MIN;
    for (int i = 0; i < n; i++) {
        if (max < A[i]) {  // Changed ">" to "<" to find the maximum element
            max = A[i];
        }
    }
    return max;
}

void countsort(int *A, int n) {
    int i, j;  // Added a comma to separate i and j
    // Find the maximum element in A
    int max = maximum(A, n);

    int *count = (int *)malloc((max + 1) * sizeof(int));

    // Initialize the array elements to 0
    for (i = 0; i <= max; i++) {  // Changed "<" to "<=" to include the maximum element
        count[i] = 0;
    }

    // Increment the corresponding index in the count array
    for (i = 0; i < n; i++) {
        count[A[i]] = count[A[i]] + 1;
    }
    i = 0;  // Counter for the count array
    j = 0;  // Counter for the given array

    while (i <= max) {
        if (count[i] > 0) {
            A[j] = i;
            count[i] = count[i] - 1;
            j++;
        } else {
            i++;
        }
    }
    free(count); // Free the dynamically allocated memory for the count array
}

int main() {
    int A[] = {5, 9, 2, 16, 11, 43, 12};
    int n = 7;
    printArray(A, n);
    countsort(A, n);
    printArray(A, n);
    return 0;
}
