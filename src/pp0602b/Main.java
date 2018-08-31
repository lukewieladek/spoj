package pp0602b;

/**
 * https://pl.spoj.com/problems/PP0602B/
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] line = bufferedReader.readLine().replaceAll("\\s+$", " ").split(" ");

        int t = Integer.parseInt(line[0]);

        for (int n = 0; n < t; n++) {

            line = bufferedReader.readLine().replaceAll("\\s+$", " ").split(" ");

            int l = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);

            String[][] number = new String[l][k];

            for (int i = 0; i < l; i++) {
                line = bufferedReader.readLine().replaceAll("\\s+$", " ").split(" ");

                for (int j = 0; j < k; j++) {

                    // pierwsza kolumna, dowolny wierz - ale nie ostatni

                    // ostatni wiersz

                    //


                    if (j == 0 && i != l - 1)
                        number[i+1][j] = line[j];
                    else if (i == l - 1)
                        number[i][j + 1] = line[j];
                    else
                        number[i][j] = line[j];


                    System.out.print(number[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}