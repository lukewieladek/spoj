package jwsplin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] line = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int t = Integer.parseInt(line[0]);

        for (int i = 0; i < t; i++){
            String[] numbers = bufferedReader.readLine().replaceAll("\\t", " ").split(" ");

            int x1, y1, x2, y2, x3, y3;

            x1 = Integer.parseInt(numbers[0]);
            y1 = Integer.parseInt(numbers[1]);
            x2 = Integer.parseInt(numbers[2]);
            y2 = Integer.parseInt(numbers[3]);
            x3 = Integer.parseInt(numbers[4]);
            y3 = Integer.parseInt(numbers[5]);

            int det = 0;

            det = (x1 * y2 * 1) + (y1 * 1 * x3) + (1 * x2 * y3) - ( (1 * y2 * x3) + (x1 * 1 * y3) + (y1 * x2 * 1) );

            if (det == 0)
                System.out.println("TAK");
            else
                System.out.println("NIE");
        }
    }
}
