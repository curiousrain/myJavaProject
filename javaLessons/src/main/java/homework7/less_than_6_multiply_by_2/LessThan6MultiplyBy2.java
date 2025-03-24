package homework7.less_than_6_multiply_by_2;

public class LessThan6MultiplyBy2 {
    public static void main (String[] arg) {
        lessThan6MultiplyBy2();
    }

    public static void lessThan6MultiplyBy2 () {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array [i] < 6) {
                array [i] *=2;
            }
            System.out.println(array[i]);
        }
    }
}
