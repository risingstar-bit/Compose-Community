public class firstocc_lastocc {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 2, 2, 2, 4, 5, 6, 7 };
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int ele = 2;
        int res = 0;
        int res2 = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == ele) {
                end = mid - 1;
                res = mid;
            }
            if (arr[mid] > ele) {
                end = mid - 1;
            }
            if (arr[mid] < ele) {
                start = mid + 1;
            }

        }
        start = 0;
        end = arr.length - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == ele) {
                start = mid + 1;
                res2 = mid;
            }
            if (arr[mid] > ele) {
                end = mid - 1;
            }
            if (arr[mid] < ele) {
                start = mid + 1;
            }

        }
        System.out.println(res);
        System.out.println(res2);
    }
}
