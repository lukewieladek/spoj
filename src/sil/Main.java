package sil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main (String[] args)  throws NumberFormatException, IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] tab = in.readLine().trim().split("\\s+");

        int P1x1 = Integer.parseInt(tab[0]);
        int P1y1 = Integer.parseInt(tab[1]);
        int P1x2 = Integer.parseInt(tab[2]);
        int P1y2 = Integer.parseInt(tab[3]);

        tab = in.readLine().trim().split("\\s+");

        int P2x1 = Integer.parseInt(tab[0]);
        int P2y1 = Integer.parseInt(tab[1]);
        int P2x2 = Integer.parseInt(tab[2]);
        int P2y2 = Integer.parseInt(tab[3]);

        boolean Stan = false;

        for(int i = P1x1; i <= P1x2; ++i)
        {
            for(int j = P1y1; j <= P1y2; ++j)
            {
                if( (i >= P2x1 && i <= P2x2) && (j >= P2y1 && j <= P2y2) ) {
                    Stan = true;
                }
            }
        }

        if (Stan)
        {
            int WSP = (SPX2(P1x1, P1x2, P2x1, P2x2) - SPX1(P1x1, P1x2, P2x1, P2x2))*
                    (SPY2(P1y1, P1y2, P2y1, P2y2) - SPY1(P1y1, P1y2, P2y1, P2y2));

            int Pole = ( (P1x2 - P1x1) * (P1y2 - P1y1) +
                    (P2x2 - P2x1) * (P2y2 - P2y1) - WSP );
            System.out.println(Pole);
        } else
        {
            int Pole = ( (P1x2 - P1x1) * (P1y2 - P1y1) +
                    (P2x2 - P2x1) * (P2y2 - P2y1) );
            System.out.println(Pole);
        }
    }

    private static int SPX1(int P1x1, int P1x2, int P2x1, int P2x2)
    {
        for(int i = P1x1; i <= P1x2; ++i)
        {
            if ( i >= P2x1 && i <= P2x2 ) return i;
        }
        return 0;
    }

    private static int SPX2(int P1x1, int P1x2, int P2x1, int P2x2)
    {
        for (int i = P1x2; i >= P1x1; --i)
        {
            if ( i >= P2x1 && i <= P2x2 ) return i;
        }
        return 0;
    }

    private static int SPY1(int P1y1, int P1y2, int P2y1, int P2y2)
    {
        for (int j = P1y1; j <= P1y2; ++j)
        {
            if ( j >= P2y1 && j <= P2y2 ) return j;
        }
        return 0;
    }

    private static int SPY2(int P1y1, int P1y2, int P2y1, int P2y2)
    {
        for (int j = P1y2; j >= P1y1; --j)
        {
            if ( j >= P2y1 && j <= P2y2 ) return j;
        }
        return 0;
    }
}
