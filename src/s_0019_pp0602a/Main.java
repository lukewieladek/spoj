package s_0019_pp0602a;

import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short iloscZadan = Short.parseShort(in.readLine());
		
		while (iloscZadan > 0) {
			
			String[] s = in.readLine().split(" ");
			
			StringBuilder sb_nieparzyste = new StringBuilder();
			
			for (int i = 1; i < s.length; ++i) {
				if (i % 2 == 0) {
					System.out.print(s[i] + " ");
				}
				else sb_nieparzyste.append(s[i] + " ");
			}
			
			System.out.print(sb_nieparzyste.toString() + "\n");
			
			--iloscZadan;
		}
	}
}
