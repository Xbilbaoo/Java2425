package jarduera2_3;

public class Ariketa20 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		int zenbakia1 = 0;
		int zenbakia2 = 1;
		int i = 0;
		
		// Programa
		
		System.out.println("Fibonacci segidako lehenengo 10 zenbakiak:");
		
		System.out.print(zenbakia1 + ", ");
		System.out.print(zenbakia2 + ", ");
		
		for (i = 1; i <= 4; i ++) {
			
			zenbakia1 += zenbakia2;
			System.out.print(zenbakia1 + ", ");
			zenbakia2 += zenbakia1;
			System.out.print(zenbakia2 + ", ");

		}
	}

}
