package UD2.jarduera2_2;

import java.util.Scanner;

public class Ariketa5 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		int zenbakia1 = 0;

		// Programa honek zenbaki bat 0 eta 10 artean ( biak barne ) dagoen zehaztatzen
		// du.

		System.out.println("Idatzi zenbakia bat. 0 eta 10 arten dagoen esango dizut.");
		zenbakia1 = scan.nextInt();

		if (zenbakia1 >= 0 && zenbakia1 <= 10) {

			System.out.println("Zenbakia 10 eta 0 artean dago.");

		} else {

			System.out.println("Zenbakia ez dago 10 eta 0 artean.");

		}
		scan.close();
	}

}
