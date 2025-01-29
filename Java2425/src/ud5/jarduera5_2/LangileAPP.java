package ud5.jarduera5_2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import ud5.jarduera5_2.ddbb.LangileConnect;
import ud5.jarduera5_2.models.Langilea;

public class LangileAPP {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		int aukera = 0;

		LangileConnect lancon = new LangileConnect();
		ArrayList<Langilea> langileList = new ArrayList<Langilea>();
		langileList = lancon.getLangileak();

		do {

			aukera = menuErakutsi(sc);

			switch (aukera) {
			case 1:

				soldatatikGorakoakBistaratu(sc, langileList);
				break;

			case 2:

				baloreenArtekoSoldatakBistaratu(sc, langileList);
				break;
				
			case 3:
				
				departamentukoLangileakBistaratu(sc, langileList);
				break;

			case 0:

				System.out.println("Agur!!");
				break;
			}

		} while (aukera != 0);

		sc.close();

	}

	private static int menuErakutsi(Scanner sc) {

		// VARIABLES //

		int aukera = 0;

		// THE MAIN MENU //

		System.out.println();
		System.out.println("===================================================================");
		System.out.println("|                       EMPRESA DATU BASEA                        |");
		System.out.println("===================================================================");
		System.out.println();
		System.out.println(" 1.- Sartutako soldatatik gora dauden langileak.");
		System.out.println(" 2.- Bi baloreen arteko saldatak dituen langileen datuak erakutsi.");
		System.out.println(" 3.- Sartutako departamentuko lagileak bistaratu.");
		System.out.println(" 0.- IRTEN");

		aukera = Integer.parseInt(sc.nextLine());

		return aukera;

	}

	private static void soldatatikGorakoakBistaratu(Scanner sc, ArrayList<Langilea> langileList) {

		// VARIABLES //

		float eskaera = 0;
		int i = 0;
		ArrayList<Langilea> soldataGoraList = new ArrayList<Langilea>();

		// METHOD TO SEARCH EMPLOYEES WITH HIGHER SALARY THAN THE INPUT OF THE USER //

		System.out.println("Idatzi soldata kantitate bat.");
		eskaera = Float.parseFloat(sc.nextLine());

		for (i = 0; i < langileList.size(); i++) {

			if (eskaera < langileList.get(i).getSalario()) {

				soldataGoraList.add(langileList.get(i));

			}
		}

		System.out.println("Hauek dira " + eskaera + " soldatatik gorako langileak:");

		for (i = 0; i < soldataGoraList.size(); i++) {

			System.out.println(soldataGoraList.get(i).toString());

		}

	}

	private static void baloreenArtekoSoldatakBistaratu(Scanner sc, ArrayList<Langilea> langileList) {

		// VARIABLES //

		int i = 0;
		float eskaera1 = 0;
		float eskaera2 = 0;
		float soldataHandia;
		float soldataTxikia;
		ArrayList<Langilea> baloreArteenList = new ArrayList<Langilea>();

		// METHOD TO SEARCH EMPLOYEES BETWEEN THE SALARY INPUTED BY THE USER //

		do {

			System.out.println("Idatzi soldata kantitate bat.");
			eskaera1 = Float.parseFloat(sc.nextLine());

			System.out.println("Idatzi beste soldata kantitate bat.");
			eskaera2 = Float.parseFloat(sc.nextLine());

		} while (eskaera1 == eskaera2);

		if (eskaera1 > eskaera2) {

			soldataHandia = eskaera1;
			soldataTxikia = eskaera2;

		} else {

			soldataHandia = eskaera2;
			soldataTxikia = eskaera1;

		}

		for (i = 0; i < langileList.size(); i++) {

			if (langileList.get(i).getSalario() >= soldataTxikia && langileList.get(i).getSalario() <= soldataHandia) {

				baloreArteenList.add(langileList.get(i));

			}
		}

		System.out.println("Hauek dira " + soldataTxikia + " eta " + soldataHandia + " artean dauden langileak: ");
		
		for (i = 0; i < baloreArteenList.size(); i++) {

			System.out.println(baloreArteenList.get(i).toString());

		}
		
	}
	
	private static void departamentukoLangileakBistaratu(Scanner sc, ArrayList<Langilea> langileList) {
		
		// VARIABLES //
		
		int i = 0;
		int aukera;
		ArrayList<Langilea> departamentuList = new ArrayList<Langilea>();
		
		// METHOD //
		
		do {
			
			aukera = menuTxikiaErakutsi(sc);
			
			switch(aukera) {
			
			case 1:
				
				
			}
			
		}while (aukera != 1 && aukera != 2 && aukera != 3 && aukera != 4 && aukera != 5 && aukera != 6);
	
		
	}

	private static int menuTxikiaErakutsi(Scanner sc) {
		
		int aukera;
		
		System.out.println("=========================");
		System.out.println("|    Departamentuak     |");
		System.out.println("=========================");
		System.out.println();
		System.out.println(" 1.- Ventas");
		System.out.println(" 2.- Marketing");
		System.out.println(" 3.- IT");
		System.out.println(" 4.- Recursos Humanos");
		System.out.println(" 5.- Contabilidad");
		System.out.println(" 6.- Logística");
		System.out.print("Zein sailako langileak ikusi nahi dituzu?");
		
		aukera = Integer.parseInt(sc.nextLine());
		return aukera;
	}

}
