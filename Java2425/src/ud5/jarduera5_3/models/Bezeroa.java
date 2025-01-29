package ud5.jarduera5_3.models;

public class Bezeroa {
	
	// ATRIBUTTES //
	
	private String id;
	private String nombre;
	private String direccion;
	private String codPostal;
	private String telefono;
	
	
	
	// CONSTRUCTORS //
	
	public Bezeroa() {
		
	}
	
	public Bezeroa(String id, String nombre, String direccion, String codPostal, String telefono) {
		
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.telefono = telefono;
		
	}
	
	
	
	// GETTERS //

	public String getId() {
		
		return id;
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public String getDireccion() {
		
		return direccion;
		
	}
	
	public String getCodPostal() {
		
		return codPostal;
		
	}
	
	public String getTelefono() {
		
		return telefono;
		
	}
	
	
	
	// SETTERS //

	public void setId(String id) {
		
		this.id = id;
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public void setDireccion(String direccion) {
		
		this.direccion = direccion;
		
	}
	
	public void setCodPostal(String codPostal) {
		
		this.codPostal = codPostal;
		
	}
	
	public void setTelefono(String telefono) {
		
		this.telefono = telefono;
		
	}

	
	
	// TO STRING //
	
	@Override
	public String toString() {
		return "Bezeroa [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", codPostal=" + codPostal
				+ ", telefono=" + telefono + "]";
	}
	
}
