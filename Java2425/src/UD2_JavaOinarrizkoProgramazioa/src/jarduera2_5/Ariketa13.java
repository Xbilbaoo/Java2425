package jarduera2_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ariketa13 {

	public static void main(String[] args) {

		// Aldagaiak

		Scanner scan = new Scanner(System.in);
		String[] ikasleIzena = new String[0];
		double[] ikasleNota = new double[0];
		double notaTotal = 0;
		double batazbestekoNota = 0;
		int kopurua = 0;
		int i = 0;
		DecimalFormat formato = new DecimalFormat("#0.00");

		// Programa

		System.out.println("Zenbat ikasle dituzu zure gelan?");
		kopurua = scan.nextInt();

		ikasleIzena = new String[kopurua];
		ikasleNota = new double[kopurua];

		// Ikasle bakoitzaren Izena eskatu.

		for (i = 0; i < kopurua; i++) {

			System.out.println("Idatzi " + (i + 1) + " posizioan gorde nahi duzun Izena.");
			ikasleIzena[i] = scan.next();
			
			System.out.println("Idatzi " + ikasleIzena[i] + " ikaslearen nota.");
			ikasleNota[i] = scan.nextDouble();

		}

		// Gelako ikasleen batazbesteko nota kalkulatu

		for (i = 0; i < kopurua; i++) {

			notaTotal += ikasleNota[i];

		}

		batazbestekoNota = notaTotal / kopurua;

		System.out.println();
		System.out.println("Gelako batazbestekoa: " + formato.format(batazbestekoNota));
		System.out.println();

		// Batazbestetik gora dauden ikasleen notak erakutsi.
		for (i = 0; i < kopurua; i++) {

			if (ikasleNota[i] > batazbestekoNota) {

				System.out.println(ikasleIzena[i] + " ikaslea batazbestetik gora dago hurrengo notarekin: " + ikasleNota[i]);

			}
		}
	}

}