package sorting;

import java.util.Arrays;

public class AscendingSort {
    public static void main(String[] args) {

        int arr[] = {5, 2, 9, 1, 6};

        Arrays.sort(arr);
        System.out.println("Ascending Order:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}