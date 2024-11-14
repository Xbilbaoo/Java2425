package UD2.jarduera2_2;

import java.util.Scanner;

public class Ariketa2 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		int zenbakia1 = 0;
		int zenbakia2 = 0;
		int handiena = Integer.MIN_VALUE;

		// Programa honek 2 zenbaki konparatzen ditu eta bihetatik handiena zehaztatzen
		// du.

		System.out
				.println("Bi zenbaki idatzi eta bihetatik zein den handiena esango dizut. Lehenego idati zenbaki bat.");
		zenbakia1 = scan.nextInt();

		System.out.println("Idatzi beste bat");
		zenbakia2 = scan.nextInt();

		while (zenbakia1 == zenbakia2) {

			System.out.println("zenbakia berdinak dira, ezin dira konparatu.");

			System.out.println("Idatzi zenbaki bat.");
			zenbakia1 = scan.nextInt();

			System.out.println("Idatzi beste bat.");
			zenbakia2 = scan.nextInt();

		}
		if (zenbakia1 > zenbakia2) {

			handiena = zenbakia1;

		} else if (zenbakia2 > zenbakia1) {

			handiena = zenbakia2;

		}

		System.out.println("Zenbaki handiena " + handiena + " da.");

		scan.close();
	}

}
