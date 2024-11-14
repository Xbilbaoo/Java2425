package jarduera2_3;

import java.util.Scanner;

public class Ariketa23 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		int i = 0;
		int z1 = 0;
		boolean lehena = true;
		Scanner scan = new Scanner (System.in);
		
		
		// Programa
		
		System.out.println("Idatzi zenbaki bat. Lehena den frogatuko dut.");
		z1 = scan.nextInt();
		scan.close();
		
		for (i = 2; i < z1; i ++) {
			
			if (z1 % i == 0) {
				
				lehena = false;
				
			}
		}
		
		if (lehena == true) {
			
			System.out.println("Zenbakia lehena da.");
			
		} else {
			
			System.out.println("Zenbakia ez da lehena");

		}
	}

}
