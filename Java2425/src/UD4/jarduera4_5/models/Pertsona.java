package UD4.jarduera4_5.models;

public class Pertsona {
	
	// ATTRIBUTES //
	
	private String izena;
	private int adina;
	private String nan;
	private Sexua sexua;
	private double pisua;
	private double altuera;
	
	
	// CONSTRUCTORS //
	
	public Pertsona(String izena, int adina, String nan, Sexua sexua, double pisua, double altuera) {
		
		this.izena = izena;
		this.adina = adina;
		this.nan = nan;
		this.sexua = sexua;
		this.pisua = pisua;
		this.altuera = altuera;
		
	}
	
	public Pertsona() {
		
	}

	
	
	
	
	// GETTERS //
	
	public String getIzena() {
		
		return izena;
		
	}

	public int getAdina() {
		
		return adina;
		
	}
	
	public String getNan() {
		
		return nan;
		
	}
	
	public Sexua getSexua() {
		
		return sexua;
		
	}

	public double getPisua() {
		
		return pisua;
		
	}

	public double getAltuera() {
		
		return altuera;
		
	}
	
	
	
	
	
	// SETTERS //
	
	public void setIzena(String izena) {
		
		this.izena = izena;
		
	}
	
	public void setAdina(int adina) {
		
		this.adina = adina;
		
	}
	
	public void setNan(String nan) {
		
		this.nan = nan;
		
	}
	
	public void setSexua(Sexua sexua) {
		
		this.sexua = sexua;
		
	}
	
	public void setPisua(double pisua) {
		
		this.pisua = pisua;
		
	}
	
	public void setAltuera(double altuera) {
		
		this.altuera = altuera;
		
	}

	
	
	
	
	// TOSTRING //
	
	public String toString() {
		return "Pertsona [izena=" + izena + ", adina=" + adina + ", sexua=" + sexua + ", pisua=" + pisua + ", altuera="
				+ altuera + "]";
	}
	
	
	
	
	
	// METHODS //
	
		// METHOD TO CALCULATE THE IMC //
	
	public int kalkulatuIMC(double pisua, double altuera) {
		
		// VARIABLES //
		
		String kategoria = null;
		int imc = 0;
		double imcKalkulatua = 0;
		
		// METHOD //
		
		imcKalkulatua = pisua / (altuera*altuera);
		
			// IF ELSES TO CATEGORIZE THE IMC VALUE //
		
		if (imcKalkulatua < 20) {
			
			kategoria = "a";
			
		} else if (imcKalkulatua >= 20 && imcKalkulatua <= 25) {
			
			kategoria = "b";
			
		} else {
			
			kategoria = "c";
			
		}
		
			// SWITCH-CASE TO SET A NUMERICAL VALUE FOR EACH CATEGORY //
		
		switch (kategoria) {
		
		case "a":
			
			imc = -1;
			break;
			
		case "b":
			
			imc = 0;
			break;
			
		case "c":
			
			imc = 1;
			break;
		
		}
		
		return imc;
		
	}

		// METHOD TO SEE IF A PERSSON IS HIGH AGED OR NOT //
	
	public boolean adinezNagusi(int adina) {
		
		if (adina > 18) {
			
			return true;
			
		} else {
			
			return false;
			
		}
	}
	
		// METHOD TO SAVE EACH INSTANCE ON A LINE //
	
	public String saveData() {
		
		return izena + ";" + adina + ";" + nan + ";" + sexua + ";" + pisua + ";" + altuera;
	}
}


