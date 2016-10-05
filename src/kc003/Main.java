package kc003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (in.ready()) {
			
			String[] tab = in.readLine().trim().split("\\s+");
			
			double a = Double.parseDouble(tab[0]);
			double b = Double.parseDouble(tab[1]);
			double c = Double.parseDouble(tab[2]);
		
			int warunek = 1;
			
			if (!(a + b > c)) warunek = 0;
			else if (!(a + c > b)) warunek = 0;
			else if (!(b + c > a)) warunek = 0;
			
			System.out.println(warunek);
		}
		System.exit(0);
	}
}
