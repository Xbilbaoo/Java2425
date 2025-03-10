package UD4.jarduera8.models;

import java.text.DecimalFormat;

public class Figure2D {
	
	private float height;
	private float width;
	
	
	
	public Figure2D() {
		
	}
	
	public Figure2D(float height, float width) {
		
		this.height = height;
		this.width = width;
		
	}

	
	
	public float getHeight() {
		return height;
	}

	public float getWidth() {
		return width;
	}

	
	
	public void setHeight(float height) {
		this.height = height;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	
	
	@Override
	public String toString() {
		return "Figure2D [height=" + height + ", width=" + width + "]";
	}
	
	public void seeDimensions() {
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Altuera(" + df.format(height) + ") eta zabalera(" + df.format(width) + ")");
		
	}
	
}


