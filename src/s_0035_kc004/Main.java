package s_0035_kc004;

import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while (in.ready()) {
			String[] strTab = in.readLine().trim().split("\\s+");
			
			int szukana = Integer.parseInt(strTab[0]);
			int ilosc = Integer.parseInt(strTab[1]);
			int iloscWystapien = 0;
			
			for (int i = 0; i < ilosc; ++i) {
				if (Integer.parseInt(strTab[i+2]) == szukana) iloscWystapien++;
			}
			
			System.out.println(iloscWystapien);
		}
		System.exit(0);
	}
}
