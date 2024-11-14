package UD2.jarduera2_4;

import java.util.Scanner;

public class Ariketa5 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		Scanner scan = new Scanner(System.in);
		String esaldia1 = null;
		int i = 0;
		int j = 0;
		boolean palindromo = false;
		
		// Programa
		
		System.out.println("Idatzi esaldi bat, palindromoa edo ez esango dizut.");
		esaldia1 = scan.nextLine();
		esaldia1 = esaldia1.toLowerCase();
		
		// palindromoa edo ez den jakiteko funtzioa
		
		for (i = esaldia1.length() - 1; i >= 0; i --) {
			
			
			if (esaldia1.charAt(i) ==  esaldia1.charAt(j)) {
				
				palindromo = true;
				
			}
			
			j ++;
			
		}
		
		// Boolean balore bati esker palindromo den edo ez jakiko dugu.
		
		if (palindromo == true)  {
			
			System.out.println("Zure esaldia palindromoa da.");
			
		} else {
			
			System.out.println("Zure esaldia ez da palindromoa.");
			
		}
		
	}

}
