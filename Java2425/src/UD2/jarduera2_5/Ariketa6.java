package UD2.jarduera2_5;

import java.util.Scanner;

public class Ariketa6 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		String[] izenaArrai = new String[5];
		String izenaEskatu = null;
		int i = 0;
		int posizioa = 0;
		boolean dago = false;

		// Programa

		for (i = 0; i < izenaArrai.length; i++) {

			System.out.println("Idatzi arrai-ko " + (i + 1) + " posizioan gorde nahi duzun izena.");
			izenaArrai[i] = scan.nextLine();
		}

		
		
		System.out.println();
		System.out.println("Idatzi izen bat. Arrai-an dagoen edo ez frogatuko dut.");
		izenaEskatu = scan.nextLine();
		scan.close();

		for (i = 0; i < izenaArrai.length; i++) {
			
			if (izenaArrai[i].equalsIgnoreCase(izenaEskatu)) {
				
				dago = true;
				posizioa = i + 1;
			}
		}
		
		if (dago == true) {
			
			System.out.println("Idatzi duzun izena arrai-ean dago, " + posizioa + ".garren posizioan.");
		} else {
			
			System.out.println("Idatzi duzun izena ez dago arrai-ren barruan");
		}
	}

}
