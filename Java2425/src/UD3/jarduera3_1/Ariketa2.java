package UD3.jarduera3_1;

import java.io.*;
import java.util.Scanner;

public class Ariketa2 {

	public static void main(String[] args) throws IOException {
		
		// Aldagaiak
		File file = new File("./files/UD3/pertsonak-koma.txt");
		Scanner scFile = new Scanner(file);
		String[] izenak;
		String[] abizenak;
		String[] emailak1;
		String[] emailak2;
		String[] lanbideak;
		String[] zatiak;
		String lerroa = null;
		int[] id;
		int[] urteak;
		int i = 0;
		int k = 0;
		int j = 0;
		double[] soldatak;
		
		
		
		
		
		// PROGRAMA
		
		lerroa = scFile.nextLine();
		
		// Arrai-ei luzeera definitu
		while (scFile.hasNext()) {
			
			lerroa = scFile.nextLine();
			i ++;
			
		}
		
		System.out.println(i);
		
		izenak = new String[i];
		abizenak = new String[i];
		emailak1 = new String[i];
		emailak2 = new String[i];
		lanbideak = new String[i];
		id = new int[i];
		urteak = new int[i];
		soldatak = new double[i];
		zatiak = lerroa.split(",");
		
		scFile = new Scanner (file);
		lerroa = scFile.nextLine();
		
		for (j = 0; j <= i; j ++) {
			
			if (scFile.hasNext()) {
				
				id[k] = Integer.parseInt(zatiak[0]);
				izenak[k] = zatiak[1];
				abizenak[k] = zatiak[2];
				emailak1[k] = zatiak[3];
				emailak2[k] = zatiak[4];
				lanbideak[k] = zatiak[5];
				urteak[k] = Integer.parseInt(zatiak[6]);
				soldatak[k] = Double.parseDouble(zatiak[7]);
				k ++;
				lerroa = scFile.nextLine();
				
			}
		}
		scFile.close();
	}

}
