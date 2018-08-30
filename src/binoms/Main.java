package binoms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] line = bufferedReader.readLine().replaceAll("\\s+$", " ").split(" ");

        int t = Integer.parseInt(line[0]);

        for (int i = 0; i < t; i++) {
            line = bufferedReader.readLine().replaceAll("\\s+$", " ").split(" ");

            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);

            if (k == 0 || n == k)
                System.out.println("1");
            else
                System.out.println(newton(n, k));
        }
    }

    private static long newton(int n, int k) {

        int result = 1;

        for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i;
        }

        return result;
    }
}