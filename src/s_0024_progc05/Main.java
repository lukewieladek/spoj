package s_0024_progc05;

import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (in.ready()) {

			String line = in.readLine();
			String znak = "" + line.charAt(0);
			line = line.substring(1);
			
			System.out.println(line.replace(znak, ""));
		}

		System.exit(0);
	}
}
