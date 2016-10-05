package glutton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short iloscZadan = Short.parseShort(in.readLine());
		
		while (iloscZadan > 0) {
			
			String[] strTab = in.readLine().trim().split("\\s+");
			int n = Integer.parseInt(strTab[0]);
			int m = Integer.parseInt(strTab[1]);
			
			int liczbaZjedzonychCiastek = 0;
			
			for (int i = 0; i < n; ++i) {
				liczbaZjedzonychCiastek += 86400 / Integer.parseInt(in.readLine());
			}
			
			int liczbaPudelek = liczbaZjedzonychCiastek / m;
			
			if (liczbaPudelek * m < liczbaZjedzonychCiastek) liczbaPudelek++;
			
			System.out.println(liczbaPudelek);
			iloscZadan--;
		}
		System.exit(0);
	}
}
