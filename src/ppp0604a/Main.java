package ppp0604a;

import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short iloscZadan = Short.parseShort(in.readLine());
		
		
		while (iloscZadan > 0) {
			String[] strTab = in.readLine().split("\\s+");
			
			short n = (short)strTab.length;
			
			short[] tab = new short[n];
			
			int suma = 0;
			
			for (short i = 0; i < n; ++i) {
				tab[i] = Short.parseShort(strTab[i]);
				suma += tab[i];
			}
			
			float srednia = (float)suma / n;
			
			short szukana = tab[0];

			for (short i = 1; i < n; ++i) {
				if (szukana == srednia) break;
				if (Math.abs(srednia - tab[i]) < Math.abs(srednia - szukana))
					if (Math.abs(szukana - srednia) != Math.abs(tab[i] - srednia))
						if (Math.abs(szukana - srednia) > 1 && Math.abs(szukana - srednia) > 1)
							szukana = tab[i];
			}
			
			System.out.println(szukana);
			
			--iloscZadan;
		}
		
		System.exit(0);
	}
}
