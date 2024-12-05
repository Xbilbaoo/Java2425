package UD4.jarduera4_3;

// IMPORTED PACKAGES //

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// IMPORTED MODELS //

import UD4.jarduera4_3.models.Animalia;

public class AnimaliaAPP {

	public static void main(String[] args) throws IOException {

		// VARIABLES //

		File file = new File("./files/UD4/info.txt");
		Scanner scFile = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		String animalia = null;
		int aukera = 0;
		boolean animaliaDago = false;

			// CREATING THE ARRAYLIST FOR THE MODEL "ANIMALIA" //

		ArrayList<Animalia> animaliaList = new ArrayList<Animalia>();

		// THE PROGRAMM //

		ArraiListBete(file, scFile, animaliaList);

		do {

			menuaErakutsi();
			aukera = Integer.parseInt(sc.nextLine());
			switch (aukera) {

			case 1:

				animalienDatuakBistaratu(animaliaList);
				break;

			case 2:

				System.out.println("Gure datuen arteko bizi iraupen nagusiduna "
						+ animaliZaharrenaBistaratu(animaliaList) + " animalia da.");
				break;

			case 3:

				animalia = animaliaEskatu(sc);
				animaliaDago = animaliaKonprobatu(animaliaList, animalia);

				if (animaliaDago == true) {

					habitatBistaratu(animaliaList, animalia);

				} else {

					System.out.println("Animali hori ez dago gure datuen artean. Menura itzuliko zara.");

				}

				break;

			case 4:

				System.out.println("Eskerrik asko gu aukeratzegaitik. AGUR!!");
				break;

			default:

				System.out.println("Aukera Hori ez dago menuan.");
				break;
			}

		} while (aukera != 4);
		
		scFile.close();
		sc.close();
	}

	// METHODS //

	private static void ArraiListBete(File file, Scanner scFile, ArrayList<Animalia> animaliaList) {

		// VARIABLES //

		String line = null;
		String[] data;

		// METHOD //

		while (scFile.hasNext()) {

			// CREATE NEW OBJECT TO INSERT VALUES FROM FILE //

			Animalia animalia = new Animalia();
			line = scFile.nextLine();
			data = line.split("::");

			// INSERTING VALUES //

			animalia.setIzena(data[0]);
			animalia.setEspeziea(data[1]);
			animalia.setAdina(Integer.parseInt(data[2]));

			// CREATE AN ARRAY TO SAVE THE SPLITTED VALUES FOR "HABITAT" //

			String[] habitat = { data[3], data[4], data[5] };
			animalia.setHabitat(habitat);

			// FINALLY ADD THE OBJECT TO THE ARRAY LIST //
			
			animaliaList.add(animalia);

		}

		System.out.println("Objetuak ondo sortu dira!!");

	}

	private static void menuaErakutsi() {
		
		// THE MAIN MENU OF THE APP //
		System.out.println();
		System.out.println("===================================================");
		System.out.println("   Ongi Etorri WildLife-era. Zer egin nahi duzu?   ");
		System.out.println("===================================================");
		System.out.println(" 1.- AUSAZKO BI ANIMALIREN DATUAK BISTARATU.");
		System.out.println(" 2.- BIZI IRAUPEN ALTUEN DUEN ANIMALIA BISTARATU.");
		System.out.println(" 3.- ANIMALI BATEN HABITAK BISTARATU");
		System.out.println(" 4.- IRTEN");
	}

	private static void animalienDatuakBistaratu(ArrayList<Animalia> animaliaList) {

		// VARIABLES //

		int animalia1 = (int) (Math.random() * 3);
		int animalia2 = (int) (Math.random() * 3);

		// METHOD //

			// WHILE LOOP TO DON'T HAVE THE SAME NUMBER AT THE SELECTED ANIMALS //

		while (animalia1 == animalia2) {

			animalia2 = (int) (Math.random() * 3);

		}
		
			// THE OUTPUT WITH THE RANDOM NUMBERS //
		
		System.out.println("Lehenengo Animalia");
		System.out.println(animaliaList.get(animalia1).toString());

		System.out.println();
		System.out.println("Bigarren Animalia");
		System.out.println(animaliaList.get(animalia2).toString());

	}

	private static String animaliZaharrenaBistaratu(ArrayList<Animalia> animaliaList) {

		// VARIABLES //

		String animaliZaharrena = null;
		int i = 0;
		int adinAltuena = Integer.MIN_VALUE;

		// METHOD //

		for (i = 0; i < animaliaList.size(); i++) {

			if (animaliaList.get(i).getAdina() > adinAltuena) {

				adinAltuena = animaliaList.get(i).getAdina();
				animaliZaharrena = animaliaList.get(i).getIzena();
			}
		}

		animaliZaharrena = animaliZaharrena.toUpperCase();
		
		return animaliZaharrena;
		
	}

	private static String animaliaEskatu(Scanner sc) {

		// VARIABLES //
		
		String eskaera = null;
		
		// METHOD //
		
		System.out.println("Idatzi animali bat.");
		eskaera = sc.nextLine();
		
		eskaera = eskaera.toUpperCase();
		
		return eskaera;

	}

	private static boolean animaliaKonprobatu(ArrayList<Animalia> animaliaList, String animalia) {

		// VARIABLES //

		int i = 0;

		// METHOD //

		for (i = 0; i < animaliaList.size(); i++) {

			if (animalia.equalsIgnoreCase(animaliaList.get(i).getIzena())) {

				return true;

			}
		}

		return false;

	}

	private static void habitatBistaratu(ArrayList<Animalia> animaliaList, String animalia) {

		// VARIABLES //

		int i = 0;

		// METHOD //

		for (i = 0; i < animaliaList.size(); i++) {

			if (animalia.equalsIgnoreCase(animaliaList.get(i).getIzena())) {

				System.out.println(animalia + " animaliaren habitat-ak hurrengoak dira:");
				System.out.println(Arrays.toString(animaliaList.get(i).getHabitat()));

			}
		}
	}
}