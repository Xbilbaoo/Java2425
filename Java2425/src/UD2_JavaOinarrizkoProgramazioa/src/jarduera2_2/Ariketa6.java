package jarduera2_2;

import java.util.Scanner;

public class Ariketa6 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		int[] zenbakia = new int[3];
		double geiketa = 0;
		double batezbestekoa = 0;

		// Hiru zenbakien arteko geiketa eta batezbestekoa ateratzen du.

		System.out.println("Idatzi zenbaki bat");
		zenbakia[0] = scan.nextInt();

		System.out.println("Idatzi beste bat.");
		zenbakia[1] = scan.nextInt();

		System.out.println("Idatzi azkenekoa");
		zenbakia[2] = scan.nextInt();

		geiketa = zenbakia[0] + zenbakia[1] + zenbakia[2];
		
		batezbestekoa = geiketa / 3;

		System.out.println("Zenbakien batuera " + geiketa + " da. Eta batezbestekoa " + batezbestekoa + " da.");
		scan.close();
	}

}
