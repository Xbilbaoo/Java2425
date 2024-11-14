package UD2.jarduera2_2;

import java.util.Scanner;

public class Ariketa4 {

	public static void main(String[] args) {
		
		//Aldagaiak
		
		Scanner scan = new Scanner(System.in);
		int zenbakia1 = 0;
		
		//Programa honek zenbaki bat bakoitia edo bikoitia den zehazten du.
		
		System.out.println("Idatzi zenbaki oso bat. Bakoitia edo bikoitia den esango dizut.");
		zenbakia1 = scan.nextInt();
		
		if (zenbakia1%2 == 0){
			
			System.out.println("Zure zenbakia bikoitia da.");
		
		} else {
			
			System.out.println("Zure zenbakia bakoitia da.");
			
		}
		scan.close();
	}

}
