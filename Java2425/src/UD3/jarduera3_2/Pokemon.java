package UD3.jarduera3_2;

import java.io.*;
import java.util.Scanner;

public class Pokemon {

	public static void main(String[] args) throws IOException {
		
		/*Aldagaiak*/
		
		File file = new File ("./files/UD3/pokemons.csv");
		Scanner scFile = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		int kopurua = lerroakKontatu(scFile);
		int aukera = 0;
		
		// arrai-ak definitu
		
		String[] izenak = new String[kopurua];
		String[] motak = new String[kopurua];
		int[] mailak = new int[kopurua];
		int[] erasoa = new int[kopurua];
		int[] defentza = new int[kopurua];
		int[] abiadura = new int[kopurua];
		
		
		
		// Programa
		
		datuakKargatu(file, scFile, izenak, motak, mailak, erasoa, defentza, abiadura);
		
		do {
			
			menuaErakutsi();
			aukera = Integer.parseInt(sc.nextLine());
			
			switch (aukera) {
			
			case 1:
				
			}
			
		}while (aukera != 0);
		
		scFile.close();
		sc.close();
		
	}
	

	

	
	private static int lerroakKontatu(Scanner scFile) throws IOException {

		int i = 0;
		
		scFile.nextLine();
		
		while (scFile.hasNext()) {
 
			scFile.nextLine();
			i++;

		}

		System.out.println("Lerroak Kontatuta!! " + i);
		return i;

	}
	
	private static void datuakKargatu(File file, Scanner scFile, String[] izenak, String[] motak, int[] mailak, int[] erasoa, int[] defentza, int[] abiadura) throws IOException {

		int i = 0;
		String lerroa = null;
		String[] zatiak;
		
		scFile = new Scanner(file);
		scFile.nextLine();
		
		while (scFile.hasNext()) {

			lerroa = scFile.nextLine();
			zatiak = lerroa.split(",");
			izenak[i] = zatiak[0];
			motak[i] = zatiak[1];
			mailak[i] = Integer.parseInt(zatiak[2]);
			erasoa[i] = Integer.parseInt(zatiak[3]);
			defentza[i] = Integer.parseInt(zatiak[4]);
			abiadura[i] = Integer.parseInt(zatiak[5]);
			
			
			i++;
		}

		System.out.println("Datuak ondo gorde dira!!");

	}

	private static void menuaErakutsi() {
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("           Ongi Etorri PocketMonster-era!! Zer egin nahi duzu?            ");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println();
		System.out.println("  1.- GURE FITXATEGIETAN DAUDEN POKEMON-EN IZEN GUZTIAK BISTARATU.");
		System.out.println("  2.- ALDATUTAKO DATUAK GURE FITXATEGIETAN GORDE.");
		System.out.println("  3.- POKEMON BATEN DATUAK BISTARATU.");
		System.out.println("  4.- POKEMON BATEN DATUAK ALDATU");
		System.out.println("  5.- KATE BATEN BIDEZ POKEMON EZBERDINAK BISTARATU.");
		System.out.println("  6.- BATAZBESTEKO ABIADURATIK GAINEAN DAUDEN POKEMON GUZTIAK BISTARATU.");
		System.out.println("  7.- MOTA BERDINEKO POKEMON GUZTIAK BISTARATU.");
		System.out.println("  8.- BI POKEMON ARTEAKO BORROKA.");
		System.out.println("  9.- BI POKEMON ARTEKO BORROKA (AUSAZKOA).");
	}
}
