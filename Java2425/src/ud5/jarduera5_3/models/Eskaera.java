package ud5.jarduera5_3.models;

import java.sql.Date;

public class Eskaera {
	
	// ATRIBUTTES //
	
	private int id;
	private String idCliente;
	private Date fecha;
	
	// CONSTRUCTORS //
	
	public Eskaera() {
		
	}
	
	public Eskaera(int id, String idCliente, Date fecha) {
		
		this.id = id;
		this.idCliente = idCliente;
		this.fecha = fecha;
		
	}
	
	
	
	// GETTERS //
	
	public int getId() {
		
		return id;
		
	}
	
	public String getIdCliente() {
		
		return idCliente;
		
	}
	
	public Date getFecha() {
		
		return fecha;
		
	}
	
	
	
	// SETTERS //
	
	public void setId(int id) {
		
		this.id = id;
		
	}

	public void setIdCliente(String idCliente) {
		
		this.idCliente = idCliente;
		
	}

	public void setFecha(Date fecha) {
		
		this.fecha = fecha;
		
	}

	

	// TO STRING //
	
	@Override
	public String toString() {
		
		return "Eskaera [id=" + id + ", idCliente=" + idCliente + ", fecha=" + fecha + "]";
		
	}
	
	
	
	
}
