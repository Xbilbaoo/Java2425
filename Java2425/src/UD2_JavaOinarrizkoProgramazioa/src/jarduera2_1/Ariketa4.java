package jarduera2_1;

import java.util.Scanner;

public class Ariketa4 {

	public static void main(String[] args) {
		// Aldagaiak
		Scanner scan = new Scanner(System.in);
		int zenbakia1;
		int zenbakia2;
		int emaitza;

		// Programa honek erabiltzaileak emandako 2 zenbakien batura egiten da.
		System.out.println("Idatzi zenbaki bat.");
		zenbakia1 = scan.nextInt();
		System.out.println("Idatzi beste zenbaki bat.");
		zenbakia2 = scan.nextInt();

		// Funtzio honekin eskatutako bi zenbakien batura kalkulatzen da.
		emaitza = zenbakia1 + zenbakia2;

		System.out.println(emaitza);
		scan.close();
	}
}
