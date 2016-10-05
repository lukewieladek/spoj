package calc2;//Zadanie dla C++

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner in = new Scanner(System.in);
		
		String operacja;
		int arg1, arg2;
		
		int[] reg = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		
		while (in.hasNext()) {
			operacja = in.next();
			arg1 = in.nextInt();
			arg2 = in.nextInt();
			obliczenia(operacja, arg1, arg2, reg);
		}
		
		in.close();
	}
	
	static void obliczenia(String operacja, int arg1, int arg2, int[] reg) {
		
		switch (operacja.charAt(0)) {
		
			case 'z':
				reg[arg1] = arg2;
			break;
			
			case '+':
				System.out.println(reg[arg1] + reg[arg2]);
				break;
				
			case '-':
				System.out.println(reg[arg1] - reg[arg2]);
				break;
				
			case '*':
				System.out.println(reg[arg1] * reg[arg2]);
				break;
				
			case '/':
				System.out.println(reg[arg1] / reg[arg2]);
				break;
				
			case '%':
				System.out.println(reg[arg1] % reg[arg2]);
				break;
		}
		
	}
}