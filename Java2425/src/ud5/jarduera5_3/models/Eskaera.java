package ud5.jarduera5_3.models;

import java.sql.Date;

public class Eskaera {

	// ATRIBUTTES //

	private int id;
	private String idCliente;
	private Date fecha;
	private String codPostal;

	// CONSTRUCTORS //

	public Eskaera() {

	}

	public Eskaera(int id, String idCliente, Date fecha, String codPostal) {

		this.id = id;
		this.idCliente = idCliente;
		this.fecha = fecha;
		this.codPostal = codPostal;

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

	public String getCodPostal() {

		return codPostal;

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

	public void setCodPostal(String codPostal) {

		this.codPostal = codPostal;

	}

	// TO STRING //

	@Override
	public String toString() {

		return "Eskaera [id=" + id + ", idCliente=" + idCliente + ", fecha=" + fecha + ", codPostal=" + codPostal + "]";

	}

}
