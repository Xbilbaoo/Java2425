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

		File file = new File("./files/UD4/Aurikularrak.txt");
		Scanner scFile = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		String aurikularra = null;
		boolean badago = false;
		// CREATING AN ARRAYLIST FOR THE MODEL "AURIKULAR" //

		ArrayList<Aurikular> aurikularList = new ArrayList<Aurikular>();

		// THE PROGRAMM //

		arraiListBete(file, scFile, aurikularList);

		aurikularra = aurikularraEskatu(aurikularList, sc);

		badago = aurikularraKonprobatu(aurikularList, aurikularra);

		if (badago == true) {

			prezioaIgo(aurikularList, aurikularra);
			datuakGorde(file, aurikularList);

		} else {

			System.out.println("Aurikular modelo hori ez dago gure datuen harten. Programa amitutzat emango da.");
		}

		scFile.close();
		sc.close();
	}

	private static void arraiListBete(File file, Scanner scFile, ArrayList<Aurikular> aurikularList) {

		// VARIABLES //

		String line = null;
		String[] data;

		// METHOD //

		while (scFile.hasNext()) {

			// CREATE A NEW OBJECT TO FILL WITH VALUES FROM THE FILE //

			Aurikular aurikular = new Aurikular();

			// SPLIT THE VALUES FROM THE LINE //

			line = scFile.nextLine();
			data = line.split(";");

			// SET THE VALUES FROM SPLITTED ONES //

			aurikular.setModelo(data[0]);
			aurikular.setMarka(data[1]);
			aurikular.setPrezioa(Double.parseDouble(data[2]));
			aurikular.setStock(Integer.parseInt(data[3]));

			// ADD THE OBJECT TO THE ARRAYLIST //

			aurikularList.add(aurikular);

		}

		System.out.println("Datuak Gordeta!!");

	}

	private static String aurikularraEskatu(ArrayList<Aurikular> aurikularList, Scanner sc) {

		// VARIABLES //

		String aukera = null;

		// METHOD //

		System.out.println("Zein arikularren prezioa igo nahi duzu?");
		aukera = sc.nextLine();

		return aukera;

	}

	private static boolean aurikularraKonprobatu(ArrayList<Aurikular> aurikularList, String aurikularra) {

		// VARIABLES //

		int i = 0;

		// METHOD //

		for (i = 0; i < aurikularList.size(); i++) {

			if (aurikularra.equalsIgnoreCase(aurikularList.get(i).getModelo())) {

				return true;
			}
		}

		return false;

	}

	private static void prezioaIgo(ArrayList<Aurikular> aurikularList, String aurikularra) {

		// VARIABLES //

		int i = 0;
		int indizea = 0;

		// METHOD //

		for (i = 0; i < aurikularList.size(); i++) {

			if (aurikularra.equalsIgnoreCase(aurikularList.get(i).getModelo())) {

				aurikularList.get(i).setPrezioa(aurikularList.get(i).getPrezioa() + 10.00);
				indizea = i;

			}

		}

		System.out.println("Orain " + aurikularList.get(indizea).getModelo().toUpperCase() + " modeloaren prezioa "
				+ aurikularList.get(indizea).getPrezioa() + " da.");

	}

	private static void datuakGorde(File file, ArrayList<Aurikular> aurikularList) {

		// VARIABLES //

		int i = 0;

		// TRY-CATCH METHOD to SAVE THE VALUES //

		try {
			PrintWriter pw = new PrintWriter(file);

			for (i = 0; i < aurikularList.size(); i++) {

				pw.println(aurikularList.get(i).toString());

			}

			pw.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
