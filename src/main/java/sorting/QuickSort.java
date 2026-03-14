package sorting;

public class QuickSort {

    // Quick Sort Function
    public static void quickSort(int arr[], int st, int end) {

        if (st < end) {

            int pivIdx = partition(arr, st, end);

            // Left part
            quickSort(arr, st, pivIdx - 1);

            // Right part
            quickSort(arr, pivIdx + 1, end);
        }
    }

    // Partition Function
    public static int partition(int arr[], int st, int end) {

        int pivot = arr[end];     // pivot element
        int idx = st - 1;

        for (int j = st; j < end; j++) {

            if (arr[j] <= pivot) {
                idx++;

                // swap arr[j] and arr[idx]
                int temp = arr[j];
                arr[j] = arr[idx];
                arr[idx] = temp;
            }
        }

        idx++;

        // place pivot at correct position
        int temp = arr[end];
        arr[end] = arr[idx];
        arr[idx] = temp;

        return idx;
    }

    public static void main(String[] args) {

        int arr[] = {6, 3, 9, 8, 2, 5};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
