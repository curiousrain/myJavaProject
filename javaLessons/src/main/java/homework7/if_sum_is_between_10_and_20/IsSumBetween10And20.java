package homework7.if_sum_is_between_10_and_20;

import java.util.Scanner;

public class IsSumBetween10And20 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a two numbers ");
        boolean a = isSumBetween10And20(sc.nextInt(), sc.nextInt());
        System.out.println(a);
        sc.close();
    }

    public static boolean isSumBetween10And20( int x, int y) {
        int sum = x + y;
        return sum >= 10 && sum <= 20;
    }

}

