package java_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by Łukasz on 2015-11-09.
 */
public class Wczytywanie_Stringow
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String line;

        while (in.ready())
        {
            line = in.readLine();
            out.println(line);
        }

        out.flush();
    }
}
