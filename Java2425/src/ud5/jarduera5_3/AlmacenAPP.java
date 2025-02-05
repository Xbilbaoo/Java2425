package ud5.jarduera5_3;

import java.util.Scanner;

import ud5.jarduera5_3.ddbb.BezeroaConnect;
import ud5.jarduera5_3.ddbb.EskaeraConnect;
import ud5.jarduera5_3.ddbb.ProduktuaConnect;

public class AlmacenAPP {

	public static void main(String[] args) {

		BezeroaConnect bezcon = new BezeroaConnect();
		ProduktuaConnect procon = new ProduktuaConnect();
		EskaeraConnect eskcon = new EskaeraConnect();

		Scanner sc = new Scanner(System.in);
		int aukera = 0;

		do {

			aukera = menuaErakutsi(sc);

			switch (aukera) {

			case 1:

				bezeroakBistaratu(bezcon);
				break;

			case 2:

				produktuakBistaratu(procon);
				break;
				
			case 3:
				
				eskaerakBistaratu(eskcon);
				break;
				
			case 4:
				
				System.out.println("Hau da gure prodoktuen batazbesteko prezioa: " + procon.produktuenBatazBestekoaBistaratu() + "€");
				break;
				
			case 0:
				
				System.out.println("AGUR!!");
				break;
				
			default:
				
				System.out.println("ERROR sartu duzun zenbakia ez dago gure aukren artean.");
				break;
				
			}

		} while (aukera != 0);

		sc.close();
	}

	private static int menuaErakutsi(Scanner sc) {

		// VARIABLES //

		int aukera;

		// MAIN MENU OF THE PROGRAMM //

		System.out.println("======================================");
		System.out.println("|            STORE DDBB              |");
		System.out.println("======================================");
		System.out.println(" 1.- Bezero guztiak bistaratu.");
		System.out.println(" 2.- Produktu guztak bistaratu.");
		System.out.println(" 3.- Eskaerak ikusi.");
		System.out.println(" 4.- Produktuen batazbestekoa ikusi. ");
		System.out.println(" 0.- IRTEN");

		aukera = Integer.parseInt(sc.nextLine());

		return aukera;

	}

	private static void bezeroakBistaratu(BezeroaConnect bezcon) {

		// FOR LOOP TO SHOW ALL THE REGISTER OF THE TABLE "CLIENTES" OF THE DB //

		for (int i = 0; i < bezcon.getBezeroak().size(); i++) {

			System.out.println(bezcon.getBezeroak().get(i).toString());

		}
	}

	private static void produktuakBistaratu(ProduktuaConnect procon) {

		// FOR LOOP TO SHOW ALL THE REGISTER OF THE TABLE "PRODUCTOS" FROM THE DB //

		for (int i = 0; i < procon.getProduktuak().size(); i++) {

			System.out.println(procon.getProduktuak().get(i).toString());

		}

	}
	
	private static void eskaerakBistaratu(EskaeraConnect eskcon) {
		
		// FOR LOOP TO SHOW ALL THE REGISTER OF THE TABLE "PEDIDOS" FROM THE DB //
		
		for (int i = 0; i < eskcon.getEskaerak().size(); i ++) {
			
			System.out.println(eskcon.getEskaerak().get(i).toString());
			
		}
		
	}
	
	
}
