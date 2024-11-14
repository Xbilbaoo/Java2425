package jarduera2_5;

import java.util.Scanner;

public class Ariketa5 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		Scanner scan = new Scanner(System.in);
		String[] izenaArrai = new String[5];
		String hasiera = "a";
		int i = 0;
		int j = 1;
		
		// Programa

		for (i = 0; i < izenaArrai.length; i++) {

			System.out.println("Idatzi arrai-ko " + i + " posizioan gorde nahi duzun izena.");
			izenaArrai[i] = scan.nextLine();
		}

		
		
		scan.close();
		System.out.println("Honek dira A letrarekin hasten diren izenak:");
		System.out.println();
		
		
		
		for (i = 0; i < izenaArrai.length; i++) {
			
			if (izenaArrai[i].toLowerCase().charAt(0) == hasiera.charAt(0)) {
				
				System.out.println(j + ". " + izenaArrai[i]);
				j ++;
			}
			
		}
	}

}
