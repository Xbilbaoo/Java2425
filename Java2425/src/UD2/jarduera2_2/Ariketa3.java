package UD2.jarduera2_2;

import java.util.Scanner;

public class Ariketa3 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		int zenbakia1 = 0;

		// Programa honek erabiltzaileak emandako zenbakia, negatiboa, 0 edo positiboa
		// den zehazten du.

		System.out.println("Idatzi zenbaki bat. 0, negatibo edo positibo den adieraziko dizut");
		zenbakia1 = scan.nextInt();

		if (zenbakia1 < 0) {

			System.out.println("Zure zenbakia negatiboa da.");

		} else if (zenbakia1 == 0) {

			System.out.println("Zure zenbakia 0 da.");

		} else {

			System.out.println("Zure zenbakia positiboa da.");

		}
		
		scan.close();

	}
}
