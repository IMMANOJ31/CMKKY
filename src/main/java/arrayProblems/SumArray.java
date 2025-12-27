package arrayProblems;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scanner.nextInt();
        int a[] = new int[n];
        int sum = 0;
        System.out.println("Enter "+n+" array elements");
        for (int i=0; i<n;i++){
            a[i] = scanner.nextInt();
            sum+=a[i];
        }
        System.err.println("Sum: "+sum);
    }
}
