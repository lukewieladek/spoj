package s_0007_przedszk;

import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short iloscZadan = Short.parseShort(in.readLine());
		
		while (iloscZadan > 0) {
			String[] s = in.readLine().split(" ");
			int pierwsza = Integer.parseInt(s[0]);
			int druga = Integer.parseInt(s[1]);
			System.out.println(NWW(pierwsza, druga));
			--iloscZadan;
		}
	}
	
	public static int NWW(int a, int b) {
		int c = 0;
		c = (a * b) / NWD(a,b);
		return c;
	}
	
	public static int NWD(int a, int b) {
		int c = 0;
		while (b != 0) {
			c = a % b;
			a = b;
			b = c;
		}
		return a;
	}
}
