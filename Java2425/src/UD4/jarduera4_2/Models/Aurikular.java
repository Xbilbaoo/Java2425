package UD4.jarduera4_2.Models;

public class Aurikular {
	
	// ATTRIBUTES //
	
	private String modelo;
	private String marka;
	private double prezioa;
	private int stock;
	
	
	
	
	
	// CONSTRUCTORS //
	
	public Aurikular() {
		
	}

	public Aurikular(String modelo, String marka, double prezioa, int stock) {
		
		this.modelo = modelo;
		this.marka = marka;
		this.prezioa = prezioa;
		this.stock = stock;
		
	}
	
	
	
	
	
	// GETTERS //

	public String getModelo() {
		
		return modelo;
		
	}
	
	public String getMarka() {
		
		return marka;
		
	}
	
	public double getPrezioa() {
		
		return prezioa;
		
	}
	
	public int getStock() {
		
		return stock;
		
	}
	
	
	
	
	
	// SETTERS //
	
	public void setModelo(String modelo) {
		
		this.modelo = modelo;
		
	}

	public void setMarka(String marka) {
		
		this.marka = marka;
		
	}

	public void setPrezioa(double prezioa) {
		
		this.prezioa = prezioa;
		
	}

	public void setStock(int stock) {
		
		this.stock = stock;
		
	}

	
	
	
	
	// TOSTRING METHOD //
	
	public String toString() {
		
		return modelo + ";" + marka + ";" + prezioa + ";" + stock;
		
	}

}
