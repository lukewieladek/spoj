package s_0028_pp0504d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short iloscZadan = Short.parseShort(in.readLine());
		
		while (iloscZadan > 0) {
			
			float liczba = Float.parseFloat(in.readLine().trim());
			
			System.out.println("" + Float.toHexString(liczba));	
			iloscZadan--;
		}
		System.exit(0);
	}
}
