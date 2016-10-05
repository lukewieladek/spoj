package suma;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner in = new Scanner(System.in);
		int suma = 0;
		
		while (in.hasNext()) {
			
			int x = in.nextInt();
			suma = suma + x;
			
			System.out.println(suma);
		}
	} 
}

//Zadanie tylko dla C++