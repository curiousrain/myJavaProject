package homework12;

import java.io.IOException;

public class CSVFile {
    public static void main(String[] args) throws IOException {
        AppData appData = new AppData(new String[]{"Value 1", "Value 2", "Value 3"}, new int[][]{{100, 200, 123},
                {300, 400, 500}});
        appData.saveToFile("C:\\Users\\nonea\\Desktop\\test\\text.csv");
        AppData newAppData = AppData.readFile("C:\\Users\\nonea\\Desktop\\test\\text.csv");

        for (String h : newAppData.getHeader()) {
            System.out.print(h);
            System.out.print(';');
        }

        System.out.print('\n');

        for (int[] row : newAppData.getData()) {
            for (int c : row) {
                System.out.print(c);
                System.out.print(';');
            }
            System.out.print('\n');
        }
    }
}
