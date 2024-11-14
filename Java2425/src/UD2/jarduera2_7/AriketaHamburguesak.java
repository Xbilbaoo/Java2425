package UD2.jarduera2_7;

import java.util.Scanner;

public class AriketaHamburguesak {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] izena = { "Mexicano", "Alioli", "CheeseBurger", "Barbacoa" };
		String[] ingredienteak = { "carne , tomate, picante, pimiento", "carne, lechuga, bacon, alioli",
				"carne,  cebolla, cheddar, lechuga, tomate, mahonesa",
				"carne, bacon, cebolla,cheddar, lechuga,tomate, mayonesa,barbacoa" };
		String[] osagaiaBai = new String[0];
		String eskaeraHamburgesa = null;
		String baiEz = null;
		String osagaia = null;
		double[] prezioa = { 8.50, 11, 12.50, 14 };
		double prezioTotal = 0;
		int[] stock = { 12, 8, 23, 15 };
		int merkea = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int aukera = 0;
		int eskaeraKant = 0;
		int hamburgesaHautatua = 0;
		int stockKendu = 0;
		int stockTotal = 0;
		int pertsonaJan = 0;
		int hamburgesaPertsona = 0;
		int hamburgesaSoberan = 0;
		boolean osagaiaBadago = false;

		do {

			System.out.println("---------------------------------------------");
			System.out.println("Ongi etorri DaBurger-era. Zer egin nahi duzu?");
			System.out.println("---------------------------------------------");
			System.out.println("1. ESKAERA");
			System.out.println("2. HANBURGESARIK MERKEENA");
			System.out.println("3. HANBURGESA BATEN INFORMAZIOA EMAN");
			System.out.println("4. INGREDIENTEAK BILATU");
			System.out.println("5. STOCK-A TXIKITU");
			System.out.println("6. HANBURGESAK PERTSONAKO");
			System.out.println("7. IRTEN");
			aukera = sc.nextInt();

			switch (aukera) {

			
			
			
			
			case 1:

				System.out.println("Zein hamburguesako eskaria egin nahi duzu?");
				
				for (i = 0; i < izena.length; i++) {

					System.out.println((i + 1) + ".- " + izena[i]);
					
				}

				eskaeraHamburgesa = sc.next();

				
				
				hamburgesaEskatu(izena, eskaeraHamburgesa, baiEz, stock, eskaeraKant, hamburgesaHautatua, prezioa,
						prezioTotal);

				break;

			
			
			
			
			case 2:

				System.out.println("Gure kartako hamburgesa merkeena " + izena[merkeenaKalkulatu(prezioa, merkea)]
						+ " da, eta " + prezioa[merkeenaKalkulatu(prezioa, merkea)] + "€ balio ditu.");
				
				break;

			case 3:

				
				System.out.println("Zein hamburguesaren informazioa jakin nahi duzu?");
				for (i = 0; i < izena.length; i++) {

					System.out.println((i + 1) + ".- " + izena[i]);
				}

				eskaeraHamburgesa = sc.next();
				
				informazioaBistaratu (izena, ingredienteak, eskaeraHamburgesa, prezioa, stock);
				
				break;

			case 4:

				System.out.println("Zer osagai topatu nahi duzu?");
				osagaia = sc.next();

				for (i = 0; i < ingredienteak.length; i++) {

					if (ingredienteak[i].toUpperCase().contains(osagaia.toUpperCase())) {

						j++;

					}

				}

				osagaiaBai = new String[j];

				for (i = 0; i < izena.length; i++) {

					if (ingredienteak[i].toUpperCase().contains(osagaia.toUpperCase())) {

						osagaiaBai[k] = izena[i];
						k++;
						osagaiaBadago = true;

					}

				}

				if (osagaiaBadago == true) {

					System.out.println("BAI, ingrediente hori duten hanburgesak daude, eta honakoak dira:");

					for (i = 0; i < osagaiaBai.length - 1; i++) {

						System.out.print(osagaiaBai[i] + ", ");

					}

					System.out.println("eta " + osagaiaBai[j - 1]);
				} else {

					System.out.println("Ez daude hamburgesak sartu duzun osagaiarekin.");

				}

				break;

			case 5:

				System.out.println("Zein hamburguesaren informazioa jakin nahi duzu?");

				for (i = 0; i < izena.length; i++) {

					System.out.println((i + 1) + ".- " + izena[i]);
				}

				eskaeraHamburgesa = sc.next();

				System.out.println("Eta zenbateko stock-a kendu nahi duzu?");
				stockKendu = sc.nextInt();

				for (i = 0; i < stock.length; i++) {

					if (stock[i] == 0) {

						System.out.println("Ezin da " + eskaeraHamburgesa.toUpperCase()
								+ " hamburgesak 0-ko stock-a du. Ezin duzu stock negatiboa izan.");

					} else {

						stock[i] -= stockKendu;

						System.out.println("Stock-a txikitu egin da. Orain " + eskaeraHamburgesa.toUpperCase()
								+ " hamburgesaren stock-a " + stock[i] + " da.");

					}
				}

			case 6:

				for (i = 0; i < stock.length; i++) {

					stockTotal += stock[i];

				}

				System.out.println(
						"Zenbat pertsona zarete jateko? Zenbat hamburguesa diren pertsona bakoitzeko esango dizuet.");
				pertsonaJan = sc.nextInt();

				hamburgesaPertsona = stockTotal / pertsonaJan;
				hamburgesaSoberan = stockTotal % pertsonaJan;

				System.out.println("Pertsona bakoitzak, " + hamburgesaPertsona + " hamburgesa jango ditu. Eta "
						+ hamburgesaSoberan + " hamburgesa soberan edukiko dituzue.");

				break;

			case 7:

				System.out.println("Eskerrik asko DaBurger aukeratzeagaitik!! Laster arte!!");

				break;

			}

		} while (aukera != 7);

		sc.close();
	}

	public static void hamburgesaEskatu(String[] izena, String eskaeraHamburgesa, String baiEz, int[] stock,
			int eskaeraKant, int hamburgesaHautatua, double[] prezioa, double prezioTotal) {

		Scanner sc = new Scanner(System.in);
		int i = 0;

		for (i = 0; i < izena.length; i++) {

			if (eskaeraHamburgesa.toLowerCase().equals(izena[i].toLowerCase())) {

				System.out.println("Zenbat eskatu nahi dituzu?");

				eskaeraKant = sc.nextInt();

				if (eskaeraKant > stock[i]) {

					System.out.println("Ez ditugu hainbeste " + eskaeraHamburgesa + " hamburgesa stock-ean. Bakarrik "
							+ stock[i] + " ditugu salgai. Nahi dituzu dauden guztiak bai ala ez?");
					baiEz = sc.next();

					if (baiEz.toLowerCase().equals("bai")) {

						prezioTotal = prezioa[i] * stock[i];
						hamburgesaHautatua = i;

						System.out.println("Zure eskariaren prezioa hurrengoa da:");
						System.out.println(
								stock[i] + " hamburgesa " + izena[hamburgesaHautatua] + " - " + prezioTotal + "€");
						stock[i] = 0;

					}

				} else {

					prezioTotal = prezioa[i] * eskaeraKant;
					hamburgesaHautatua = i;

					System.out.println("Zure eskariaren prezioa hurrengoa da:");
					System.out.println(
							eskaeraKant + " hamburgesa " + izena[hamburgesaHautatua] + " - " + prezioTotal + "€");

				}
			}
		}
	}

	public static int merkeenaKalkulatu(double[] prezioak, int merkeena) {

		double prezioBajuena = Integer.MAX_VALUE;
		int i = 0;

		for (i = 0; i < prezioak.length; i++) {

			if (prezioak[i] < prezioBajuena) {

				prezioBajuena = prezioak[i];
				merkeena = i;

			}
		}

		return merkeena;

	}

	public static void informazioaBistaratu(String[] izena, String[] osagaiak, String hamburgesaInfo, double[] prezioa, int[] stock) {
		
		int i = 0;
		for (i = 0; i < izena.length; i++) {

			if (hamburgesaInfo.toUpperCase().equals(izena[i].toUpperCase())) {

				System.out.println(izena[i] + " hamburgesaren osagaiak " + osagaiak[i] + " dira. "
						+ stock[i] + " ditugu salgai.");
			}
		}
	}
	
	
}