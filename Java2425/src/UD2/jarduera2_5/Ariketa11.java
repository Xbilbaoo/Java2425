package UD2.jarduera2_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ariketa11 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		Scanner scan = new Scanner (System.in);
		String[] astekoEgunak = new String[7];
		String beroena = null;
		double[] astekoTempC = new double[7];
		double[] astekoTempF = new double[7];
		double tempTotalF = 0;
		double batazbestekoaTemp = 0;
		double tempBeroenaC = Integer.MIN_VALUE;
		double tempBeroenaF = 0;
		int i = 0;
		DecimalFormat formato = new DecimalFormat("#0.00");
		
		
		// Asteko egunak definitu
		
		astekoEgunak[0] = "Astelehena";
		astekoEgunak[1] = "Martitzena";
		astekoEgunak[2] = "Eguaztena";
		astekoEgunak[3] = "Eguena";
		astekoEgunak[4] = "Barikua";
		astekoEgunak[5] = "Zapartua";
		astekoEgunak[6] = "Domeka";
		
		
		
		// Programa
		
		for (i = 0; i < astekoTempC.length; i ++) {
			
			System.out.println("Zenbat temepretura (Celsius Graduetan) egin du " + astekoEgunak[i] + " egunenan?");
			astekoTempC[i] = scan.nextDouble();
			
			// Celsius-etatik, Farenheit graduetara pasatu.
			astekoTempF[i] = (astekoTempC[i] * 1.8) + 32;
			
		}
		
		
		
		// Asteko batazbesteko tenperatura F graduetan.
		
		for (i = 0; i < astekoTempF.length; i ++) {
			
			tempTotalF += astekoTempF[i];
			
		}
		
		batazbestekoaTemp = tempTotalF / 7;
		
		System.out.println();
		System.out.println("Asteko batazbestekoa " + (formato.format(batazbestekoaTemp)) + "Fº dira.");
		System.out.println();
		
		
		
		// Egunik beroena.
		
		for (i = 0; i < astekoTempC.length; i ++) {
			
			if (astekoTempC[i] > tempBeroenaC) {
				
				tempBeroenaC = astekoTempC[i];
				beroena = astekoEgunak[i];
				tempBeroenaF = astekoTempF[i];
				
			}
		}
		
		System.out.println("Asteko egun beroena " + beroena + " da, " + tempBeroenaC + "Cº-kin (" + tempBeroenaF + "Fº).");
		System.out.println();
		
		
		
		// Batazbestekotik gora dauden egunak.
		
		System.out.println("Egun hauek batazbestekotik gora daude:");
		for (i = 0; i < astekoTempF.length; i ++) {
			
			if (astekoTempF[i] > batazbestekoaTemp) {
				
				System.out.println(astekoEgunak[i] + " (" + astekoTempC[i] + "Cº)");
				
			}
		}
	}

}