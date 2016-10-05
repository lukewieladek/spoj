package pa05_pot;

import java.io.*;
import java.util.Scanner;

public class SIL {

	public static void main(String[] args) throws NumberFormatException, IOException {
			
		Scanner wejscie = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		short iloscZadan = wejscie.nextShort();
		
		long a;
		long b;
		
		while (iloscZadan > 0) {
			
			a = wejscie.nextLong();
			b = wejscie.nextLong();
			
			int cyfra;
			int wynik = 0;
			
			cyfra = (int)(a % 10);
			
			switch (cyfra) {
				case 0: wynik = 0; break;
				case 1: wynik = 1; break;
				case 2: {
					int help = (int)(b % 4);
					switch (help) {
						case 0: wynik = 6; break;
						case 1: wynik = 2; break;
						case 2: wynik = 4; break;
						case 3: wynik = 8; break;
					}
				} break;
				case 3: {
					int help = (int)(b % 4);
					switch (help) {
					case 0: wynik = 1; break;
					case 1: wynik = 3; break;
					case 2: wynik = 9; break;
					case 3: wynik = 7; break;
					}
				} break;
				case 4: {
					if (b % 2 == 1) wynik = 4;
					else wynik = 6;
				} break;
				case 5: wynik = 5; break;
				case 6: wynik = 6; break;
				case 7: {
					int help = (int)(b % 4);
					switch (help) {
					case 0: wynik = 1; break;
					case 1: wynik = 7; break;
					case 2: wynik = 9; break;
					case 3: wynik = 3; break;
					}
				} break;
				case 8: {
					int help = (int)(b % 4);
					switch (help) {
					case 0: wynik = 6; break;
					case 1: wynik = 8; break;
					case 2: wynik = 4; break;
					case 3: wynik = 2; break;
					}
				} break;
				case 9: {
					if(b%2==1) wynik=9;
					else wynik=1;
				} break;
			}
			
			System.out.println(wynik);
			
			--iloscZadan;
		}
	}
}