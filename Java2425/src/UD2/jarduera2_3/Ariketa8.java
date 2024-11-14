package UD2.jarduera2_3;

public class Ariketa8 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		int i = 0;
		int batuketa = 0;
		
		// Programa
		
		for (i = 30; i <= 50; i ++) {
			
			if (i % 2 == 1) {
				
				batuketa = i + batuketa;
			}
		}
		
		System.out.println( batuketa );

	}

}
