package chstamps;

/**
 * https://pl.spoj.com/problems/CHSTAMPS/
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String[] line = bufferedReader.readLine().replaceAll("\\s+$", " ").split(" ");

            int number = scanner.nextInt();
            int k = scanner.nextInt();

            ArrayList<Integer> intList = new ArrayList<>();

            while (number > 0) {
                intList.add(number % 10);
                number = number / 10;
            }
            intList.add(0);

            int i = 0;
            while (i < k) {
                if (intList.get(i) <= 5) {
                    intList.set(i, 5);
                    i++;
                } else {
                    intList.set(i, 5);
                    intList.set(i + 1, intList.get(i + 1) + 1);

                    int j = i + 1;
                    while (intList.get(j) == 10) {
                        intList.set(j, 0);
                        intList.set(j + 1, intList.get(j + 1) + 1);
                        j++;
                    }
                    i++;
                }
            }

            Collections.reverse(intList);

            if (intList.get(0) == 0)
                intList.remove(0);

            for (int m : intList) {
                System.out.print(m);
            }

            System.exit(0);
        }
    }
}