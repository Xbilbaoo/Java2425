package UD4.jarduera4_10;

// IMPORTED PACKAGES //

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// IMPORTED MODELS //

import UD4.jarduera4_10.models.Ibilgailua;

public class IbilgailuAPP {

	public static void main(String[] args) throws IOException {
		
		// VARIABLES //
		
		File file = new File("./files/UD4/ibilgailuak.csv");
		Scanner scFile = new Scanner(file);
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
		
	}
}
