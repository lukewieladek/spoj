package potsam;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, NumberFormatException {
	
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		System.out.println(a * b + c * d);
		sc.close();

	}
}
