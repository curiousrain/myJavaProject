package homework7.leap_year;

import java.util.Scanner;

public class LeapYear {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String [] arg) {
        System.out.println("Enter a year");
        boolean userInput = leapYear(sc.nextInt());
        System.out.println(userInput);
        sc.close();
    }

    public static boolean leapYear (int year) {
        if (year % 400 == 0) {
            return  true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}
