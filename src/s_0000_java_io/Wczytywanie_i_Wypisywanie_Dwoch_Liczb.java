package s_0000_java_io;

import java.util.Scanner;

/**
 * Created by Łukasz on 2015-09-17.
 */
public class Wczytywanie_i_Wypisywanie_Dwoch_Liczb
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.printf("%d %d\n", x, y);
        }
    }
}
