package ptest;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s;
		s = bf.readLine();
		int a = Integer.parseInt(s);
		s = bf.readLine();
		int b = Integer.parseInt(s);
		System.out.println(a+b);
	
	}

}
