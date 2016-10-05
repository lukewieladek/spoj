package s_0034_kc009;

import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ciag = new StringBuilder("");
		
		while (in.ready()) {
			ciag.delete(0, ciag.length());
			ciag.append(in.readLine().trim());
			ciag.reverse();
			System.out.println(ciag);
		}
		System.exit(0);
	}
}
