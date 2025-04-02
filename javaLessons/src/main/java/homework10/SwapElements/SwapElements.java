package homework10.SwapElements;

public class SwapElements {
    public static void main(String[] arg) {
        String[] arr = {"1", "2", "3", "4", "5"};
        swapElements(arr, 1, 4);
        for (String a : arr) {
            System.out.println(a);
        }

    }

    public static <T extends Object> void swapElements(T[] array, int a, int b) {
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}

