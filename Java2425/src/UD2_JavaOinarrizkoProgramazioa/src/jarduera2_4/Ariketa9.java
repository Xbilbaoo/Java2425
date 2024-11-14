package jarduera2_4;

import java.util.Scanner;

public class Ariketa9 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		Scanner scan = new Scanner (System.in);
		String esaldia1 = null;
		String[]zatiak = null;
		String hitzBerria = null;
		int i = 0;
		int hitzAldaketa = 0;
		
		
		// Programa
		
		System.out.println("idatzi esaldi bat.");
		esaldia1 = scan.nextLine();
		
		for (i = 0; i < esaldia1.length(); i ++) {
			
			zatiak = esaldia1.split(" ");
		}
			
		for (i = 0; i < zatiak.length; i ++) {
				
			System.out.println("hau da " + i + " posizioko hitza: " + zatiak [i]);
			
		}
		
		
		
		do {
			System.out.println("Zein posizioko hitza aldatu nahi duzu?");
			hitzAldaketa = scan.nextInt();
		}
		while (hitzAldaketa < 0 || hitzAldaketa > zatiak.length - 1);

		System.out.println("Zein da zure hitz berria?");
		hitzBerria = scan.next();
		 
		zatiak[hitzAldaketa] = hitzBerria;
		
		for (i = 0; i < zatiak.length; i ++) {
			
			System.out.print(zatiak[i] + " ");
			
		}
		
	}

}
