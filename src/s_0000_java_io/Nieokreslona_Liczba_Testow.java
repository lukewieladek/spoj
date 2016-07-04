package s_0000_java_io;

import java.util.Scanner;

/**
 * Created by Łukasz on 2015-09-17.
 */
public class Nieokreslona_Liczba_Testow
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            int x = scanner.nextInt();
            System.out.println(x);
        }
    }
}
