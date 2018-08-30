package pp0602b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] line = bufferedReader.readLine().replaceAll("\\s+$", " ").split(" ");

        int t = Integer.parseInt(line[0]);

        for (int i = 0; i < t; i++) {

        }
    }
}