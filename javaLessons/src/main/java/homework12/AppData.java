package homework12;


import java.io.*;
import java.util.ArrayList;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public void saveToFile(String filePath) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < header.length; i++) {
                out.write(header[i]);
                if (i < header.length - 1) {
                    out.write(";");
                }
            }
            out.write("\n");
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    out.write(String.valueOf(data[i][j]));
                    if (j < data[i].length - 1) {
                        out.write(";");
                    }
                }
                out.write("\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static AppData readFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Read the header line
            String headerLine = reader.readLine();
            String[] header = headerLine.split(";");

            // Read the rest of the lines for the data
            String line;
            ArrayList<int[]> data = new ArrayList<>();  // Initially allocate space

            while ((line = reader.readLine()) != null) {
                String[] strValues = line.split(";");
                int[] values = new int[strValues.length];
                for (int i = 0; i < values.length; i++) {
                    String numStr = strValues[i];
                    try {
                        int value = Integer.parseInt(numStr.trim());
                        values[i] = value;
                    } catch (NumberFormatException e) {
                        System.err.println("Error parsing number: " + numStr);
                    }
                }
                data.add(values);
            }

            // Return the AppData object
            return new AppData(header, data.toArray(new int[0][]));
        }
    }
}

