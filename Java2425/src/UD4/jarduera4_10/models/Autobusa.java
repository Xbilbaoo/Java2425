package UD4.jarduera4_10.models;

public class Autobusa extends Ibilgailua{

	// ATTRIBUTES //
	
	private boolean eskolarra;
	private int zutikJoatekoPlazak;
	
	
	
	
	
	// CONSTRUCTORS //
	
	public Autobusa() {
		
		super();
		
	}
	
	public Autobusa(boolean eskolarra, int zutikJoatekoPlazak) {
		
		super();
		this.eskolarra = eskolarra;
		this.zutikJoatekoPlazak = zutikJoatekoPlazak;
		
	}
	
	
	
	
	
	// GETTERS //

	public boolean isEskolarra() {
		
		return eskolarra;
		
	}
	
	public int getZutikJoatekoPlazak() {
		
		return zutikJoatekoPlazak;
		
	}
	
	
	
	
	
	// SETTERS //

	public void setEskolarra(boolean eskolarra) {
		
		this.eskolarra = eskolarra;
		
	}
	
	public void setZutikJoatekoPlazak(int zutikJoatekoPlazak) {
		
		this.zutikJoatekoPlazak = zutikJoatekoPlazak;
		
	}

	

	
	
	// TO STRING //
	
	@Override
	public String toString() {
		
		return "Autobusa [eskolarra=" + eskolarra + ", zutikJoatekoPlazak=" + zutikJoatekoPlazak + "]";
	
	}
	
	
	
	
	
	// METHODS //

			// METHOD TO SAVE EACH INSTANCE ON CSV LINE //
	
	public String saveData() {
		
		return getMatrikula() + ";" + getModeloa() + ";" + getPotentzia() + ";" + getPlazaKopurua()
		+ ";" + getKolorea() + ";" + eskolarra + ";" + zutikJoatekoPlazak;
		
	}
	
	

	

	
	
		
}
