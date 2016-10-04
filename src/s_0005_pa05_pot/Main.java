package s_0005_pa05_pot;

import java.io.*;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
			
		Scanner wejscie = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		short iloscZadan = wejscie.nextShort();
		
		long longA;
		long longB;
		
		while (iloscZadan > 0) {
			
			longA = wejscie.nextLong();
			longB = wejscie.nextLong();
			
			longA = longA % 10;
			long longW = longA;
			
			if (longB != 4) longB = longB % 4;
			
			for (int i = 1; i < longB; ++i) longW *= longA;
			System.out.println(longW % 10);
			
			--iloscZadan;
		}
	}
}