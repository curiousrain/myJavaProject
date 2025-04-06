package homework11;

public class MainClass {
    public static void main(String[] args) {
        String[][] stringArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            checkArray(stringArray);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
        try {
            int result = convertArray(stringArray);
            System.out.println(result);
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void checkArray(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException("Array's size is not 4x4");
        }
        for (String[] subArray : array) {
            if (subArray.length != 4) {
                throw new MyArraySizeException("Array's size is not 4x4");
            }
        }
    }

    public static int convertArray(String[][] array) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String element = array[i][j];
                try {
                    sum += Integer.parseInt(element);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, element);
                }
            }
        }
        return sum;
    }
}
