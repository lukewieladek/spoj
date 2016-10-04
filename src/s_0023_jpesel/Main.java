package s_0023_jpesel;

import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException, NumberFormatException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int iloscZadan = Integer.parseInt(in.readLine());
		
		try {
			while (iloscZadan > 0) {
			
				String s = new String(in.readLine().trim());
				int suma = 0;
			
				suma = (Character.getNumericValue(s.charAt(0)) +
						Character.getNumericValue(s.charAt(1)) * 3 +
						Character.getNumericValue(s.charAt(2)) * 7 +
						Character.getNumericValue(s.charAt(3)) * 9 +
						Character.getNumericValue(s.charAt(4)) +
						Character.getNumericValue(s.charAt(5)) * 3 +
						Character.getNumericValue(s.charAt(6)) * 7 +
						Character.getNumericValue(s.charAt(7)) * 9 +
						Character.getNumericValue(s.charAt(8)) +
						Character.getNumericValue(s.charAt(9)) * 3 +
						Character.getNumericValue(s.charAt(10)));
			
				if (suma > 0) {
					if (suma % 10 == 0) System.out.println("D");
					else System.out.println("N");
				} else System.out.println("N");
			}
		} catch (Exception e) {
			return;
		}
	}
	
}