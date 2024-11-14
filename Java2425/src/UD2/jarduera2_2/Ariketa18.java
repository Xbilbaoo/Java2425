package UD2.jarduera2_2;

import java.util.Scanner;

public class Ariketa18 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		int zenbakia1 = 0;

		// Programa

		System.out.println("--Menua--");
		System.out.println("1. Zerrenda ikusi");
		System.out.println("2. Elementua sartu");
		System.out.println("3. Elementua ezabatu");
		System.out.println("4. Irten");
		System.out.println("Zer nahi duzu egin (zerrendako zenbakia)?");

		zenbakia1 = scan.nextInt();

		if (zenbakia1 == 1) {

			System.out.println("Zerrenda ikusi");

		} else if (zenbakia1 == 2) {

			System.out.println("Elementua sartu");

		} else if (zenbakia1 == 3) {

			System.out.println("Elementua ezabatu");

		} else if (zenbakia1 == 4) {

			System.out.println("Irten");

		} else {

			System.out.println("ERROR");

		}
		
		scan.close();
		
	}

}
