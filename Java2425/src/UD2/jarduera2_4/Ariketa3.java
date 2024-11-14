package UD2.jarduera2_4;

import java.util.Scanner;

public class Ariketa3 {

	public static void main(String[] args) {
		
		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		String esaldia1 = null;
		int i = 0;

		// Programa

		System.out.println("Idatzi esaldi bat eta esaldiko karaktereak erakutziko dizkizut.");
		esaldia1 = scan.nextLine();

		for (i = 0; i < esaldia1.length(); i++) {
						
			System.out.println(esaldia1.charAt(i));
					
		}
	}

}
