package UD3.jarduera3_3;

import java.io.*;
import java.util.Scanner;

public class Nutriscore {

	public static void main(String[] args) throws IOException {

		// Aldagaiak
		
		File file = new File("./files/UD3/janariak.txt");
		Scanner scFile1 = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		int kopurua = lerroakKontatu(scFile1);
		int aukera = 0;
		String[] izenak = new String[kopurua];
		String[] egoerak = new String[kopurua];
		String[] motak = new String[kopurua];
		Double[] kaloriak = new Double[kopurua];
		Double[] koipeak = new Double[kopurua];
		Double[] proteinak = new Double[kopurua];
		Double[] karbohidratoak = new Double[kopurua];
		
		
		
		
		
		datuakGorde(file, izenak, egoerak, motak, kaloriak, koipeak, proteinak, karbohidratoak);
		
		do {
			menuaErakutsi();
			aukera = sc.nextInt();
			
			switch (aukera) {
			
			case 1: 
				
				
			}
		}while (aukera != 0);
		
		
		
		

	}

	private static int lerroakKontatu(Scanner scFile1) throws IOException {

		int i = 0;
		Scanner scFile2 = scFile1;

		while (scFile2.hasNext()) {

			scFile2.nextLine();
			i++;

		}

		System.out.println("Lerroak Kontatuta!! " + i);
		return i;
	}

	private static void datuakGorde(File file, String[] izenak, String[] egoerak, String[] motak, Double[] kaloriak,
			Double[] koipeak, Double[] proteinak, Double[] karbohidratoak) throws IOException {
		
		int i = 0;
		Scanner scFile3 = new Scanner(file);
		String lerroa = null;
		String[] zatiak;
		
		
		
		
		
		while (scFile3.hasNext()) {
			
			lerroa = scFile3.nextLine();
			zatiak = lerroa.split(";");
			izenak[i] = zatiak[0];
			egoerak[i] = zatiak[1];
			kaloriak[i] = Double.parseDouble(zatiak[2]);
			koipeak[i] = Double.parseDouble(zatiak[3]);
			proteinak[i] = Double.parseDouble(zatiak[4]);
			karbohidratoak[i] = Double.parseDouble(zatiak[5]);
			motak[i] = zatiak[6]; 
			i ++;
		}
		
		System.out.println("Datuak ondo gorde dira!!");
	
	}

	private static void menuaErakutsi() {
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("            Ongi Etorri NutriScore-ra. Zer egin nahi duzu             ");
		System.out.println("----------------------------------------------------------------------");
		System.out.println();
		System.out.println(" 1.- ELIKAGAI BATEN MOTA BERBEREKOAK BISTARATU.");
		System.out.println(" 2.- ELIKAGAI MOTA BATEN KALORIEN BATASBEZTEKOA BISTARATU.");
		System.out.println(" 3.- ELIKAGAI MOTA BERRBEREKO KANTITATEA BISTARATU.");
		System.out.println(" 4.- ELIKAGAI BATEN BALORE NUTRIZIONALA BISTARATU.");
		System.out.println(" 5.- ELIKAGAIA BATEN EGOERA BAKOITZEKO BALORE NUTRIZIONALA BISTARATU.");
		System.out.println(" 0.- IRTEN.");
	}
}
