package UD4.jarduera8;

import UD4.jarduera8.models.Figure2D;
import UD4.jarduera8.models.Triangle;

public class TriangeluAPP {

	public static void main(String[] args) {
		
		Triangle t = new Triangle(24.85664f, 56.34534f, "isoszelea");
		
		System.out.println("Triangeluaren area: " + t.calculateArea());
		t.seeStyle();
	}

}
