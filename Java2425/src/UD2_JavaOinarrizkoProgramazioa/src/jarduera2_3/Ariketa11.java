package jarduera2_3;

import java.util.Scanner;

public class Ariketa11 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		int zenbakia1 = 0;
		int i = 0;
		Scanner scan = new Scanner (System.in);
		
		// Programa
		
		System.out.println("Idatzi zenbaki bat. Sartutako zenbakiaren arabera asteriskoak agertuko dira.");
		zenbakia1 = scan.nextInt();
		
		for (i = 0; i <= zenbakia1; i ++) {
			
			System.out.print("*");
			
		}
		
		scan.close();
		
	}

}
