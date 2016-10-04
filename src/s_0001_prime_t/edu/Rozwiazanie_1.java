package s_0001_prime_t.edu;

import java.io.*;

public class Rozwiazanie_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int n, lp, p, d;
		boolean t;
		
		BufferedReader wejscie = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(wejscie.readLine());
		
		lp = 0;
		
		p = 2;
		
		while (lp < n) {
			t = true;
			for (d = 2; d < p; d++) {
				if (p % d == 0) {
					t = false;
					break;
				}
			}
			if (t) {
				System.out.println(p + " ");
				lp++;
			}
			p++;
		}
	}

}
