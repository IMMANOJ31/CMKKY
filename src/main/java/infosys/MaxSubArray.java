package infosys;

public class MaxSubArray {

    public static int sumOfMax(int n,int arr[]){
        int currentSum = 0;
        int maxSum = 0;
        boolean isPositive = false;

        for (int i=0;i<n;i++){
            if (arr[i] > 0){
                isPositive = true;
            }
            currentSum += arr[i];
            if (currentSum < 0){
                currentSum = 0;
            }
            maxSum = Math.max(currentSum,maxSum);
        }
        return isPositive ? maxSum : 0;
    }

    public static void main(String[] args) {
      int arr[] = {-2,-4,5,1,-1,9,4,2};
        int sum = sumOfMax(arr.length,arr);
        System.out.println(sum);
    }
}
