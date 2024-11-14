package jarduera2_5;

import java.util.Scanner;

public class Ariketa7 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		int[] zenbakiArrai;
		int i = 0;
		int luzeera = 0;
		int handiena = Integer.MIN_VALUE;

		// Programa

		System.out.println("zenbat luzeerako Arrai-a nahi duzu?");
		luzeera = scan.nextInt();
		zenbakiArrai = new int[luzeera];
		scan.close();

		for (i = 0; i < zenbakiArrai.length; i++) {

			zenbakiArrai[i] = (int) Math.floor(Math.random() * 10 + 1);

		}

		System.out.println();
		System.out.print(
				"Arrai-ko posizio bakoitzean 10 eta 1 arteko ausaz sortutako zenbakiez bete dut. Zenbakien arteko zenbaki altuena hurrengoa da:");

		for (i = 0; i < zenbakiArrai.length; i++) {

			if (zenbakiArrai[i] > handiena) {
				
				handiena = zenbakiArrai[i];
				
			}
		}
		System.out.print(" " + handiena);
		
		
	}

}
