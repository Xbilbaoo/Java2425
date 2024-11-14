package jarduera2_6;

import java.util.Scanner;

public class Ariketa1 {

	public static void main(String[] args) {
		
		// ALdagaiak
		
		Scanner sc = new Scanner (System.in);
		double diruKopurua = 0;
		double dollar = 0;
		
		// Programa
		
		System.out.println("Zenbat diru daukazu boltsikoan? Euro-etatik Dollar-retara itzuliko dizut zure diru kopurua.");
		diruKopurua = sc.nextDouble();
		
		System.out.println("Zebaten dago Dollar-a, euroakiko?");
		dollar = sc.nextDouble();
		
		System.out.println("Dollar-a " + dollar + " eurotan dagoela kontuan izanda, " + diruaAldatu(diruKopurua, dollar) + " dollar dituzu boltsikoan.");
		
	}
	
	public static double diruaAldatu (double diruKopurua, double dollar) {
		
		diruKopurua *= dollar;
		
		return diruKopurua;

	}

}
