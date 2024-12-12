package UD4.jarduera4_4;

// IMPORTED PACKAGES //

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// IMPORTED MODELS //

import UD4.jarduera4_4.models.Elikagaia;

public class NutriscoreAPP {

	public static void main(String[] args) throws IOException {

		// VARIABLES //

		File file = new File("./files/UD4/janariak.txt");
		Scanner scFile = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		String elikagaia = null;
		int aukera = 0;
		boolean elikagaiaDago = false;

		// CREATE AN ARRAYLIST FOR THE CLASS "ELIKAGAIAK" //

		ArrayList<Elikagaia> elikagaiList = new ArrayList<Elikagaia>();

		// THE PROGRAMM //

		arraiListaBete(file, scFile, elikagaiList);

		do {

			menuaErakutsi();
			aukera = Integer.parseInt(sc.nextLine());

			switch (aukera) {

			case 1:

				elikagaia = elikagaiaEskatu(sc);
				elikagaiaDago = elikagaiaKonprobatu(elikagaiList, elikagaia);

				if (elikagaiaDago == true) {

					datuakBistaratu(elikagaiList, elikagaia);
					break;

				} else {

					System.out.println("Idatzi duzun elikagaia ez dago gure datuen artean. Menura itzuliko zara.");
					break;
				}

			case 2:

				posiziokoDatuakIkusi(sc, elikagaiList);
				break;

			case 3:

				elikagaia = elikagaiaEskatu(sc);
				elikagaiaDago = elikagaiaKonprobatu(elikagaiList, elikagaia);

				if (elikagaiaDago == true) {

					kaloriakKalkulatu(sc, elikagaiList, elikagaia);
					break;

				} else {

					System.out.println("Idatzi duzun elikagaia ez dago gure datuen artean. Menura itzuliko zara.");
					break;
				}

			case 4:
				
				datuakGorde(file, elikagaiList);
				break;
			
			case 0:
				
				System.out.println("Eskerrik asko gure programa erabiltzeagaitik!!");
				break;
				
			default:
				
				System.out.println("Aukera hori ez dagu menuan.");
				break;
				
			}

		} while (aukera != 0);

		scFile.close();
		sc.close();
	}

	private static void arraiListaBete(File file, Scanner scFile, ArrayList<Elikagaia> elikagaiList) {

		// VARIABLES //

		String line = null;
		String[] data;

		// METHOD //
		
		while (scFile.hasNext()) {

			// SPLIT EACH LINE BY THE SEPARATOR OF THE FILE //

			line = scFile.nextLine();
			data = line.split(";");

			// CREATE A NEW OBJECT //

			Elikagaia elikagaia = new Elikagaia();

			// INSERT THE VALUES FROM THE FILE //

			elikagaia.setIzena(data[0]);
			elikagaia.setEgoera(data[1]);
			elikagaia.setKaloriak(Double.parseDouble(data[2]));
			elikagaia.setKoipeak(Double.parseDouble(data[3]));
			elikagaia.setProteinak(Double.parseDouble(data[4]));
			elikagaia.setKarbohidratoak(Double.parseDouble(data[5]));
			elikagaia.setMota(data[6]);

			// ADD THE CREATED OBJECT TO THE ARRAYLIST //

			elikagaiList.add(elikagaia);

		}

	}

	private static void menuaErakutsi() {

		// METHOD TO SHOW THE MAIN MENU //

		System.out.println();
		System.out.println("==================================================");
		System.out.println("  Ongi Etorri NutriScore-ra. Zer egin nhai duzu?  ");
		System.out.println("==================================================");
		System.out.println();
		System.out.println(" 1.- ELIKAGAI BATEN DATUAK BISTARATU.");
		System.out.println(" 2.- POSIZIOAREN ARABERA DATUAK IKUSI.");
		System.out.println(" 3.- ELIKAGAI BATEN KALORIAK KALKULATU.");
		System.out.println(" 4.- DATUAK GORDE.");
		System.out.println(" 0.- IRTEN.");

	}

	private static String elikagaiaEskatu(Scanner sc) {

		// VARIABLES //

		String eskaera = null;

		// METHOD //

		System.out.println("Idatzi elikagai bat.");
		eskaera = sc.nextLine();
		
		eskaera = eskaera.toUpperCase();

		return eskaera;

	}

	private static boolean elikagaiaKonprobatu(ArrayList<Elikagaia> elikagaiList, String elikagaia) {

		// VARIABLES //

		int i = 0;

		// METHOD //

		for (i = 0; i < elikagaiList.size(); i++) {

			if (elikagaia.equalsIgnoreCase(elikagaiList.get(i).getIzena())) {

				return true;

			}
		}

		return false;
	}

	private static void datuakBistaratu(ArrayList<Elikagaia> elikagaiList, String elikagaia) {

		// VARIABLES //

		int i = 0;

		// METHOD //

		for (i = 0; i < elikagaiList.size(); i++) {

			if (elikagaia.equalsIgnoreCase(elikagaiList.get(i).getIzena())) {

				System.out.println(elikagaiList.get(i).toString());

			}
		}

	}

