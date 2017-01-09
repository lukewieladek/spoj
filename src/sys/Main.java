package sys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static StringBuilder out = new StringBuilder("");

	public static StringBuilder converse(int liczba, int system) {

		
		out.delete(0, out.length());
		out.append("");
		
		int cyfra;

		while (liczba > 0) {
			cyfra = liczba % system;
			if (cyfra > 9) {
				switch (cyfra) {
					case 10: out.append("A"); break;
					case 11: out.append("B"); break;
					case 12: out.append("C"); break;
					case 13: out.append("D"); break;
					case 14: out.append("E"); break;
					case 15: out.append("F"); break;
				}
			} else {
				out.append(cyfra);
			}
			liczba /= system;
		}

		out.reverse();

		return out;
	}

	// Main
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short iloscZadan = Short.parseShort(in.readLine());

		while (iloscZadan > 0) {
			
			int liczba = Integer.parseInt(in.readLine().trim());

			System.out.println(Main.converse(liczba, 16).toString() + " " + Main.converse(liczba, 11).toString());

			iloscZadan--;
		}
		System.exit(0);
	}
}
