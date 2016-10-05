package prime_t;

import java.util.Scanner;
public class LiczbyPierwsze {
	
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
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int x = 0;
		
		while (n > 0) {
			x = scanner.nextInt();
			if (isPrime(x)) System.out.println("TAK");
			else System.out.println("NIE");
			n--;
		}
		scanner.close();
	}
}
