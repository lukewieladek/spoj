package s_0033_pol;

import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short iloscZadan = Short.parseShort(in.readLine());
		
		
		while (iloscZadan > 0) {
			String ciag = in.readLine();
			
			ciag = ciag.substring(0, ciag.length() / 2);
			
			System.out.println(ciag);
			--iloscZadan;
		}
		
		System.exit(0);
	}
}
