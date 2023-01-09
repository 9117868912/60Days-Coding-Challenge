//implement a binary search algorithm recursively

public class BinarySearch {
    int binarySearch(int arr[], int l, int h, int x) {
        if (h >= l) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, h, x);
        }
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 20, 30, 40, 10, 50 };
        int n = arr.length;
        int x = 40;
        int res = ob.binarySearch(arr, 0, n - 1, x);
        if (res == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + res);
    }
}
