package jarduera2_3;

import java.util.Scanner;

public class Ariketa16 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		Scanner scan = new Scanner (System.in);
		int i = 0;
		int z1 = 0;
		int handiena = Integer.MIN_VALUE;
		
		// Programa
		
		for (i = 1; i <= 10; i ++) {
			
			System.out.println("idatzi zenbaki bat");
			z1 = scan.nextInt();
			
			if (z1 > handiena) {
				
				handiena = z1;
	
			}
		}
		
		System.out.println("Idatzitako zenbakien arteko handiena, " + handiena + " da.");
		scan.close();

	}
}