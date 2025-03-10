package UD4.jarduera6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import UD4.jarduera6.models.Erabiltzailea;

public class ErabKudeaketa {

	public static void main(String[] args) throws FileNotFoundException {
			
			File file = new File("files/UD4/erabiltzaileak.txt");
			Scanner scFile = new Scanner(file);
		
		ArrayList<Erabiltzailea> eList = new ArrayList<Erabiltzailea>();
		
		eList = datuakKargatu(scFile);
		
		erabiltzaileakIkusi(eList);
		
		datuakGorde(eList, file);
		
		scFile.close();
		
	}

	private static void erabiltzaileakIkusi(ArrayList<Erabiltzailea> eList) {
		
		for (int i = 0; i < eList.size(); i ++) {
			
			System.out.println(eList.get(i).toString());
			
		}
		
	}

	private static void datuakGorde(ArrayList<Erabiltzailea> erabiltzaileList, File file) {
		
		try {
			PrintWriter pw = new PrintWriter(file);
			
			for (int i = 0; i < erabiltzaileList.size(); i ++) {
				
				pw.println(erabiltzaileList.get(i).saveData());
			
			}
			
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static ArrayList<Erabiltzailea> datuakKargatu(Scanner scFile) {
		
		ArrayList<Erabiltzailea> eList = new ArrayList<Erabiltzailea>();
		String[] data;
		String line;
		Erabiltzailea e;
		
		while(scFile.hasNext()) {
			
			e = new Erabiltzailea();
			line = scFile.nextLine();
			data = line.split(":");
			
			e.setId(Integer.parseInt(data[0]));
			e.setFirstName(data[1]);
			e.setSecondName(data[2]);
			e.setUsername(data[3]);
			e.setActive(Boolean.parseBoolean(data[4]));
			
			eList.add(e);
			
		}
		
		return eList;
	}

}
