package UD2.jarduera2_3;

import java.util.Scanner;

public class Ariketa19 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		int erabZenbakia = 0;
		// Funtzio honen bidez 100 eta 0 artean dagoen zenbaki aleatorio bat ateratzen
		// dugu.
		int zenbakia = (int) Math.floor(Math.random() * 100 + 1);

		// Programa

		System.out.println("Zein uste duzu dekla zenbaki sekretua? (0 eta 100 artean dago)");
		erabZenbakia = scan.nextInt();
		
		while (erabZenbakia != zenbakia) {
			
			if (erabZenbakia < zenbakia) {

				System.out.println("Idatzi duzun zenbakia txikiagoa da zenbaki sekretua baino. Frogatu beste bat.");
				erabZenbakia = scan.nextInt();
				
			}
			
			if (erabZenbakia > zenbakia) {
				
				System.out.println("Idatzi duzun zenbakia handiagoa da zenbaki sekretua baino. Frogatu beste bat.");
				erabZenbakia = scan.nextInt();
			
			}
		}
		
		
		if (erabZenbakia == zenbakia) {
			
			System.out.println("Oso ondo zenbaki sekretua asmatu duzu!!");
			scan.close();
		}

	}

}
