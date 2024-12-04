package UD4.jarduera4_1;

// IMPORTED UTILS //

import java.util.ArrayList;
import java.util.Scanner;

// IMPORTED MODELS //

import UD4.jarduera4_1.Models.Pertsona;

public class PertsonaAPP {

	public static void main(String[] args) {
		
		// VARIABLES //
		
		Scanner sc = new Scanner(System.in);
		
			// CREATING THE ARRAYLIST FOR THE CLASS "PERTSONA" //
		
		ArrayList <Pertsona> pertsonaList = new ArrayList<Pertsona>();
		
			// OTHER VARIABLES //
		
		
		String izena = null;
		int aukera = 0;
		boolean izenaBadago = false;
		
		// PROGRAM //
		
		
		do {
			
			menuaErakutsi();
			aukera = Integer.parseInt(sc.nextLine());
			
			switch (aukera) {
			
			case 1:
				
				pertsonaSortu(sc, pertsonaList);
				break;
			
			case 2:
				
				izena = izenaEskatu(sc, pertsonaList);
				izenaBadago = izenaKonprobatu(izena, pertsonaList);
				
				if (izenaBadago == true) {
					
					adinaKontsultatu(pertsonaList, izena);
					break;
					
				} else {
					
					System.out.println("idatzi duzun izena ez dago gure datuen artean. Menura itzuliko zara.");
					break;
					
				}
			
			case 3: 
				
				
				
			}
			
		}while(aukera != 0);
		
		sc.close();
		
	}

	private static void menuaErakutsi() {
		
		System.out.println();
		System.out.println("================================================");
		System.out.println("  Ongi Etorri BeHuman-era. Zer egin nahi duzu? ");
		System.out.println("================================================");
		System.out.println();
		System.out.println(" 1.- PERTSONA BERRI BAT SORTIU");
		System.out.println(" 2.- PERTSONA BATEN ADINA KONSULTATU");
		System.out.println(" 3.- PERTSONA GUZTIEN DNI KONSULTATU");
		System.out.println(" 4.- KARAKTERE BATEN BIDEZ IZENA TOPATU");
		System.out.println(" 0.- IRTEN");
	}
	
	private static void pertsonaSortu(Scanner sc, ArrayList<Pertsona> pertsonaList) {
		
		// CREATE A NEW "PERTSONA" TO ADD TO THE ARRAYLIST //
		
		Pertsona pertsona = new Pertsona();
		
		// IMPORT THE VALUES OF THE OBJECT FROM THE KEYBOARD //
		
		System.out.println("Idatzi pertsonaren izena.");
		pertsona.setIzena(sc.nextLine());
		
		System.out.println("Idatzi pertsonaren adina.");
		pertsona.setAdina(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Idatzi pertsonaren DNI-a.");
		pertsona.setDni(sc.nextLine());
		
		// ADD THE OBJECT TO THE ARRAYLIST //
		
		pertsonaList.add(pertsona);
		System.out.println("Pertsona ondo sortu da!!");
		
	}
	
	private static String izenaEskatu(Scanner sc, ArrayList<Pertsona> pertsonaList) {
		
		// VARIABLES //
		
		String aukera = null;
		
		// METHOD //
		
		System.out.println();
		System.out.println("Idatzi pertsona baten izena");
		aukera = sc.nextLine();
		
		return aukera;
	}
	
	private static boolean izenaKonprobatu (String izena, ArrayList<Pertsona> pertsonaList) {
		
		// VARIABLES //
		
		int i = 0;
		boolean badago = false;
		
		// METHOD //
		
		for (i = 0; i < pertsonaList.size(); i ++) {
			
			if (izena.equalsIgnoreCase(pertsonaList.get(i).getIzena())) {
				
				badago = true;
				return badago;
			}
			
		}
		
		return badago;
		
	}
	
	private static void adinaKontsultatu(ArrayList<Pertsona> pertsonaList, String izena) {
		
		// VARIABLES //
		
		int i = 0;
		
		
		// METHOD //
		
		System.out.println();
		System.out.println(izena.toUpperCase() + " pertsonaren adina hurrengoa da: ");
		for (i = 0; i < pertsonaList.size(); i ++) {
			
			if(izena.equals(pertsonaList.get(i).getIzena())) {
				
				System.out.println(pertsonaList.get(i).getAdina());
				
			}
		
		}
	
	}
	
	
}
