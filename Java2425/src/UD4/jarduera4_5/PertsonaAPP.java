package UD4.jarduera4_5;

// IMPORTED PACKAGES //

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
// MODELS //

import UD4.jarduera4_5.models.Pertsona;
import UD4.jarduera4_5.models.Sexua;

public class PertsonaAPP {

	public static void main(String[] args) throws IOException {

		// VARIABLES //

		File file = new File("./files/UD4/pertsonak2.txt");
		Scanner scFile = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		String eskaera = null;
		int aukera = 0;
		boolean badago = false;
		boolean nagusiaDa = false;

		// CREATE AN ARRAYLIST FOR THE MODEL "PERTSONA" //

		ArrayList<Pertsona> pertsonaList = new ArrayList<Pertsona>();

		// THE PROGRAMM //
		
		arrayListBete(file, scFile, pertsonaList);
		do {

			menuaErakutsi();
			aukera = Integer.parseInt(sc.nextLine());

			switch (aukera) {

			case 1:

				pertsonaSortu(sc, pertsonaList);
				break;

			case 2:

				eskaera = pertsonaEskatu(sc);
				badago = pertsonaKonprobatu(eskaera);

				if (badago == true) {

					System.out.println(eskaera + " pertsonaren IMC balorea " + pertsona.kalkulatuIMC + " da.");
				} else {

					System.out.println(
							"Ez dago " + eskaera + " izeneko pertsonarik gure datuen artean. Menura itzuliko zara.");
				}
				
			case 3:
				
				eskaera = pertsonaEskatu(sc);
				badago = pertsonaKonprobatu(eskaera);
				nagusiaDa = pertsona.adinezNagusi;
				
				if (nagusiaDa == true && badago == true) {
					
					System.out.println(eskaera + " pertsona, adinez nagusikoa da.");
				} else {
					
					System.out.println(eskaera + " pertsona, adinez txikikoa da.");
				}
			}

		} while (aukera != 0);

	}

	private static void arrayListBete(File file, Scanner scFile, ArrayList<Pertsona> pertsonaList) {
		
		// VARIABLES //
		
		String[] data;
		String line = null;
		
		// METHOD //
		
		while(scFile.hasNext()) {
			
			// SPLIT THE DATA FROM EACH LINE BY THE SEPARATOR //
			
			line = scFile.nextLine();
			data = line.split(";");
			
			// CREATE AN INSTANCE OF THE CLASS "PERTSONA" //
			
			Pertsona pertsona = new Pertsona();
			
			// INSERT THE VALUES OF EACH LINE //
			
			pertsona.setIzena(data[0]);
			pertsona.setAdina(Integer.parseInt(data[1]));
			pertsona.setNan(data[2]);
			pertsona.setSexua(Sexua.valueOf(data[3]));
			pertsona.setPisua(Double.parseDouble(data[4]));
			pertsona.setAltuera(Double.parseDouble(data[5]));
			
			// FINALLY ADD THE INSTANCE TO THE ARRAYLIST //
			
			pertsonaList.add(pertsona);
			
		}
		
	}

	private static void menuaErakutsi() {
		
		// MAIN MENU OF THE PROGRAMM //
		
		System.out.println();
		System.out.println("===============================================");
		System.out.println("              Zer egin nahi duzu?              ");
		System.out.println("===============================================");
		System.out.println();
		System.out.println(" 1.- PERTSONA BERRI BAT SARTU DATETAN.");
		System.out.println(" 2.- PERTSONA BATEN IMC BALORE BISTARATU.");
		System.out.println(" 3.- PERTSONA BAT ADIN NAGUSIA DEN KONPROBATU.");
		System.out.println(" 4.- DATUAK GORDE.");
		System.out.println(" 0.- IRTEN.");
		
	}

	private static void pertsonaSortu(Scanner sc, ArrayList<Pertsona> pertsonaList) {
		
		// METHOD TO CREATE A NEW OBJECT BY INPUTS OF A USER //
		
			// CRAEATE A NEW INSTANCE //
		
		Pertsona pertsona = new Pertsona();
		
		System.out.println("Pertsona bat gure programara satzeko hurrengo datuak beharko ditugu:");
		
		System.out.println("IZENA:");
		pertsona.setIzena(sc.nextLine());
		
		System.out.println("ADINA:");
		pertsona.setAdina(Integer.parseInt(sc.nextLine()));
		
		System.out.println("NAN Zenbakia:");
		pertsona.setNan(sc.nextLine());
		
		System.out.println("Sexua (G edo E):");
		pertsona.setSexua(Sexua.valueOf(sc.nextLine()));
		
		System.out.println("Pisua (Kg-moetan):");
		pertsona.setPisua(Double.parseDouble(sc.nextLine()));
		
		System.out.println("Altuera (Cm-etan):");
		pertsona.setAltuera(Double.parseDouble(sc.nextLine()));
		
			// ADD THE INSTANCE TO THE ARRAYLIST //
		
		pertsonaList.add(pertsona);
		
	}
}
