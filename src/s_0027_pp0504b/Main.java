package s_0027_pp0504b;

import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short iloscZadan = Short.parseShort(in.readLine());
		StringBuilder out;
		
		while (iloscZadan > 0) {
			out = new StringBuilder();
			String[] strTab = in.readLine().split("\\s+");
			
			int n = 0;
			n = strTab[0].length() < strTab[1].length() ? strTab[0].length() : strTab[1].length();
			
			for (int i = 0; i < n; i++) {
				out.append( "" + strTab[0].charAt(i) + strTab[1].charAt(i));
			}
			
			System.out.println(out.toString());
			
			iloscZadan--;
		}

		System.exit(0);
	}
}
