package UD4.jarduera4_10.models;

public class Ibilgailua {

	// ATTRIBUTES //
	
	private String matrikula;
	private String modeloa;
	private int potentzia;
	private int plazaKopurua;
	private Color kolorea;
	
	
	
	
	
	// CONSTRUCTORS //
	
	public Ibilgailua() {
		
	}

	public Ibilgailua(String matrikula, String modeloa) {
		
		this.matrikula = matrikula;
		this.modeloa = modeloa;
		
	}

	public Ibilgailua(String matrikula, String modeloa, int potentzia, int plazaKopurua, Color kolorea) {
		
		this.matrikula = matrikula;
		this.modeloa = modeloa;
		this.potentzia = potentzia;
		this.plazaKopurua = plazaKopurua;
		this.kolorea = kolorea;
		
	}

	
	
	
	
	// GETTERS //
	
	public String getMatrikula() {
		
		return matrikula;
		
	}
	
	public String getModeloa() {
		
		return modeloa;
		
	}
	
	public int getPotentzia() {
		
		return potentzia;
		
	}
	
	public int getPlazaKopurua() {
		
		return plazaKopurua;
		
	}
	
	public Color getKolorea() {
		
		return kolorea;
		
	}
	
	
	
	
	
	// SETTERS //
	
	public void setMatrikula(String matrikula) {
		
		this.matrikula = matrikula;
		
	}

	public void setModeloa(String modeloa) {
		
		this.modeloa = modeloa;
		
	}
	
	public void setPotentzia(int potentzia) {
		
		this.potentzia = potentzia;
		
	}
	
	public void setPlazaKopurua(int plazaKopurua) {
		
		this.plazaKopurua = plazaKopurua;
	
	}
	public void setKolorea(Color kolorea) {
	
		this.kolorea = kolorea;
		
	}

	
	
	
	
	// TOSTRING //

	public String toString() {
		return "Ibilgailu [matrikula=" + matrikula + ", modeloa=" + modeloa + ", potentzia=" + potentzia
				+ ", plazaKopurua=" + plazaKopurua + ", kolorea=" + kolorea + "]";
	}
}
