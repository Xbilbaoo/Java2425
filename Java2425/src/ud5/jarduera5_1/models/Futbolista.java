package ud5.jarduera5_1.models;

public class Futbolista {
	
	private String nan;
	private String izena;
	private String abizena;
	private double soldata;
	private int idTaldea;
	
	public Futbolista() {
	}
	public Futbolista(String nan, String izena, String abizena) {
		this.nan = nan;
		this.izena = izena;
		this.abizena = abizena;
	}
	
	public Futbolista(String nan, String izena, String abizena, double soldata) {
		this.nan = nan;
		this.izena = izena;
		this.abizena = abizena;
		this.soldata = soldata;
	}
	public Futbolista(String nan, String izena, String abizena, double soldata, int idTaldea) {
		this.nan = nan;
		this.izena = izena;
		this.abizena = abizena;
		this.soldata = soldata;
		this.idTaldea = idTaldea;
	}
	public String getNan() {
		return nan;
	}
	public void setNan(String nan) {
		this.nan = nan;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getAbizena() {
		return abizena;
	}
	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}
	public double getSoldata() {
		return soldata;
	}
	public void setSoldata(double soldata) {
		this.soldata = soldata;
	}
	public int getIdTaldea() {
		return idTaldea;
	}
	public void setIdTaldea(int idTaldea) {
		this.idTaldea = idTaldea;
	}
	@Override
	public String toString() {
		return "Futbolista [nan=" + nan + ", izena=" + izena + ", abizena=" + abizena + ", soldata=" + soldata
				+ ", idTaldea=" + idTaldea + "]";
	}
}
