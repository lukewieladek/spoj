package niekolej;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (in.ready()) {

			int n = Integer.parseInt(in.readLine().trim());
			if (n == 0) {
				System.out.println(0);
			} else if (n == 1 || n == 2) {
				System.out.println("NIE");
			} else {
				int polowa = (n +1) / 2;

				int[] tab = new int[n + 1];

				int cecha = 0;

				for (int i = 0; i <= n; i++) {

					if (i + 1 <= polowa) {
						cecha++;
						tab[i + cecha] = i;
					} else {
						tab[i - cecha] = i;
						cecha--;
					}
				}

				for (int i : tab) {
					System.out.print(i + " ");
				}
			}
		}
		System.exit(0);
	}
}
