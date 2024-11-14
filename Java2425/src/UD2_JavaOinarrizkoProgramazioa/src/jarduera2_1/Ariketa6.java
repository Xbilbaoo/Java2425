package jarduera2_1;

import java.util.Scanner;

public class Ariketa6 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		int zenbakia1 = 0;
		double farenheit;

		// Programa honek erabiltzaileak Cº emandako temperatura,
		// Fº-etara aldatu eta pantailatik erakusten du.

		System.out.println("Zenbat gradu Cª egiten ditu orain?");
		zenbakia1 = scan.nextInt();
		farenheit = (zenbakia1 * 1.8 + 32);
		System.out.println("Fº graduetan, " + farenheit + " gradu daude orain.");
		scan.close();
	}

}
