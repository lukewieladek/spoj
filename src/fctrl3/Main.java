package fctrl3;

import java.io.*;

public class Main {
	
	public static long silnia(long a) {
		
		if (a == 0) return 1;
		
		long wynik = 1;
		
		for (int i = 1; i < a + 1; ++i) {
			wynik *= i;
		}
		
		return wynik;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader wejscie = new BufferedReader(new InputStreamReader(System.in));
		int iloscZadan = Integer.parseInt(wejscie.readLine());
		
		long liczba = 0;
		
		while (iloscZadan > 0) {
			
			liczba = Integer.parseInt(wejscie.readLine());
			
			if(liczba < 4) System.out.println("0 " + silnia(liczba));
			else if (liczba == 4) System.out.println("2 4");
			else if (liczba> 4 && liczba < 10) {
				liczba = silnia(liczba);
				System.out.println(((liczba%100)/10) + " " + liczba%10);
			} else if (liczba > 9) System.out.println("0 0");
			--iloscZadan;
		}
	}
}
