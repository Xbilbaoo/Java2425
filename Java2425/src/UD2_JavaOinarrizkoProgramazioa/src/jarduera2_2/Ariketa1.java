package jarduera2_2;

import java.util.Scanner;

public class Ariketa1 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		double nota = 0;
		
		// Programa honek nota bat gainditua edo ez den zehaztatzen du.
		
		System.out.println("zein da frogatu nahi duzun nota?");
		nota = scan.nextDouble();
		
		while (nota < 0 || nota > 10) {
			
			System.out.println("Sartu 0 eta 10 arteko balorea");
			nota = scan.nextDouble();

		}
		if (nota < 5) {
			
			System.out.println("Ez du gainditu");

		} else {
			
			System.out.println("Gainditu egin du");
		
		}
		scan.close();
	}

}
