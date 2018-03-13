package fr_08_02;

import java.io.*;
import java.lang.*;

class MainFaster
{
    public static void main (String[] args) throws java.lang.Exception
    {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String output = "";

        short iloscZadan = Short.parseShort(in.readLine());

        while (iloscZadan > 0)
        {
            String[] strTab = in.readLine().trim().split("\\s+");

            output += Integer.toString((Integer.parseInt(strTab[0]) + Integer.parseInt(strTab[1])) * 2 - Integer.parseInt(strTab[0]) - Integer.parseInt(strTab[2]) - Integer.parseInt(strTab[4]))
            + " " +
                    Integer.toString((Integer.parseInt(strTab[0]) + Integer.parseInt(strTab[1])) * 2 - Integer.parseInt(strTab[1]) - Integer.parseInt(strTab[3]) - Integer.parseInt(strTab[5]))
            + "\n";

            --iloscZadan;
        }

        System.out.println(output);

        System.exit(0);
    }
}