package jarduera2_5;

import java.util.Scanner;

public class Ariketa8 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		int i = 0;
		int[] zenbakiArrai = new int[10];
		int aukera = 0;
		int handiena = Integer.MIN_VALUE;
		int txikiena = Integer.MAX_VALUE;
		int batuketa = 0;
		int zenbakiEskatua = 0;
		int kont = 0;

		// Programa

		for (i = 0; i < zenbakiArrai.length; i++) {

			System.out.println("Idatzi zenbaki bat");
			zenbakiArrai[i] = scan.nextInt();

			if (zenbakiArrai[i] > handiena) {

				handiena = zenbakiArrai[i];

			}

			if (zenbakiArrai[i] < txikiena) {

				txikiena = zenbakiArrai[i];

			}
		}

		do {

			// Menua buklean egongo da 0 zenbakia sartu arte.
			System.out.println("Zer egin nahi duzu?");
			System.out.println("1.- Batuketa kalkulatu eta bistaratu.");
			System.out.println("2.- Zenbakirik altuena bistaratu.");
			System.out.println("3.- Zenbakirik txikiena bistaratu.");
			System.out.println("4.- Zenbakibat eskatu eta arrai-an zenbat biderrez agertzen den bistaratu.");
			System.out.println("0.- Irten.");
			aukera = scan.nextInt();

			// Switch metodoa if moduan da, baina, kasu bakotzean zer egin adierazten dut.
			switch (aukera) {

			case 0:

				// Irten.
				System.out.println("Agur.");
				break;

			case 1:
				
				// Batuketa kalkulatu eta bistaratu.
				for (i = 0; i < zenbakiArrai.length; i++) {

					batuketa += zenbakiArrai[i];

				}

				System.out.println("Sartu dituzun zenbakien batuketa, " + batuketa + " da.");
				break;

			case 2:

				// Zenbakirik altuena bistaratu.
				System.out.println("Sartu dituzun zenbakien arteko handiena, " + handiena + " da.");
				break;

			case 3:

				// Zenbakirik txikiena bistaratu.
				System.out.println("Sartu dituzun zenbakien arteko txikiena, " + txikiena + " da.");
				break;

			case 4:

				// Zenbakibat eskatu eta arrai-an zenbat biderrez agertzen den bistaratu.
				System.out.println("Idatzi Zenbaki bat");
				zenbakiEskatua = scan.nextInt();

				for (i = 0; i < zenbakiArrai.length; i++) {

					if (zenbakiArrai[i] == zenbakiEskatua) {

						kont++;
					}

				}

				System.out.println(zenbakiEskatua + " zenbakia " + kont + " biderrez agertzen da arrai-an.");
				break;

			}

		} while (aukera != 0);

	}

}