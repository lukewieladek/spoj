package nwd;

import java.io.*;

public class Main {
	
	public static int nwd(int a, int b) {
		int c = 0;
		while (b != 0) {
			c = a % b;
			a = b;
			b = c;
		}
		return a;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader wejscie = new BufferedReader(new InputStreamReader(System.in));
		int iloscZadan = Integer.parseInt(wejscie.readLine());
		
		while (iloscZadan > 0) {
			String[] s = wejscie.readLine().split(" ");
			int pierwsza = Integer.parseInt(s[0]);
			int druga = Integer.parseInt(s[1]);
			System.out.println(nwd(pierwsza, druga));
			iloscZadan--;
		}
	}

}
