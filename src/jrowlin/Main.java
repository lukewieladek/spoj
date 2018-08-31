package jrowlin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://pl.spoj.com/problems/JROWLIN/
 *
 * ax + b = c
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] in = bufferedReader.readLine().replaceAll("\\s+$", " ").split(" ");

        double a = Double.parseDouble(in[0]);
        double b = Double.parseDouble(in[1]);
        double c = Double.parseDouble(in[2]);

        if (a != 0) {
            System.out.printf("%.2f",((c - b) / a));
        } else if (c - b != 0) {
            System.out.println("BR");
        } else {
            System.out.println("NWR");
        }
    }
}
