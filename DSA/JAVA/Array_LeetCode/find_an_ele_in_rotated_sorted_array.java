//Here an array is sorted but it is rotated and we have to find an element from that array 
public class find_an_ele_in_rotated_sorted_array {
    static int binary_search(int arr[], int s, int e, int res) {
        int res1 = 0;
        int mid = 0;
        while (s <= e) {
            mid = (s + e) / 2;
            if (arr[mid] == res) {
                res1 = mid;
                break;
            }
            if (arr[mid] > res) {
                e = mid - 1;

            }
            if (arr[mid] < res) {
                s = mid + 1;
            }

        }
        if (res1 == 0) {
            res1 = -1;
        }
        return res1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 11, 12, 15, 18, 2, 3, 4 };
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int res = 0;
        int res2 = 0;
        int s = 0;
        int prev = 0;
        int next = 0;
        int N = arr.length;
        while (start <= end) {
            mid = (start + end) / 2;
            next = (mid + 1) % N;
            prev = (mid + N - 1) % N;
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                s = mid;
                break;

            }
            if (arr[mid] <= arr[end]) {
                end = mid - 1;
            }
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            }

        }
        System.out.println(s);
        res = binary_search(arr, start, s - 1, 3);
        res2 = binary_search(arr, s, end, 3);
        System.out.println(res);
        System.out.println(res2);

    }
}
