package UD3.jarduera3_3;

import java.io.*;
import java.util.Scanner;

public class Nutriscore {

	public static void main(String[] args) throws IOException {

		// Aldagaiak

		File file = new File("./files/UD3/janariak.txt");
		Scanner scFile = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		int kopurua = lerroakKontatu(scFile);
		int aukera = 0;
		boolean elikagaiaDago = false;
		String[] izenak = new String[kopurua];
		String[] egoerak = new String[kopurua];
		String[] motak = new String[kopurua];
		String elikagaia = null;
		double[] kaloriak = new double[kopurua];
		double[] koipeak = new double[kopurua];
		double[] proteinak = new double[kopurua];
		double[] karbohidratoak = new double[kopurua];

		datuakKargatu(file, izenak, egoerak, motak, kaloriak, koipeak, proteinak, karbohidratoak);

		do {
			menuaErakutsi();
			aukera = sc.nextInt();

			switch (aukera) {

			case 1:

				elikagaia = elikagaiaEskatu();
				elikagaiaDago = elikagaiaKonprobatu(izenak, elikagaia);

				if (elikagaiaDago == true) {

					motaBerberekoakBistaratu(izenak, motak, elikagaia);

				} else {

					System.out.println("Aukeratu duzun elikagaia ez dago gure datuen arnten. Menura itzuliko zara.");
					System.out.println();

				}

				break;

			case 2:

				elikagaia = elikagaiaEskatu();
				elikagaiaDago = elikagaiaKonprobatu(izenak, elikagaia);

				if (elikagaiaDago == true) {

					System.out.println(
							elikagaia.toUpperCase() + " elikagaiaren motako kaloria batazbestekoa hurrengoa da: "
									+ kalorienBatazbestekoaKalkulatu(izenak, motak, kaloriak, elikagaia));
					System.out.println();

				} else {

					System.out.println("Aukeratu duzun elikagaia ez dago gure datuen arnten. Menura itzuliko zara.");
					System.out.println();
			

				}

				break;

			case 3:

				elikagaia = elikagaiaEskatu();
				elikagaiaDago = elikagaiaKonprobatu(izenak, elikagaia);

				if (elikagaiaDago == true) {

					System.out.println(elikagaia.toUpperCase() + " mota berbero elikagai kopurua hurrengoa da: "
							+ motaBerberekoElikagaiakKontatu(izenak, motak, elikagaia));
					
				} else {
					
					System.out.println("Aukeratu duzun elikagaia ez dago gure datuen arnten. Menura itzuliko zara.");
					System.out.println();

				}
				
				break;
			}
		} while (aukera != 0);

	}

	private static int lerroakKontatu(Scanner scFile) throws IOException {

		int i = 0;

		while (scFile.hasNext()) {

			scFile.nextLine();
			i++;

		}

		System.out.println("Lerroak Kontatuta!! " + i);
		return i;
	}

	private static void datuakKargatu(File file, String[] izenak, String[] egoerak, String[] motak, double[] kaloriak,
			double[] koipeak, double[] proteinak, double[] karbohidratoak) throws IOException {

		int i = 0;
		Scanner scFile2 = new Scanner(file);
		String lerroa = null;
		String[] zatiak;

		while (scFile2.hasNext()) {

			lerroa = scFile2.nextLine();
			zatiak = lerroa.split(";");
			izenak[i] = zatiak[0];
			egoerak[i] = zatiak[1];
			kaloriak[i] = Double.parseDouble(zatiak[2]);
			koipeak[i] = Double.parseDouble(zatiak[3]);
			proteinak[i] = Double.parseDouble(zatiak[4]);
			karbohidratoak[i] = Double.parseDouble(zatiak[5]);
			motak[i] = zatiak[6];
			i++;
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

	private static String elikagaiaEskatu() {

		Scanner sc = new Scanner(System.in);
		String eskaera = null;

		System.out.println("Idatzi elikagai bat.");
		eskaera = sc.nextLine();

		return eskaera;

	}

	private static boolean elikagaiaKonprobatu(String[] elikagaiak, String elikagaiHautatua) {

		Scanner sc = new Scanner(System.in);
		int i = 0;
		boolean badago = false;

		for (i = 0; i < elikagaiak.length; i++) {

			if (elikagaiHautatua.equalsIgnoreCase(elikagaiak[i])) {

				badago = true;
				return badago;
			}

		}

		return badago;

	}

	private static void motaBerberekoakBistaratu(String[] elikagaiak, String[] motak, String elikagaia) {

		String[] motaBerberekoElikagaiak;
		String elikagaiMota = null;

		int i = 0;
		int j = 0;
		int kopurua = 1;

		// Hautatutako elikagaiaren mota topatu

		for (i = 0; i < elikagaiak.length; i++) {

			if (elikagaia.equalsIgnoreCase(elikagaiak[i])) {

				elikagaiMota = motak[i];

			}
		}

		for (i = 0; i < elikagaiak.length; i++) {

			if (elikagaiMota.equalsIgnoreCase(motak[i])) {

				kopurua++;

			}
		}

		motaBerberekoElikagaiak = new String[kopurua - 1];

		for (i = 0; i < elikagaiak.length; i++) {

			if (elikagaiMota.equalsIgnoreCase(motak[i])) {

				motaBerberekoElikagaiak[j] = elikagaiak[i];
				j++;

			}

		}

		System.out.println("Hauek dira " + elikagaia.toUpperCase() + " elikagaiaren mota berbereko elikagaiak:");
		System.out.println(motaBerberekoElikagaiak[0]);

		for (i = 1; i < motaBerberekoElikagaiak.length; i++) {

			if (motaBerberekoElikagaiak[i].equalsIgnoreCase(motaBerberekoElikagaiak[i - 1]) == false) {

				System.out.println(motaBerberekoElikagaiak[i]);

			}
		}
	}

	private static double kalorienBatazbestekoaKalkulatu(String[] elikagaiak, String[] motak, double[] kaloriak,
			String elikagaia) {

		String elikagaiMota = null;
		double kaloriaTotalak = 0;
		double kaloriaBatazbestekoa = 0;
		int i = 0;
		int kont = 0;

		for (i = 0; i < elikagaiak.length; i++) {

			if (elikagaia.equalsIgnoreCase(elikagaiak[i])) {

				elikagaiMota = motak[i];

			}
		}

		for (i = 0; i < elikagaiak.length; i++) {

			if (elikagaiMota.equalsIgnoreCase(motak[i])) {

				kaloriaTotalak += kaloriak[i];
				kont++;

			}

		}

		kaloriaBatazbestekoa = kaloriaTotalak / kont;

		return kaloriaBatazbestekoa;

	}

	private static int motaBerberekoElikagaiakKontatu(String[] elikagaiak, String[] motak, String elikagaia) {

		int i = 0;
		int kopurua = 0;
		String elikagaiMota = null;

		for (i = 0; i < elikagaiak.length; i++) {

			if (elikagaia.equalsIgnoreCase(elikagaiak[i])) {

				elikagaiMota = motak[i];

			}
		}

		for (i = 0; i < elikagaiak.length; i++) {

			if (elikagaiMota.equalsIgnoreCase(motak[i])) {

				kopurua++;

			}
		}

		return kopurua;
	}
}
