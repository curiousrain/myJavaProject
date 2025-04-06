package homework7.is_negative_number;

import java.util.Scanner;

public class IsNegativeNumber {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] arg){
        System.out.println("Enter a number ");
        boolean a = isNegativeNumber(sc.nextInt());
        System.out.println(a);
        sc.close();
    }

    public static boolean isNegativeNumber(int b) {
        return b < 0;
    }
}
