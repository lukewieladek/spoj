package fzi_stef;

import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		try {
			
			//-------------------------------------------------------------------------
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int iloscLiczb = Integer.parseInt(in.readLine());
			int[] tab = new int[iloscLiczb];
			
			for (int i = 0; i < iloscLiczb; ++i) {
				tab[i] = Integer.parseInt(in.readLine());
			}
			
			int zysk = algorytm(tab);
			
			if (zysk <= 0) System.out.println(0);
			else System.out.println(zysk);
			
			//-------------------------------------------------------------------------
			
		} catch (Exception e) {
			return;
		}
		
	}
	
	static int algorytm(int[] tab) throws NumberFormatException, IOException {
		
		int maxSum = Integer.MIN_VALUE;
		int maxStartIndex = 0;
		int maxEndIndex = 0;
		
		int currentMaxSum = 0;
		int currentStartIndex = 0;
		
		for (int currentEndIndex = 0; currentEndIndex < tab.length; currentEndIndex++) {
			currentMaxSum = currentMaxSum + tab[currentEndIndex];
			if (currentMaxSum > maxSum) {
				maxSum = currentMaxSum;
				maxStartIndex = currentStartIndex;
				maxEndIndex = currentEndIndex;
			}
			
			if (currentMaxSum < 0) {
				currentMaxSum = 0;
				currentStartIndex = currentEndIndex + 1;
				
			}
		}
		
		return maxSum;
	}
	
}