package UD4.jarduera4_10;

// IMPORTED PACKAGES //

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import UD4.jarduera4_10.models.Color;

// IMPORTED MODELS //

import UD4.jarduera4_10.models.Ibilgailua;
import UD4.jarduera4_10.models.Taxi;

public class IbilgailuAPP {

	public static void main(String[] args) throws IOException {
		
		// VARIABLES //
		
		File file1 = new File("./files/UD4/410/ibilgailuak.csv");
		File file2 = new File("./files/UD4/410/Taxi.csv");
		File file3 = new File("./files/UD4/410/autobusak.csv");
		Scanner scFile1 = new Scanner(file1);
		Scanner scFile2 = new Scanner(file2);
		
		Scanner sc = new Scanner(System.in);
		int aukera = 0;
		
			// ARRAYLIST FOR THE MODEL "IBILGAILUA" //
		
		ArrayList<Ibilgailua> ibilgailuList = new ArrayList<Ibilgailua>();
		
		
		
		
		
		// THE PROGRAMM //
		
		do {
			
			menuaErakutsi();
			aukera = Integer.parseInt(sc.nextLine());
			
			switch(aukera) {
			
			case 1:
				
				taxiaSortu(sc, ibilgailuList);
			}
			
		} while(aukera != 0);
	}





	// METHODS //
		
		// THE MAIN MENU //
	
	private static void menuaErakutsi() {
		
		System.out.println();
		System.out.println("============================================");
		System.out.println("|    Ongi Etorri. Zer egin nahi duzu?      |");
		System.out.println("============================================");
		System.out.println();
		System.out.println(" 1.- TAXI BATEN DATUAK SARTU.");
		System.out.println(" 2.- AUTOBUS BATEN DATUAK SARTU.");
		System.out.println(" 3.- KOTXE BATEN DATUAK SARTU.");
		System.out.println(" 4.- TAXI BATEN LIZENTZIA ZENBAKIA IKUSTEA.");
		System.out.println(" 5.- AUTOBUS GUZTIEN PLAZA KOPURUA IKUSI.");
		System.out.println(" 6.- DATUAK GORDE.");
		System.out.println(" 0.- IRTEN.");
		
	}
	
		// METHOD TO CREATE AN INSTANCE OF A TAXI //
	
	private static void taxiaSortu(Scanner sc, ArrayList<Ibilgailua> ibilgailuList) {
		
		// CREATE A NEW INTANCE OF THE CLASS TAXI //
		
		Taxi taxi = new Taxi();
		
		// INSERT THE VALUES OF THE INSTANCE VIA KEYBOARD //
		
		System.out.println("Idatzi taxiaren lizentzia zebakia.");
		taxi.setLizentziaZenbakia(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Idatzi taxiaren matrikula.");
		taxi.setMatrikula(sc.nextLine());
		
		System.out.println("Idatzi taxiaren modeloa");
		taxi.setModeloa(sc.nextLine());
		
		System.out.println("Idatzi taxiaren plaza kopurua.");
		taxi.setPlazaKopurua(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Idatzi taxiak duen potentzia.");
		taxi.setPotentzia(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Idatzi taxiaren kolorea (ZURIA, BELTZA, URDINA)");
		taxi.setKolorea(Color.valueOf(sc.nextLine().toUpperCase()));
		
		// ADD THE INTANCE TO THE ARRAYLIST //
		
		ibilgailuList.add(taxi);
		
	}
}
