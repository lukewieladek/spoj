package s_0015_wsega;

import java.io.*;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		short iloscZadan = Short.parseShort(in.readLine());
	
		while (iloscZadan > 0) {
			
			Scanner sc = new Scanner(in.readLine());
			
			int suma = 0;
			
			while (sc.hasNextInt()) {
				suma = suma + sc.nextInt();
			}
			
			System.out.println(suma -1);
			sc.close();
			
			--iloscZadan;
		}
	}
}
