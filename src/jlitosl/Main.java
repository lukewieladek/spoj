package jlitosl;

import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		short iloscZadan = Short.parseShort(in.readLine());
		
		while (iloscZadan > 0) {
			
			String wyrazCzytany = new String(in.readLine().trim());
			konwerter(wyrazCzytany);
			--iloscZadan;
		}
	}
	
	static void konwerter(String wyrazCzytany) {
		StringBuilder wyrazPisany  = new StringBuilder();
		int dlugoscNapisuCzytanego = wyrazCzytany.length();
		int pozycja = dlugoscNapisuCzytanego;
		boolean bln = false;
		boolean mld = false;
		boolean mln = false;
		boolean tys = false;
		
		for (int i = 0; i < dlugoscNapisuCzytanego; ++i ) {
			
			
			
			switch (pozycja % 3) {
				case 0: {
					if (wyrazCzytany.charAt(i) != '0') {
						switch (wyrazCzytany.charAt(i)) {
						case '1': wyrazPisany.append("sto ");
							break;
						case '2': wyrazPisany.append("dwiescie ");
							break;
						case '3': wyrazPisany.append("trzysta ");
							break;
						case '4': wyrazPisany.append("czterysta ");
							break;
						case '5': wyrazPisany.append("piecset ");
							break;
						case '6': wyrazPisany.append("szescset ");
							break;
						case '7': wyrazPisany.append("siedemset ");
							break;
						case '8': wyrazPisany.append("osiemset ");
							break;
						case '9': wyrazPisany.append("dziewicset ");
							break;
						}
					}
				}
				break;
				case 2: {
					if (wyrazCzytany.charAt(i) != '0' && wyrazCzytany.charAt(i) != '1') {
						switch (wyrazCzytany.charAt(i)) {
						case '2': wyrazPisany.append("dwadziescia ");
							break;
						case '3': wyrazPisany.append("trzydziesci ");
							break;
						case '4': wyrazPisany.append("czterdziesci ");
							break;
						case '5': wyrazPisany.append("piecdziesiat ");
							break;
						case '6': wyrazPisany.append("szescdziesiat ");
							break;
						case '7': wyrazPisany.append("siedemdziesiat ");
							break;
						case '8': wyrazPisany.append("osiemdziesiat ");
							break;
						case '9': wyrazPisany.append("dziewiecdziesiat ");
							break;
						}
					}
				}
				break;
				case 1: {
					if (wyrazCzytany.charAt(i) == '0' && wyrazCzytany.charAt(i-1) == '1') {	
						wyrazPisany.append("dziesiec ");
					} else
					if (wyrazCzytany.charAt(i-1) == '1') {
						switch (wyrazCzytany.charAt(i)) {
						case '1': wyrazPisany.append("jedenascie ");
							break;
						case '2': wyrazPisany.append("dwanascie ");
							break;
						case '3': wyrazPisany.append("trzynascie ");
							break;
						case '4': wyrazPisany.append("czternascie ");
							break;
						case '5': wyrazPisany.append("pietnascie ");
							break;
						case '6': wyrazPisany.append("szesnascie ");
							break;
						case '7': wyrazPisany.append("siedemnascie ");
							break;
						case '8': wyrazPisany.append("osiemnascie ");
							break;
						case '9': wyrazPisany.append("dziewietnascie ");
							break;
						}
					} else {
						switch (wyrazCzytany.charAt(i)) {
						case '1': wyrazPisany.append("jeden ");
							break;
						case '2': wyrazPisany.append("dwa ");
							break;
						case '3': wyrazPisany.append("trzy ");
							break;
						case '4': wyrazPisany.append("cztery ");
							break;
						case '5': wyrazPisany.append("piec ");
							break;
						case '6': wyrazPisany.append("szesc ");
							break;
						case '7': wyrazPisany.append("siedem ");
							break;
						case '8': wyrazPisany.append("osiem ");
							break;
						case '9': wyrazPisany.append("dziewiec ");
							break;
						}
					}
				}
				break;	
			}
			
			
			
			switch (pozycja) {
			case 13: {
				//if (bln) 
					wyrazPisany.append("bln. ");
			}
				break;
			case 10: {
				//if (mld) 
					wyrazPisany.append("mld. ");
			}
				break;
			case 7:  {
				//if (mln) 
					wyrazPisany.append("mln. ");
			}
				break;
			case 4:  {
				//if (tys) 
					wyrazPisany.append("tys. ");
			}
				break;
			}
			
			pozycja--;
		}
		
		System.out.println(wyrazPisany.toString().trim());
	}
}

//Do zrobienia pozostaje 000 tys oraz jak jest tylko 1000 
