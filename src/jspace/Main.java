package jspace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder("");
		
		while (in.ready()) {
			
			out.delete(0, out.length());
			out.append("");
			
			String[] first = in.readLine().trim().split("\\s+");
			out.append(first[0]);
			
			for (int i = 1; i < first.length; ++i) {
				out.append(first[i].substring(0, 1).toUpperCase());
				out.append(first[i].substring(1));
			}
			
			System.out.println(out.toString());
		}
		
		System.exit(0);
	}
}
