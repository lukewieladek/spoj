package jszycer;

/**
 * https://pl.spoj.com/problems/JSZYCER/
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (bufferedReader.ready()) {

            StringBuilder text = new StringBuilder(bufferedReader.readLine());

            for (int i = 0; i < text.length(); i++) {

                if (text.charAt(i) != ' ') {
                    if (text.charAt(i) == 'X') {
                        text.setCharAt(i, 'A');
                    } else if (text.charAt(i) == 'Y') {
                        text.setCharAt(i, 'B');
                    } else if (text.charAt(i) == 'Z') {
                        text.setCharAt(i, 'C');
                    } else {
                        text.setCharAt(i, (char) (text.charAt(i) + 3));
                    }
                }
            }

            System.out.println(text);
        }
    }
}