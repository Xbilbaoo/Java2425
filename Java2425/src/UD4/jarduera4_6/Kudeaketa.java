package UD4.jarduera4_6;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import UD4.jarduera4_6.models.Ikaslea;
import UD4.jarduera4_6.models.Ikastaroa;

public class Kudeaketa {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("files/UD4/46/ikasleak.csv");
		File file2 = new File("files/UD4/46/ikastaroak.csv");
		
		Scanner scFile1 = new Scanner(file1);
		Scanner scFile2 = new Scanner(file2);
		
		ArrayList<Ikastaroa> ikastaroList = new ArrayList<Ikastaroa>();
		ArrayList<Ikaslea> ikasleList = new ArrayList<Ikaslea>();
		
		ArrayListakBete(scFile1, scFile2, ikasleList, ikastaroList);
		
		scFile1.close();
		scFile2.close();
	}

	private static void ArrayListakBete(Scanner scFile1, Scanner scFile2, ArrayList<Ikaslea> ikasleList,
			ArrayList<Ikastaroa> ikastaroList) {
		
		String[] data;
		String line = null;

		Ikaslea ik;
		Ikastaroa ikas;
		
		while (scFile1.hasNext()) {
			
			line = scFile1.nextLine();
			data = line.split(";");
			
			
		}
		
	}

}
