package tablica;

import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] strTab = in.readLine().split("\\s+");

		for (int i = strTab.length - 1; i >= 0; --i) {
			System.out.print(strTab[i] + " ");
		}

		System.exit(0);
	}
}