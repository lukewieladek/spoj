package s_0008_rno_dod;

import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short liczbaTestow = Short.parseShort(in.readLine());
		
		while (liczbaTestow > 0) {
			
			int liczbaLiczb = Integer.parseInt(in.readLine());
			String[] s = in.readLine().split(" ");
			int suma = 0;
			
			for (int i = 0; i < liczbaLiczb; ++i) {
				suma += Integer.parseInt(s[i]);
			}
			System.out.println(suma);
			--liczbaTestow;
		}
	}
}