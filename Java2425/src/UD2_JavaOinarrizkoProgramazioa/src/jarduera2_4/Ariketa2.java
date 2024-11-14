package jarduera2_4;

import java.util.Scanner;

public class Ariketa2 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		String esaldia1 = null;
		String esaldia2 = " ";
		int i = 0;

		// Programa

		System.out.println("Idatzi esaldi bat eta esaldiko hitz bakoitzeko, karaktere bat erakutziko dizut.");
		esaldia1 = scan.nextLine();
		
		System.out.println(esaldia1.charAt(0));
		
		for (i = 0; i < esaldia1.length(); i++) {
			
			if (esaldia1.charAt(i) == esaldia2.charAt(0)) {
				
				System.out.println(esaldia1.charAt(i +1));
				
			}
			
		}
	}
}
