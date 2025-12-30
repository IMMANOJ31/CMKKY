package infosys;

import java.util.Scanner;
import java.util.SortedMap;

public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month: ");
        int month = sc.nextInt();

        if (month < 1 || month > 12){
            System.out.println("Invalid month");
        }else {
            if (month <= 3 && month >= 5){
                System.out.println("Season: Spring");
            } else if (month <= 6 && month >= 7) {
                System.out.println("Season: Summer");
            } else if (month <= 8 && month >= 11) {
                System.out.println("Season: Autumn");
            }else System.out.println("Season: Winter");
        }
    }
}
