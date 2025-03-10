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
		int indizea = 0;
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
				badago = pertsonaKonprobatu(pertsonaList, eskaera);

				if (badago == true) {

					indizea = indizeaLortu(pertsonaList, eskaera);
					System.out.println(eskaera + " pertsonaren IMC balorea " + pertsonaList.get(indizea).kalkulatuIMC(
							pertsonaList.get(indizea).getPisua(), pertsonaList.get(indizea).getAltuera()) + " da.");
					break;

				} else {

					System.out.println(
							"Ez dago " + eskaera + " izeneko pertsonarik gure datuen artean. Menura itzuliko zara.");
					break;
				}

			case 3:

				eskaera = pertsonaEskatu(sc);
				badago = pertsonaKonprobatu(pertsonaList, eskaera);

				if (badago == true) {

					indizea = indizeaLortu(pertsonaList, eskaera);

					nagusiaDa = pertsonaList.get(indizea).adinezNagusi(pertsonaList.get(indizea).getAdina());

					if (nagusiaDa == true) {

						System.out.println(eskaera + " adinez nagusikoa da.");
						break;

					} else {

						System.out.println(eskaera + " adinez txikikoa da.");
						break;
					}
				} else {

					System.out.println(
							"Ez dago " + eskaera + " izeneko pertsonarik gure datuen artean. Menura itzuliko zara.");

				}

				break;

			case 4:

				datuakGorde(file, pertsonaList);
				break;

			case 0:

				System.out.println("Amaiera.");
				break;

			default:

				System.out.println("Aukera hori ez da egokia.");
				break;
				
			}
			
		} while (aukera != 0);

	}

	private static void arrayListBete(File file, Scanner scFile, ArrayList<Pertsona> pertsonaList) {

		// VARIABLES //

		String[] data;
		String line = null;

		// DECLARE THE OBJECT "PERTSONA" //

		Pertsona pertsona;

		// METHOD //

		while (scFile.hasNext()) {

			// SPLIT THE DATA FROM EACH LINE BY THE SEPARATOR //

			line = scFile.nextLine();
			data = line.split(";");

			// INITIALIZE AN INSTANCE OF THE CLASS "PERTSONA" //

			pertsona = new Pertsona();

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
		System.out.println(" 1.- PERTSONA BERRI BAT SARTU DATUETAN.");
		System.out.println(" 2.- PERTSONA BATEN IMC BALORE BISTARATU.");
		System.out.println(" 3.- PERTSONA BAT ADIN NAGUSIA DEN KONPROBATU.");
		System.out.println(" 4.- DATUAK GORDE.");
		System.out.println(" 0.- IRTEN.");

	}

	private static void pertsonaSortu(Scanner sc, ArrayList<Pertsona> pertsonaList) {

		// METHOD TO CREATE A NEW OBJECT BY INPUTS OF A USER //

		// INITIALIZE A NEW INSTANCE //

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

	private static String pertsonaEskatu(Scanner sc) {

		// VARIABLES //

		String eskaera = null;

		// METHOD //

		System.out.println("Idatzi pertsona baten izena.");
		eskaera = sc.nextLine();

		eskaera = eskaera.toUpperCase();

		return eskaera;

	}

	private static boolean pertsonaKonprobatu(ArrayList<Pertsona> pertsonaList, String eskaera) {

		// VARIABLES //

		int i = 0;

		// METHOD //

		for (i = 0; i < pertsonaList.size(); i++) {

			if (eskaera.equalsIgnoreCase(pertsonaList.get(i).getIzena())) {

				return true;

			}
		}

		return false;

	}

	private static int indizeaLortu(ArrayList<Pertsona> pertsonaList, String eskaera) {

		// VARIABLES //

		int i = 0;
		int indizea = 0;

		// METHOD //

		for (i = 0; i < pertsonaList.size(); i++) {

			if (eskaera.equalsIgnoreCase(pertsonaList.get(i).getIzena())) {

				indizea = i;
				return indizea;

			}
		}

		return 0;
	}

	private static void datuakGorde(File file, ArrayList<Pertsona> pertsonaList) {

		// VARIABLES //

		int i = 0;

		// TRY-CATCH METHOD TO SAVE THE DATA TO THE FILE //

		try {

			PrintWriter pw = new PrintWriter(file);

			for (i = 0; i < pertsonaList.size(); i++) {

				pw.println(pertsonaList.get(i).saveData());

			}

			pw.close();

		} catch (FileNotFoundException e) {

			System.out.println("Datuek ez dira ondo gorde!!");

		}

		System.out.println("Datuak ondo gorde dira!!");

	}
}
