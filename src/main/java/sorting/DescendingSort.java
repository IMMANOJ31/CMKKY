package sorting;

import java.util.Arrays;
import java.util.Collections;

public class DescendingSort {
    public static void main(String[] args) {

        Integer arr[] = {5, 2, 9, 1, 6};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Descending Order:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
