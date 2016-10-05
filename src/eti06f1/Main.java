package eti06f1;

import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] s = in.readLine().split(" ");
		
		double r = Double.parseDouble(s[0]);
		double d = Double.parseDouble(s[1]);
		
		System.out.println(licz(r, d));
	}
	
	static double licz(double r, double d) {
		double P;
		P = Math.PI * (r*r - ((d*d) / 4));
		P *= 100;
		P = Math.round(P);
		P /= 100;
		return P;
	}
}