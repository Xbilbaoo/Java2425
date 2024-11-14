package jarduera2_3;

import java.util.Scanner;

public class Ariketa12 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		int i = 0;
		int z1 = 0;
		int emaitza = 0;
		Scanner scan = new Scanner (System.in);
		
		// Programa
		
		System.out.println("Idatzi zenbaki bat. Bere biderkatze taula erakutsiko dizut (1-etik 10-era).");
		z1 = scan.nextInt();
		scan.close();
		
		for (i = 1; i <= 10; i ++) {
			
			emaitza = z1 * i;
			
			System.out.println(emaitza + " = " + z1 + " * " + i);
			
		}
	}

}
