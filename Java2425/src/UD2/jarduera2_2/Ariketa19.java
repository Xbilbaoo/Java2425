package UD2.jarduera2_2;

import java.util.Scanner;

public class Ariketa19 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		Scanner scan = new Scanner(System.in);
		double nota = 0;
		int saiakera = 9;
		boolean notaZuzena = true;
		
		// Programa
		
		System.out.println("Sartu zehaztu nahi duzun nota.");
		nota = scan.nextDouble();
		
		// While honen bidez erabiltzaileari saiakera kopuru finko bat zehaztatzen diogu
		
			while ((nota < 1 || nota > 10) && saiakera > 0) {
				System.out.println("Error, " + saiakera + " geratzen zaizkizu.");
				saiakera --;
				
				System.out.println("Sartu zehaztu nahi duzun nota.");
				nota = scan.nextDouble();
				
				if (saiakera <= 0) {
					
					notaZuzena = false;
					
				} 
			}
			
			if (notaZuzena = true) {
				
				if (nota >=1 && nota < 5) {
					
					System.out.println("Nota GUTXI da.");
					
				} else if (nota >=5 && nota < 6){
					
					System.out.println("Nota NAHIKO da.");
					
				} else if (nota >= 6 && nota < 7) {
					
					System.out.println("Nota ONDO da.");
					
				} else if (nota >= 7 && nota < 9) {
					
					System.out.println("Nota OSO ONDO da.");
					
				} else if (nota >=9 && nota <= 10){
					
					System.out.println("Nota BIKAIN da.");
					
				} else { 
					System.out.println("UR A DISASTER.");
				}
			} 
			
			scan.close();	
			
		}

}
