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
		
		float eskaera = 0;
		int i = 0;
		ArrayList<Langilea> soldataGoraList = new ArrayList<Langilea>();
		
		System.out.println("Idatzi soldata kantitate bat.");
		eskaera = Float.parseFloat(sc.nextLine());
		
		for (i = 0; i < langileList.size(); i ++) {
			
			if (eskaera < langileList.get(i).getSalario()) {
				
				soldataGoraList.add(langileList.get(i));
				
			}
		}
		
		System.out.println("Hauek dira " + eskaera + " soldatatik gorako langileak:");
		
		for (i = 0; i < soldataGoraList.size(); i ++) {
			
			System.out.println(soldataGoraList.get(i).toString());
			
		}
		
	}

}