	private static void posiziokoDatuakIkusi(Scanner sc, ArrayList<Elikagaia> elikagaiList) {

		// VARIABLES //

		int i = 0;
		int elikagaiKokapena = 0;
		int balioKokapena = 0;

		// METHOD //

		System.out.println("Zein kokapeneko elikagaia aukeratu nahi duzu? 1 - " + (elikagaiList.size())
				+ " artekoa izan behar da.");
		elikagaiKokapena = Integer.parseInt(sc.nextLine());

		while (elikagaiKokapena < 1 || elikagaiKokapena > elikagaiList.size()) {

			System.out.println("Zein kokapeneko elikagaia aukeratu nahi duzu? 1 - " + (elikagaiList.size())
					+ " artekoa izan behar da.");
			elikagaiKokapena = Integer.parseInt(sc.nextLine());

		}

		elikagaiKokapena--;

		do {
			balioMenuaErakutsi();
			balioKokapena = Integer.parseInt(sc.nextLine());

			switch (balioKokapena) {

			case 1:

				System.out.println(elikagaiList.get(elikagaiKokapena).getIzena());
				break;

			case 2:

				System.out.println(elikagaiList.get(elikagaiKokapena).getEgoera());
				break;

			case 3:

				System.out.println(elikagaiList.get(elikagaiKokapena).getKaloriak());
				break;

			case 4:

				System.out.println(elikagaiList.get(elikagaiKokapena).getKoipeak());
				break;

			case 5:

				System.out.println(elikagaiList.get(elikagaiKokapena).getProteinak());
				break;

			case 6:

				System.out.println(elikagaiList.get(elikagaiKokapena).getKarbohidratoak());
				break;

			case 7:

				System.out.println(elikagaiList.get(elikagaiKokapena).getMota());
				break;

			default:

				System.out.println("Aukera hori ez dago menuan. Menu printzipalera itzuliko zara.");
				break;

			}
		} while (balioKokapena != 1 && balioKokapena != 2 && balioKokapena != 3 && balioKokapena != 4
				&& balioKokapena != 5 && balioKokapena != 6 && balioKokapena != 7);

	}

	private static void balioMenuaErakutsi() {

		// METHOD TO SHOW A SUB MENU //

		System.out.println();
		System.out.println("===============================");
		System.out.println("  Zein balio ikusi nahi duzu?  ");
		System.out.println("===============================");
		System.out.println();
		System.out.println(" 1.- IZENA.");
		System.out.println(" 2.- EGOERA.");
		System.out.println(" 3.- KALORIAK");
		System.out.println(" 4.- KOIPEAK");
		System.out.println(" 5.- PROTEINAK.");
		System.out.println(" 6.- KARBOHIDRATOAK.");
		System.out.println(" 7.- MOTA.");

	}

	private static void kaloriakKalkulatu(Scanner sc, ArrayList<Elikagaia> elikagaiList, String elikagaia) {

		// VARIABLES //

		String egoera;
		int i = 0;
		double pisua = 0;
		double kaloriaKalkulatuak = 0;
		boolean egoeraDago = false;

		// METHOD //

		egoera = egoeraEskatu(sc, elikagaiList, elikagaia);
		egoeraDago = egoeraKonprobatu(elikagaiList, elikagaia, egoera);

		if (egoeraDago == true) {

			System.out.println("Zenbat pisu du " + elikagaia + " (" + egoera + ")" + " elikagaiak? (Gramoetan idatzi)");
			pisua = Double.parseDouble(sc.nextLine());

			for (i = 0; i < elikagaiList.size(); i++) {

				if (elikagaia.equalsIgnoreCase(elikagaiList.get(i).getIzena())) {

					kaloriaKalkulatuak = elikagaiList.get(i).getKaloriak() * pisua / 100;

				}

			}

			System.out.println("Emandako datuekin hauek dira kalkulatutako kaloriak: " + kaloriaKalkulatuak + " kcal.");

		} else {

			System.out.println(elikagaia + " elikagaiak ez du egoera hau gure datuen artean.");
		}

	}

	private static String egoeraEskatu(Scanner sc, ArrayList<Elikagaia> elikagaiList, String elikagaia) {

		// VARIABLES //

		String egoera = null;
		int i = 0;
		int k = 1;
		
		// METHOD //

		System.out.println(elikagaia + " elikagaiaren zein egoeraren kaloriak kakulatu nahi dituzu?");
		
		for (i = 0; i < elikagaiList.size(); i ++) {
			
			if (elikagaia.equalsIgnoreCase(elikagaiList.get(i).getIzena())) {
				
				System.out.println( k + ".- " + elikagaiList.get(i).getEgoera());
				k ++;
				
			}
			
		}
		
		egoera = sc.nextLine();

		egoera = egoera.toUpperCase();

		return egoera;

	}

	private static boolean egoeraKonprobatu(ArrayList<Elikagaia> elikagaiList, String elikagaia, String egoera) {

		// VARIABLES //

		int i = 0;

		// METHOD //

		for (i = 0; i < elikagaiList.size(); i++) {

			if (elikagaia.equalsIgnoreCase(elikagaiList.get(i).getIzena())
					&& egoera.equalsIgnoreCase(elikagaiList.get(i).getEgoera())) {

				return true;

			}

		}

		return false;

	}

	private static void datuakGorde(File file, ArrayList<Elikagaia> elikagaiList) {
		
		// VARIABLES //
		
		int i = 0;
		
		// TRY-CATCH METHOD TO SAVE THE DATA TO THE FILE // 
		
		try {
			
			PrintWriter pw = new PrintWriter(file);

			for (i = 0; i < elikagaiList.size(); i++) {

				pw.println(elikagaiList.get(i).saveData());

			}

			pw.close();
		
		} catch (FileNotFoundException e) {

			System.out.println("Datuek ez dira ondo gorde!!");
			
		}
		
		System.out.println("Datuak ondo gorde dira!!");

		
		
	}
}
