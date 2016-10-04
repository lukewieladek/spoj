package s_0002_intest;

import java.io.*;
public class MainBufferedReader {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader wejscie = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = wejscie.readLine().split(" ");
		
		int iloscZadan = Integer.parseInt(s[0]);
		int dzielnik = Integer.parseInt(s[1]);
		
		int licznik = 0;
		
		while (iloscZadan > 0) {
			int x = Integer.parseInt(wejscie.readLine());
			
			if (x % dzielnik == 0) licznik++;
			
			iloscZadan--;
		}
		
		System.out.println(licznik);
	}

}
