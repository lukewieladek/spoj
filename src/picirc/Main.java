package picirc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] tab = in.readLine().trim().split("\\s+");

        int x = Integer.parseInt(tab[0]);
        int y = Integer.parseInt(tab[1]);
        int r = Integer.parseInt(tab[2]);

        r = r * r;

        tab = in.readLine().trim().split("\\s+");
        int n = Integer.parseInt(tab[0]);

        while (in.ready())
        {
            tab = in.readLine().trim().split("\\s+");
            int a = Integer.parseInt(tab[0]);
            int b = Integer.parseInt(tab[1]);

            double promien = (x - a) * (x - a) + (y - b) * ( y - b);

            if (promien == r)
                System.out.println("E");
            else if (promien < r)
                System.out.println("I");
            else if (promien > r)
                System.out.println("O");
        }

        System.exit(0);
    }
}
