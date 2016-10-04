package s_0021_ptrol_rol;

import java.io.*;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int iloscZadan = Integer.parseInt(in.readLine());
		
		while (iloscZadan > 0) {
			
			Scanner sc = new Scanner(in.readLine());
			sc.nextInt();
			int pierwsza = sc.nextInt();
			String s = sc.nextLine();
			System.out.println(s + " " + pierwsza);
			sc.close();
			--iloscZadan;
		}
	}
}
