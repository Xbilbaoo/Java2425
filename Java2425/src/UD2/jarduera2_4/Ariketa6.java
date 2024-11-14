package UD2.jarduera2_4;

import java.util.Scanner;

public class Ariketa6 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		Scanner scan = new Scanner (System.in);
		int i = 0;
		String esaldia1 = null;
		String hutsunea = " ";
		
		// Programa
		
		System.out.println("Idatzi esaldi bat. Programa honi esker zuriune guztiak kenduko dizkiot.");
		esaldia1 = scan.nextLine();
		
		for (i = 0; i < esaldia1.length(); i ++) {
			
			if (esaldia1.charAt(i) != hutsunea.charAt(0)) {
				
				System.out.print(esaldia1.charAt(i));
			}
		}
	}

}
