package UD3.jarduera3_1;

import java.io.*;
import java.util.Scanner;

public class Ariketa1 {

	public static void main(String[] args) throws IOException {
		
		// Aldagaiak
		
		// Fitxategia-ren Bidea definitu
		File file = new File("./files/UD3/kaixo-fitxategiak.txt");
		
		// Fitxategia irakurtzeko metodoak
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		Scanner scFile = new Scanner(file);
		
		// Stringaren bidez, fitxategiko lerro bakoitza irakurri
		String lerroa = br.readLine();
		
		// Programa Buffer eta Reader-a erabiltzan.
		
		while (lerroa != null) {
			
			System.out.println(lerroa);
			
			lerroa = br.readLine();
			
		}
		
		br.close();
		
		// Programa Scanner klasearekin
		
		System.out.println();
		
		while (scFile.hasNext()) {
			
			lerroa = scFile.nextLine();
			
			System.out.println(lerroa);
			
		}
		
		scFile.close();
		
	}

}