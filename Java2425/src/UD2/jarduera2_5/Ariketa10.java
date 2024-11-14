package UD2.jarduera2_5;

import java.util.Scanner;

public class Ariketa10 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		Scanner scan = new Scanner (System.in);
		String[] ikasleIzena = new String[2];
		String gazteena = null;
		int[] ikasleAdina = new int[2];
		int i = 0;
		int kopurua = 0;
		int adinBatuketa = 0;
		double adinBatazbestekoa = 0;
		int kontAdin = 0;
		int adinGazteena = Integer.MAX_VALUE;
		
		// Programa
		
		System.out.println("Zenbat ikasle dituzu klasean?");
		kopurua = scan.nextInt();
		ikasleIzena = new String[kopurua];
		ikasleAdina = new int[kopurua];
		
		for (i = 0; i < ikasleIzena.length; i ++) {
			
			System.out.println("Idatzi " + (i +1) + " posizioan gorde nahi duzun ikaslearen izena");
			ikasleIzena [i] = scan.next();
			
		}
		
		for (i = 0; i < ikasleAdina.length; i ++) {
			
			System.out.println("Idatzi " + ikasleIzena[i] + "-n adina.");
			ikasleAdina[i] = scan.nextInt();
		
		}
		
		// 20 urte edo gutxiago duten ikasleen kopurua.
		
		for (i = 0; i < ikasleAdina.length; i ++) {
			
			if (ikasleAdina[i] <= 20) {
				
				kontAdin ++;
				
			}
		}
		
		System.out.println();
		System.out.println("Zure klasean " + kontAdin + " pertsona daude 20 urte edo gutxiagorekin.");
		System.out.println();
		
		// Gelako batazbesteko adina.
		
		for (i = 0; i < ikasleAdina.length; i ++) {
			
			adinBatuketa = adinBatuketa + ikasleAdina[i];
		
		}
		
		adinBatazbestekoa = adinBatuketa / kopurua;
		
		System.out.println("Zure klaseko adin batazbestekoa " + adinBatazbestekoa + " da.");
		System.out.println();
		
		// Gelako ikaslerik gazteena eta bere izena
		
		for (i = 0; i < ikasleIzena.length; i ++) {
			
			if (ikasleAdina[i] < adinGazteena ) {
				
				gazteena = ikasleIzena[i];
				adinGazteena = ikasleAdina[i];
			
			}
		}
		
		System.out.println("Zure ikaslerik gazteena, " + gazteena + " da, eta " + adinGazteena + " urte ditu.");
	}
}