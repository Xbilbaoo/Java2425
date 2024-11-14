package UD2.jarduera2_3;

public class Ariketa9 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		int i = 0;
		int j = 0;
		int batuketa = 0;
		
		// Programa
		
		for (i = 1; i <= 100; i ++) {
			
			if (i % 2 == 0) {
				
				batuketa += i;
				j ++;
			}
		}
		
		System.out.println("Zenbakia batuketa " + batuketa + " da. Eta " + j + " zenbaki gehitu dira." );
	}

}
