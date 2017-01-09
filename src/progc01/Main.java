package progc01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int count = 0;
		
		while (in.readLine() != null) {
			count++;
		}
		
		System.out.println(count);
		
		System.exit(0);
	}
}
