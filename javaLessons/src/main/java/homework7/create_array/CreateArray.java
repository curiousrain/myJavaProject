package homework7.create_array;

import java.util.Scanner;

public class CreateArray {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a two numbers ");
        int[] a= createArray(sc.nextInt(), sc.nextInt());
        for (int i =0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        sc.close();
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i =0; i < arr.length; i++) {
            arr [i] = initialValue;
        }
        return arr;
    }
}
