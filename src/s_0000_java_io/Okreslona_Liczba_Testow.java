package s_0000_java_io;

import java.util.Scanner;

/**
 * Created by £ukasz on 2015-09-17.
 */
public class Okreslona_Liczba_Testow
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0)
        {
            int x = scanner.nextInt();
            System.out.println(x);
            t--;
        }
    }
}
