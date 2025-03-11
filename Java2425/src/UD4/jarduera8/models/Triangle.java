package UD4.jarduera8.models;

public class Triangle extends Figure2D {

	private String style;
	
	
	public Triangle(String style) {
		
		super();
		this.style = style;
		
	}

	
	public Triangle(float height, float width, String style) {
		
		super(height, width);
		this.style = style;
		
	}
	
	
	
	public String getStyle() {
		return style;
	}


	public void setStyle(String style) {
		this.style = style;
	}


	public float calculateArea() {
		
		float area = (getWidth() * getHeight()) / 2;
		return area;
		
	}
	
	public void seeStyle() {
		
		System.out.println("Triangeluaren estiloa: " + style);
		
	}
}
