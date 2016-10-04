package s_0022_pp0601a2;

import java.io.*;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		boolean poprzednia = true;
		int stop = 0;
		
		Scanner sc = new Scanner(in);
		int n = 0;
		
		while (sc.hasNextInt()) {
			
			n = sc.nextInt();
			
			if (n == 42) {	   //Jesli wczytana to 42.
				if (!poprzednia) stop++;
				poprzednia = true; //Ustaw obecna na prawde.
			} else {
				poprzednia = false;//Jesli obecna liczba to nie 42 to ustaw poprzednia na false.
			}
			
			System.out.println(n); //Wyświetlenie aktualnej liczby.
			if (stop == 3) break; //Sprawdzenie warunku.
		}
	}
}
