package jarduera2_4;

public class Ariketa10 {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		String esaldia1 = "ABCD";
		byte[] arrai_byte=esaldia1.getBytes();
		
		// Programa
		
		System.out.println("ABCD karaktereen ASCII Kodea erakutziko dizut.");
		
		for (int i = 0;i < arrai_byte.length; i ++){
			
			System.out.println(esaldia1.charAt(i) + " karakterearen ASCII kodea: " + arrai_byte[i] + " ");
			
		}
	}

}
