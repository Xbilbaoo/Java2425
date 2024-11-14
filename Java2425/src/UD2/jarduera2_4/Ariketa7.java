package UD2.jarduera2_4;

import java.util.Scanner;

public class Ariketa7 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		String esaldia1 = null;
		String bokalak = "aeiou";
		int i = 0;
		int bokalKopurua = 0;
		int konsonanteKopurua = 0;

		// Programa

		System.out.println("Idatzi esaldi bat. Bokal kopuru eta konsonate kopurua kontatuko ditut.");
		esaldia1 = scan.nextLine();
		esaldia1 = esaldia1.replace(" ", "");
		esaldia1 = esaldia1.toLowerCase();

		for (i = 0; i < esaldia1.length(); i++) {

			if (esaldia1.charAt(i) == bokalak.charAt(0) || esaldia1.charAt(i) == bokalak.charAt(1)
					|| esaldia1.charAt(i) == bokalak.charAt(2) || esaldia1.charAt(i) == bokalak.charAt(3)
					|| esaldia1.charAt(i) == bokalak.charAt(4)) {

				bokalKopurua ++;
				
			} else {

				konsonanteKopurua++;

			}
						
		}
		
		System.out.println("Zure esaldiak " + bokalKopurua + " bokal ditu. Eta " + konsonanteKopurua + " konsonante ditu.");

	}
}
