package UD2.jarduera2_5;

public class Ariketa9 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		String[] arrHile = new String[5];
		int[] arrLtr = new int[5];
		int i = 0;
		int euritsuena = Integer.MIN_VALUE;
		String hileEuritsuena = null;
		
		//Arrai bakoitzeko balioak
		
		arrHile[0] = "Urtarrila";
		arrHile[1] = "Otsaila";
		arrHile[2] = "Martxoa";
		arrHile[3] = "Apirila";
		arrHile[4] = "Maiatza";
		
		arrLtr[0] = 123;
		arrLtr[1] = 333;
		arrLtr[2] = 180;
		arrLtr[3] = 211;
		arrLtr[4] = 90;
		
		// Programa
		
		// Hilabete bakoitzean egin duen euri litro kopurua bistaratu.
		for (i = 0; i < arrHile.length; i ++) {
			
			System.out.println(arrHile[i] + "-n " + arrLtr[i] + " l/m2 -ko, euria egin du.");
			
		}
		
		System.out.println();
		
		// Kalkulatu zein izan den hilabeterik euritsuena. Bistaratu hilabetea eta litroak.
		for (i = 0; i < arrHile.length; i ++) {
			
			if (arrLtr[i] > euritsuena) {
				
				euritsuena = arrLtr[i];
				hileEuritsuena = arrHile[i];
			
			}
		}
		
		System.out.println("Hilabeta euritsuena " + hileEuritsuena + " izan da, " + euritsuena + " litro metro karratuko euriarekin.");
	}

}
