package homework7.repeat_string;

import java.util.Scanner;

public class RepeatString {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] arg){
        System.out.println("Enter a string and number");
        repeatString(sc.next(), sc.nextInt());
        sc.close();
    }

    public static void repeatString (String a, int b) {
        for (int i =1; i <=b; i++) {
            System.out.println(a);
        }
    }
}