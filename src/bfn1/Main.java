package bfn1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Łukasz on 2015-09-17.
 * http://pl.spoj.com/problems/BFN1/
 */
public class Main
{
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        short numberOfTest = Short.parseShort(in.readLine());

        while (numberOfTest > 0)
        {
            int n = 0;
            int suma = 0;
            String line = in.readLine().trim();

            getPalindrom(line, n, suma);

            numberOfTest--;
        }
    }

    public static void getPalindrom(String line, int n, int suma)
    {
        StringBuilder number = new StringBuilder(line);
        String reverseNumber = number.reverse().toString();


        if (!line.equals(reverseNumber))
        {
            int first = Integer.parseInt(line);
            int second = Integer.parseInt(reverseNumber);
            suma = first + second;
            n++;
            getPalindrom(suma + "", n, suma);

        } else
        {
            if (n == 0)
            {
                System.out.println(line + " " + n);
                return;
            } else
            {
                System.out.println(suma + " " + n);
                return;
            }
        }
        return;
    }
}
