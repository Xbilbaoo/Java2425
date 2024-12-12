package UD4.jarduera4_1.Models;

public class Pertsona {
	
	// ATTRIBUTES //
	
	private String izena;
	private int adina;
	private String dni;
	
	
	// CONSTRUCTORS //
	
	public Pertsona() {
	
	}
	
	
	
	
	
	// GETTERS //
	
	public String getIzena() {
		return izena;
	}
	
	public int getAdina() {
		return adina;
	}
	
	public String getDni() {
		return dni;
	}
	
	
	
	
	
	// SETTERS //
	
	public void setIzena(String izena) {
		this.izena = izena;
	}
	
	public void setAdina(int adina) {
		this.adina = adina;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
	
	// TO STRING METHOD //
	
	public String toString() {
		
		return "Pertsona [izena=" + izena + ", adina=" + adina + ", dni=" + dni + "]";
		
	}
	
	public String saveData() {
		
		return izena + ";" + adina + ";" + dni;
	}
}
