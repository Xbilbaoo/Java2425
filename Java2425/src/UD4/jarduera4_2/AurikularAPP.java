package UD4.jarduera4_2;

// IMPORTED PACKAGES //
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// IMPORTED MODELS //
import UD4.jarduera4_2.Models.Aurikular;

public class AurikularAPP {

	public static void main(String[] args) throws IOException {
		
		// VARIABLES //
		
		File file = new File(".files/UD4/Aurikularrak.txt");
		Scanner scFile = new Scanner(file);
		
			// CREATING AN ARRAYLIST FOR THE MODEL "AURIKULAR" //
		
		ArrayList<Aurikular> aurikularList = new ArrayList<Aurikular>();
		
		// THE PROGRAMM //
		
		arraiListBete(file, scFile, aurikularList);
	}

	private static void arraiListBete(File file, Scanner scFile, ArrayList<Aurikular> aurikularList) {
		
		// VARIABLES //
		
		String line = null;
		String[] data;
		
		// METHOD //
		
		while (scFile.hasNext()) {
			
			// CREATE A NEW OBJECT TO FILL WITH VALUES FROM THE FILE //
			
			Aurikular aurikular = new Aurikular();
			
			// THE 
			line = scFile.nextLine();
			data = line.split(";");
			
			aurikular.setModelo(data[0]);
			aurikular.setMarka(data[1]);
			aurikular.setPrezioa(Double.parseDouble(data[2]));
			aurikular.setStock(Integer.parseInt(data[3]));
			
			aurikularList.add(aurikular);
			
		}

	}
	
	

}
