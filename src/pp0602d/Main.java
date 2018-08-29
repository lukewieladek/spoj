package pp0602d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);

        String[] numbers = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int przesuniecie = k % n;

        System.out.println("Przesuniecie " + przesuniecie);
    }
}
