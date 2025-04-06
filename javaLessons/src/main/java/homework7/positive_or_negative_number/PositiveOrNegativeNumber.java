package homework7.positive_or_negative_number;

import java.util.Scanner;

public class PositiveOrNegativeNumber {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg) {
        System.out.println("Enter the number");
        positiveOrNegativeNumber(sc.nextInt());
        sc.close();

    }

    public static void positiveOrNegativeNumber(int x) {
        if (x >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
