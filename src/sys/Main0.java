package sys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main0 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short iloscZadan = Short.parseShort(in.readLine());
		StringBuilder out = new StringBuilder("");
		
		while (iloscZadan > 0) {
			out.delete(0, out.length());
			out.append("");
			
			int liczba = Integer.parseInt(in.readLine().trim());
			
			out.append(Converse.converse(liczba, 16));
			out.append(" ");
			out.append(Converse.converse(liczba, 11));
			
			System.out.println(out.toString());
			
			iloscZadan--;
		}
		System.exit(0);
	}
}

class Converse {
	public static StringBuilder converse(int liczba, int system) {
		StringBuilder out = new StringBuilder("");
		
		int cyfra;
		
		while (liczba > 0) {
			cyfra = liczba % system;
			if (cyfra > 9) cyfra += 7;
			out.append((char)(cyfra + 48));
			liczba /= system;
		}
		
		out.reverse();
		
		return out;
	}
}