package UD2.jarduera2_5;

import java.util.Scanner;

public class Ariketa4 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		String[] hitzArrai = new String[5];
		int i = 0;

		// Programa

		for (i = 0; i < hitzArrai.length; i++) {

			System.out.println("Idatzi arrai-ko " + i + " posizioan gorde nahi duzun hitza.");
			hitzArrai[i] = scan.nextLine();
		}
		for (i = 0; i < hitzArrai.length; i++) {

			System.out.println(i + " posizioan dagoen hitza, " + hitzArrai[i] + " da.");
		}

		scan.close();

	}

}