package s_0000_java_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by �ukasz on 2015-09-17.
 */
public class Wczytywanie_Dwoch_Liczb_Rozdzielonych_Spacjami
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter printWriter = new PrintWriter(System.out);
        String line;
        int a, b;
        while (bufferedReader.ready())
        {
            line = bufferedReader.readLine();
            String[] stringTab = line.split(" ");
            a = Integer.parseInt(stringTab[0]);
            b = Integer.parseInt(stringTab[1]);
            printWriter.println(a + b);
        }
        printWriter.flush();
    }
}
