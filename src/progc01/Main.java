package progc01;

import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 0;
		String s = new String();
		
		while ((s = in.readLine()) != null) {
			++n;
		}
		
		System.out.println(n);
	}
}
