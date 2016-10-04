package s_0001_prime_t;

import java.io.*;
public class Rozwiazanie_1_GPSP {
	
	public static boolean isPrime(int x) {
		if (x > 2) {
			double sqrt_x = Math.sqrt(x);
			if (x % 2 == 0) return false;
			for (int i = 3; i <= sqrt_x; ++i) if (x % i == 0) return false;
			return true;
		}
		if (x == 2) return true;
		return false;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader wejscie = new BufferedReader(new InputStreamReader(System.in));
		int iloscZadan = Integer.parseInt(wejscie.readLine());
		while (iloscZadan > 0) {
			int x = Integer.parseInt(wejscie.readLine());
			if (isPrime(x)) System.out.println("TAK");
			else System.out.println("NIE");
			iloscZadan--;
		}
	}
}

