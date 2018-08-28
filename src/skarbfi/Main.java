package skarbfi;

import java.io.*;
import static java.lang.Math.abs;

/**
 *         0 - północ
 *         1 - południe
 *         2 - zachód
 *         3 - wschód
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int x = 0;
        int y = 0;

        /** Pierwsza linia wejścia zawiera liczbę całkowitą D (1 ≤ D ≤ 50),
        *   oznaczającą liczbę zestawów danych.
        */
        int setsCount = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < setsCount; i++) {

            x = 0;
            y = 0;

            /** Pierwsza linia każdego zestawu zawiera jedną liczbę całkowitą N (0 ≤ N ≤ 100000),
            *  oznaczającą liczbę wskazówek - par określających kierunek i ilość kroków do wykonania.
            */
            int stepCount = Integer.parseInt(bufferedReader.readLine().trim());

            for (int j = 0; j < stepCount; j++) {
                String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                int direction = Integer.parseInt(arrItems[0]);
                int steps = Integer.parseInt(arrItems[1]);

                switch (direction) {
                    case 0:
                        y = y + steps;
                        break;
                    case 1:
                        y = y - steps;
                        break;
                    case 2:
                        x = x - steps;
                        break;
                    case 3:
                        x = x + steps;
                        break;
                    default:
                        break;
                }
            }

            if (x == 0 && y == 0) {
                System.out.println("studnia");
            }

            if (x == 0 && y != 0) {
                System.out.println(
                        (y > 0 ? 0 : 1) + " " + abs(y)
                );
            }

            if (x != 0 && y == 0) {
                System.out.println(
                        (x > 0 ? 3 : 2) + " " + abs(x)
                );
            }

            if (x !=0 && y != 0) {
                System.out.println(
                        (y > 0 ? 0 : 1) + " " + abs(y) + "\n" +
                                (x > 0 ? 3 : 2) + " " + abs(x)
                );
            }
        }

        bufferedReader.close();
    }
}