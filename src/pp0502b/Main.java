package pp0502b;

import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short liczbaTestow = Short.parseShort(in.readLine());

		while (liczbaTestow > 0) {

			String[] strTab = in.readLine().split("\\s+");
			
			for (int i = strTab.length - 1; i > 0; --i) {
				System.out.print(strTab[i] + " ");
			}
			
			System.out.print("\n");
		
			--liczbaTestow;
		}
		System.exit(0);
	}
}