package UD4.jarduera4_4.models;

public class Elikagaia {

	// ATTRIBUTES //

	private String izena;
	private String egoera;
	private double kaloriak;
	private double koipeak;
	private double proteinak;
	private double karbohidratoak;
	private String mota;

	// CONSTRUCTORS //

	public Elikagaia() {

	}

	public Elikagaia(String izena, String egoera, double kaloriak, double koipeak, double proteinak,
			double karbohidratoak, String mota) {

		this.izena = izena;
		this.egoera = egoera;
		this.kaloriak = kaloriak;
		this.koipeak = koipeak;
		this.proteinak = proteinak;
		this.karbohidratoak = karbohidratoak;
		this.mota = mota;

	}

	// GETTERS //

	public String getIzena() {

		return izena;

	}

	public String getEgoera() {

		return egoera;

	}

	public double getKaloriak() {

		return kaloriak;

	}

	public double getKoipeak() {

		return koipeak;

	}

	public double getProteinak() {

		return proteinak;

	}

	public double getKarbohidratoak() {

		return karbohidratoak;

	}

	public String getMota() {

		return mota;

	}

	// SETTERS //

	public void setIzena(String izena) {

		this.izena = izena;

	}

	public void setEgoera(String egoera) {

		this.egoera = egoera;

	}

	public void setKaloriak(double kaloriak) {

		this.kaloriak = kaloriak;

	}

	public void setKoipeak(double koipeak) {

		this.koipeak = koipeak;

	}

	public void setProteinak(double proteinak) {

		this.proteinak = proteinak;

	}

	public void setKarbohidratoak(double karbohidratoak) {

		this.karbohidratoak = karbohidratoak;

	}

	public void setMota(String mota) {

		this.mota = mota;

	}

	
	
	
	
	
	// TOSTRING //
	
	public String toString() {
		
		return "Elikagaia [izena=" + izena + ", egoera=" + egoera + ", kaloriak=" + kaloriak + ", koipeak=" + koipeak
				+ ", proteinak=" + proteinak + ", karbohidratoak=" + karbohidratoak + ", mota=" + mota + "]";
		
	}
	
	
	
	
	
	// METHOD TO SAVE EACH OBJECT ON THE FILE //

	public String saveData() {

		return izena + ";" + egoera + ";" + kaloriak + ";" + koipeak + ";" + proteinak + ";" + karbohidratoak + ";"
				+ mota;

	}

}
