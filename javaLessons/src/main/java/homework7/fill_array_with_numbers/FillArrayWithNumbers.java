package homework7.fill_array_with_numbers;

public class FillArrayWithNumbers {
    public static void main(String[] arg) {
        fillArrayWithNumbers();
    }

    public static void fillArrayWithNumbers () {
        int[] array = new int[100];
        for (int i = 0; i < array.length;  i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }
}
