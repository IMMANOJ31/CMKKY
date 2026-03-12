package sorting;

public class SelectionSort {

    public static void selectionSort(int arr[]) {

        for(int i = 0; i < arr.length - 1; i++) {

            int smallest = i;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }

    public static void main(String[] args) {

        int arr[] = {5, 2, 9, 1, 6};

        selectionSort(arr);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
