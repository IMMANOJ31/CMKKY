package sorting;

public class MergeSort {

    // Merge function (same as shown in image)
    public static void merge(int arr[], int st, int mid, int end) {

        int temp[] = new int[end - st + 1];

        int i = st;        // left part
        int j = mid + 1;   // right part
        int k = 0;

        // Compare elements from left and right
        while (i <= mid && j <= end) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Remaining elements of left side
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Remaining elements of right side
        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy temp array back to original array
        for (int idx = 0; idx < temp.length; idx++) {
            arr[st + idx] = temp[idx];
        }
    }

    // Recursive Merge Sort
    public static void mergeSort(int arr[], int st, int end) {

        if (st < end) {

            int mid = st + (end - st) / 2;

            // Left part
            mergeSort(arr, st, mid);

            // Right part
            mergeSort(arr, mid + 1, end);

            // Merge both parts
            merge(arr, st, mid, end);
        }
    }

    public static void main(String[] args) {

        int arr[] = {6, 3, 9, 5, 2, 8};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
