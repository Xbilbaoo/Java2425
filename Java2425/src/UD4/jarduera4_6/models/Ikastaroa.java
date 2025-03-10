package UD4.jarduera4_6.models;

import java.util.ArrayList;

public class Ikastaroa {
	
	private String izena;
	private String deskripzioa;
	private String irakaslea;
	private ArrayList<Ikaslea> ikasleak;
	
	
	
	public Ikastaroa() {
		
	}

	public Ikastaroa(String izena, String deskripzioa, String irakaslea, ArrayList<Ikaslea> ikasleak) {
		
		this.izena = izena;
		this.deskripzioa = deskripzioa;
		this.irakaslea = irakaslea;
		this.ikasleak = ikasleak;
		
	}

	
	
	public String getIzena() {
		return izena;
	}

	public String getDeskripzioa() {
		return deskripzioa;
	}

	public String getIrakaslea() {
		return irakaslea;
	}

	public ArrayList<Ikaslea> getIkasleak() {
		
		return ikasleak;
		
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public void setDeskripzioa(String deskripzioa) {
		this.deskripzioa = deskripzioa;
	}

	public void setIrakaslea(String irakaslea) {
		
		this.irakaslea = irakaslea;
		
	}
	
	public void ikasleaGehitu(Ikaslea ik) {
		
		ikasleak.add(ik);
		
	}

	@Override
	public String toString() {
		
		return "Ikastaroa [izena=" + izena + ", deskripzioa=" + deskripzioa + ", irakaslea=" + irakaslea;
		
	}
	
}
