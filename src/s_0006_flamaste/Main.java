package s_0006_flamaste;

import java.io.*;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		short iloscZadan = Short.parseShort(JOptionPane
				.showInputDialog("Ile zadan?"));
		
		//short iloscZadan = Short.parseShort(in.readLine());

		while (iloscZadan > 0) {

			//StringBuilder wyrazCzytany = new StringBuilder(in.readLine());
			//StringBuilder wyrazPisany = new StringBuilder();
			
			String wyrazCzytany = JOptionPane
					.showInputDialog("Podaj ciag znakow:");
			StringBuilder wyrazPisany = new StringBuilder();

			int licznik = 1;

			wyrazPisany.append(wyrazCzytany.charAt(0));

			for (int i = 1; i < wyrazCzytany.length(); ++i) {
				if (wyrazCzytany.charAt(i) == wyrazCzytany.charAt(i - 1)) {
					licznik++;
					if (i == wyrazCzytany.length() - 1) {
						if (licznik > 2) {
							wyrazPisany.append(licznik);
							licznik = 1;
						} else if (licznik == 2) {
							wyrazPisany.append(wyrazCzytany.charAt(i));
							licznik = 1;
						} else {
							wyrazPisany.append(wyrazCzytany.charAt(i));
							licznik = 1;
						}
					}
				} else if (licznik > 2) {
					wyrazPisany.append(licznik);
					wyrazPisany.append(wyrazCzytany.charAt(i));
					licznik = 1;
				} else if (licznik == 2) {
					wyrazPisany.append(wyrazCzytany.charAt(i - 1));
					wyrazPisany.append(wyrazCzytany.charAt(i));
					licznik = 1;
				} else {
					wyrazPisany.append(wyrazCzytany.charAt(i));
					licznik = 1;
				}
			}

			System.out.println(wyrazPisany);

			--iloscZadan;
		}
		System.exit(0);
	}
}
