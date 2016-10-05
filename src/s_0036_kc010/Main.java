package s_0036_kc010;

import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (in.ready()) {

			int liczbaCyfr = 0;
			int liczbaWyrazow = 0;

			String[] tab = in.readLine().trim().split("\\s+");

			for (String s : tab) {
				try {

					double d = Double.parseDouble(s);
					liczbaCyfr++;

				} catch (NumberFormatException e) {
					liczbaWyrazow++;
				}
			}

			System.out.println(liczbaCyfr + " " + liczbaWyrazow);
		}
		System.exit(0);
	}
}
