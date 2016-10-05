package vsr;

import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short iloscZadan = Short.parseShort(in.readLine());
		
		
		while (iloscZadan > 0) {
			String[] strTab = in.readLine().split("\\s+");
			
			int v1 = Integer.parseInt(strTab[0]);
			int v2 = Integer.parseInt(strTab[1]);
			
			int wynik = 0;
			
			wynik = 2 * (v1 * v2) / (v1 + v2);
			
			System.out.println(wynik);
			--iloscZadan;
		}
		
		System.exit(0);
	}
}
