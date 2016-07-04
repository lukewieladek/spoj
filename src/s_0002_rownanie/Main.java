package s_0002_rownanie;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Łukasz on 2015-11-16.
 * <p>
 * http://pl.spoj.com/problems/ROWNANIE/
 */
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter printWriter = new PrintWriter(System.out);
        Scanner scanner;
        while (bufferedReader.ready())
        {
            scanner = new Scanner(bufferedReader.readLine());
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double delta = b * b - 4 * a * c;
            if (delta > 0.0)
                System.out.println("2");
            else if (delta < 0.0)
                System.out.println("0");
            else
                System.out.println("1");
        }
        printWriter.flush();
    }
}
