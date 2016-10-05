package s_0030_pp0506a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short iloscZadan = Short.parseShort(in.readLine());
		
		while (iloscZadan > 0) {
			
			String check = in.readLine().trim();
			
			if (check.isEmpty()) check = in.readLine().trim();
			
			int n = Integer.parseInt(check); // Liczba punkt�w.
			//Punkt[] tab = new Punkt[n];
			
			List<Punkt> tab = new ArrayList<Punkt>();
			
			for (int i = 0; i < n; ++i) {
				String[] strTab = in.readLine().trim().split("\\s+");
				//tab[i] = new Punkt(strTab[0], Integer.parseInt(strTab[1]), Integer.parseInt(strTab[2]));
				tab.add(new Punkt(strTab[0], Integer.parseInt(strTab[1]), Integer.parseInt(strTab[2])));
				//System.out.println(tab[i]);
			}
			
			Collections.sort(tab);
			
			for (Punkt punkt : tab)
				System.out.println(punkt);
			
			System.out.println();
			iloscZadan--;
		}
		System.exit(0);
	}
}

class Punkt implements Comparable<Punkt>{ 
	
	Punkt(String nazwa, int x, int y) {
		this.nazwa = nazwa;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return nazwa + " " + x + " " + y;
	}
	
	@Override
	public int compareTo(Punkt p) {
		
		double odleglosc_this = Math.sqrt((0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.y));
		double odleglosc_p = Math.sqrt((0 - p.x) * (0 - p.x) + (0 - p.y) * (0 - p.y));
		if (odleglosc_this > odleglosc_p)
			return 1;
		else
			return -1;
	}
	
	private String nazwa;
	private int x, y;
}