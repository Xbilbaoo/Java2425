package UD2.jarduera2_5;

import java.util.Scanner;

public class Ariketa3 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		int[] zenbakiArrai;
		int i = 0;
		int luzeera = 0;

		// Programa

		System.out.println("zenbat luzeerako Arrai-a nahi duzu?");
		luzeera = scan.nextInt();
		zenbakiArrai = new int[luzeera];
		scan.close();
		
		for (i = 0; i < zenbakiArrai.length; i++) {

			zenbakiArrai[i] = (int) Math.floor(Math.random() * 10 + 1);
			
		}

		
		
		
		System.out.println("Arrai-ko posizio bakoitzean 10 eta 1 arteko ausaz sortutako zenbakiez bete dut. Posizio bakoitzeko zenbakiak hurrengoak dira:");
		System.out.println();
		
		
		
		for (i = 0; i < zenbakiArrai.length; i++) {

			System.out.println(i + " posizioan dagoen zenbakia, " + zenbakiArrai[i] + " da.");
			
		}
	}

}
