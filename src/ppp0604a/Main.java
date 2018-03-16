package ppp0604a;

import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short iloscZadan = Short.parseShort(in.readLine());

		while (iloscZadan > 0) {
			String[] strTab = in.readLine().split("\\s+"); // read all line with number and digits

            short n = Short.parseShort(strTab[0]); // number of digits

            short[] tab = new short[n];

            for (int i = 0; i < n; i++) {
                tab[i] = Short.parseShort(strTab[i + 1]);
            }

            int suma = 0;

            for (int i = 0; i < n; i++)
                suma += tab[i];

            float srednia = (float) suma / n;

            short szukana = tab[0];

            for (int i = 1; i < n; i++) {
                if (Math.abs(srednia - tab[i]) < Math.abs(srednia - szukana))
                {
                    szukana = tab[i];
                }
            }

			System.out.println(szukana);
			
			--iloscZadan;
		}
	}
}
