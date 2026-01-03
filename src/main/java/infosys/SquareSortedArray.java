package infosys;

import java.util.Arrays;

public class SquareSortedArray {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0, right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[pos--] = leftSq;
                left++;
            } else {
                result[pos--] = rightSq;
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = {-1,5,2,0,5};
        System.out.println(Arrays.toString(sortedSquares(ints)));
    }
}

