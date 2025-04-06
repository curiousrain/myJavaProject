package homework7.two_dimensional_array;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        twoDimensionalArray();
    }

    public static void twoDimensionalArray () {
        int[][] arrays = new int[5][5];
        for (int i = 0; i < arrays.length; i++) {
            arrays [i] [i] =1;
            for (int j = 0; j < arrays.length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }

}


