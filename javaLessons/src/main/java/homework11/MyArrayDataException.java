package homework11;

public class MyArrayDataException extends Exception {
    private final int row;
    private final int column;
    private final String data;
    public MyArrayDataException(int row, int column, String data ) {
        super(String.format("Invalid data %s at row %d and column %d", data, row, column));
        this.row = row;
        this.column = column;
        this.data = data;
    }
}
