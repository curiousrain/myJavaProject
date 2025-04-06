package homework7.swap_zero_one;

public class SwapZeroOne {
    public static void main(String [] arg) {
        swapZeroOne();
    }

    public static void swapZeroOne () {
        int[] array = {0, 1, 0, 1, 0, 1, 0, 1, 0};
        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            if (x==0) {
                array[i] =1;
            }
            else if (x ==1) {
                array[i] = 0;
            }
            System.out.println(array[i]);
        }
    }

}
