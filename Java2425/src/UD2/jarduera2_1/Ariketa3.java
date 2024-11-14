package UD2.jarduera2_1;

import java.util.Scanner;

public class Ariketa3 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner sc = new Scanner(System.in);
		String izena;

		/*
		 * Programa honen bidez izena eskatu eta gero pantailatik erakutsiko dizu.
		 */

		System.out.println("Zein da zure izena?");
		izena = sc.nextLine();
		System.out.println("Zure izena " + izena + " da.");
		sc.close();
	}
}
