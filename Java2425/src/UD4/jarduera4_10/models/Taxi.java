package UD4.jarduera4_10.models;

public class Taxi extends Ibilgailua {

	// ATTRIBUTES //

	private int lizentziaZenbakia;

	// CONSTRUCTORS //

	public Taxi() {

	}

	public Taxi(int lizentziaZenbakia) {

		super();
		this.lizentziaZenbakia = lizentziaZenbakia;

	}

	// GETTERS //

	public int getLizentziaZenbakia() {

		return lizentziaZenbakia;

	}

	// SETTERS //

	public void setLizentziaZenbakia(int lizentziaZenbakia) {

		this.lizentziaZenbakia = lizentziaZenbakia;

	}

	
	
	
	
	// TO STRING //

	@Override
	public String toString() {

		return "Taxi [lizentziaZenbakia=" + lizentziaZenbakia + "]";

	}

	
	
	
	
	// METHODS //

		// METHOD TO SAVE EACH INSTANCE ON CSV LINE //

	public String saveData() {

		return getMatrikula() + ";" + getModeloa() + ";" + getPotentzia() + ";" + getPlazaKopurua()
				+ ";" + getKolorea() + ";" + lizentziaZenbakia;
	
	}
}
