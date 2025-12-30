package infosys;

import java.util.Arrays;
import java.util.Scanner;

public class DataDouble {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no");
        int n = scanner.nextInt();
        int[] playList = new int[n];
        System.out.println("Enter song as number");
        for (int i=0; i<n; i++){
            playList[i] = scanner.nextInt();
        }

        int[] loop = new int[2*n];
        for(int i=0; i<2*n; i++){
            loop[i] = playList[i%n];
        }
        System.out.println(Arrays.toString(loop));

    }
}
