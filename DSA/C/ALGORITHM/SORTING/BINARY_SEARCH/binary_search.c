#include <stdio.h>

int binarySearch(int arr[], int size, int element) {
    int low, mid, high;
    low = 0;
    high = size - 1;
    // Keep searching until low <= high
    while (low <= high) {
        mid = (low + high) / 2;
        if (arr[mid] == element) {
            return mid;
        }
        if (arr[mid] < element) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1;
}

int main() {
    int arr[] = {1, 3, 5, 9, 23, 29, 56, 500};
    int size = sizeof(arr) / sizeof(int);
    int element = 5; // Declare and initialize the element to search for
    int searchIndex = binarySearch(arr, size, element); // Call the correct function
    if (searchIndex != -1) {
        printf("The element %d was found at index %d\n", element, searchIndex);
    } else {
        printf("The element %d was not found in the array.\n", element);
    }

    return 0;
}