package UD4.jarduera4_3.models;

import java.util.Arrays;

public class Animalia {

	// ATTRIBUTES //

	private String izena;
	private String espeziea;
	private int adina;
	private String[] habitat;

	// CONSTRUCTORS //

	public Animalia() {

	}

	// GETTERS //

	public String getIzena() {

		return izena;

	}

	public String getEspeziea() {

		return espeziea;

	}

	public int getAdina() {

		return adina;

	}

	public String[] getHabitat() {

		return habitat;

	}

	// SETTERS //

	public void setIzena(String izena) {

		this.izena = izena;

	}

	public void setEspeziea(String espeziea) {

		this.espeziea = espeziea;

	}

	public void setAdina(int adina) {

		this.adina = adina;

	}

	public void setHabitat(String[] habitat) {

		this.habitat = habitat;

	}

	
	
	
	
	// METHOD TO SAVE THE DATA IN A FILE //
	
	public String saveData() {

		return izena + "::" + espeziea + "::" + adina + "::" + habitat[0] + "::" + habitat[1] + "::" + habitat[2];
		
	}
	
	
	
	
	
	// TOSTRING METHOD //
	
	public String toString() {
		
		return "izena: " + izena + ", espeziea: " + espeziea + ", adina: " + adina + ", habitat: "
				+ Arrays.toString(habitat);
		
	}
	
	

}
