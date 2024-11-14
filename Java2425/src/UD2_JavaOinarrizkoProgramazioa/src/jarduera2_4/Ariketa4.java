package jarduera2_4;

import java.util.Scanner;

public class Ariketa4 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		Scanner scan = new  Scanner (System.in);
		String esaldia1 = null;
		int i = 0;
		
		// Programa
		
		System.out.println("Idatzi esaldi bat, alderatziz zelan idazten  den erakutsiko dizut.");
		esaldia1 = scan.nextLine();
		
		for (i = esaldia1.length() - 1; i >= 0; i --) {
			
			System.out.print(esaldia1.charAt(i));
		}
	}

}
