package stos;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, NumberFormatException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(in);
		
		Main m = new Main();
		Stos stos = m.new Stos();
		
		while (sc.hasNext()) {

			String znak = sc.nextLine().trim();
			switch (znak.charAt(0)) {
				
				case '-': {
					if (stos.getLicznik() != 0) {
						System.out.println(stos.pop());
					} else System.out.println(":(");
				} break;
				
				case '+': {
					String s = sc.nextLine().trim();
					if (stos.getLicznik() < 10 ) {
						stos.push(Integer.parseInt(s));
						System.out.println(":)");
					} else System.out.println(":(");
				} break;
			
			}
		}
		
		sc.close();
		
	}
	
	class Stos { //Klasa opisujaca dzialanie obiektu stosu.
		
		short licznik = 0; //Liczba oznaczajaca ilosc elementow na stosie i wskazujaca na ostatni element.
		
		int[] tab = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }; //Tablica przechowujaca elementy stosu.
		
		public Stos() {}; //Domy�lny konstruktor.
			
		public void push(int arg) { //Dodanie przekazanej wartosci do stosu.
			tab[licznik] = arg; //Przypisanie jej do aktualnej wielkosci licznika.
			licznik++; //Zwiekszenie licznika o 1.
		}
		
		public int pop() { //Zdjecie elementu.
			--licznik; //Zmniejszenie licznika o 1.
			return tab[licznik];
		}
		
		public int getLicznik() {
			return licznik;
		}
	}
}
