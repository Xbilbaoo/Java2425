package UD2.jarduera2_4;

import java.util.Scanner;

public class Ariketa8 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		Scanner scan = new Scanner (System.in);
		int i = 0;
		String webHelbidea1 = null;
		String puntua = ".";
		
		// Programa
		
		System.out.println("Idatzi webgune baten helbidea. Puntu bat agertzen denean lerro jauzi bat egingo dut");
		webHelbidea1 = scan.nextLine();
		
		for (i = 0; i < webHelbidea1.length(); i ++) {
			
			
			
			if (webHelbidea1.charAt(i) == puntua.charAt(0) ) {
				
				System.out.println();
				
			} else {
				
				System.out.print(webHelbidea1.charAt(i));
				
			}
		}
		
	}

}
