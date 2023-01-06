// Print an array Ascending order using Insertion Sort
public class ascendindOrderInsertionSort {

     public static void sortInsertion(int[] n) {

        for (int i = 0; i < n.length; ++i) {

            int j = i;

            while (j > 0 && n[j - 1] > n[j]) {

                int key = n[j];
                n[j] = n[j - 1];
                n[j - 1] = key;
                j = j - 1;

            }
        }
    }

    public static void main(String args[]) {
        int[] arr = { 5, 2, 12, 12, 1 };
        sortInsertion(arr);

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
