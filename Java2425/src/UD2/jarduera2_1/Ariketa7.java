package UD2.jarduera2_1;

import java.util.Scanner;

public class Ariketa7 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		double karratuAldea = 0;
		double azalera = 0;

		// Programa honek karratu baten azalera kalkulatzen du.

		System.out.println("Zenbat metro ditu zure karratuaren aldeak?");
		karratuAldea = scan.nextDouble();
		azalera = karratuAldea * karratuAldea;
		System.out.println("Zure karratuak azalera hau du: " + azalera);
		scan.close();
	}
}
