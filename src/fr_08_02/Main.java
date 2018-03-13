package fr_08_02;

import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0)
        {
            int z1 = scanner.nextInt();
            int p1 = scanner.nextInt();

            int z2 = scanner.nextInt();
            int p2 = scanner.nextInt();

            int z3 = scanner.nextInt();
            int p3 = scanner.nextInt();

            int numberOfGames = (z1 + p1) * 2;

            int z4 = numberOfGames - z1 - z2 - z3;
            int p4 = numberOfGames - p1 - p2 - p3;

            System.out.println(z4 + " " + p4);

            t--;
        }
    }
}