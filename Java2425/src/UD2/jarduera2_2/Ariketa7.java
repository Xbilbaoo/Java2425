package UD2.jarduera2_2;

import java.util.Scanner;

public class Ariketa7 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		int zenbakia1 = 0;

		// Programa honek erabiltzaileak emandako zenbakiaren arabera, zenbaki horri
		// dagokion asteko eguna zehaztatuko du.
		
		System.out.println("Idatzi 1 eta 7 arteko zenbaki bat ( biak barne).");
		zenbakia1 = scan.nextInt();
		
		while (zenbakia1 < 1 || zenbakia1 > 7) {
			
			System.out.println("Sartu 1 eta 7 artean");
			zenbakia1 = scan.nextInt();
		
		} if (zenbakia1 == 1) {
			
			System.out.println(zenbakia1 + "-ari dagokion asteko eguna, Astelehena da");
			
		} else if (zenbakia1 == 2) {
			
			System.out.println(zenbakia1 + "-ari dagokion asteko eguna, Martitzena da");
			
		} else if (zenbakia1 == 3) {
			
			System.out.println(zenbakia1 + "-ari dagokion asteko eguna, Eguaztena da");
			
		} else if (zenbakia1 == 4) {
			
			System.out.println( zenbakia1 + "-ari dagokion asteko eguna, Eguena da");
			
		} else if (zenbakia1 == 5) {
			
			System.out.println(zenbakia1 + "-ari dagokion asteko eguna, Barikua da");

		} else if (zenbakia1 == 6){
			
			System.out.println(zenbakia1 + "-ari dagokion asteko eguna, Zapatua da");

		} else {
			
			System.out.println(zenbakia1 + "-ari dagokion asteko eguna, Domeka da");

		}
		
		scan.close();
		
	}
}
